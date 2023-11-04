package co.uk.basedapps.vpn.storage

import android.content.SharedPreferences
import co.uk.basedapps.vpn.common.prefs.delegate
import co.uk.basedapps.vpn.common.prefs.getValue
import co.uk.basedapps.vpn.common.prefs.setValue
import co.uk.basedapps.vpn.network.model.City
import co.uk.basedapps.vpn.network.model.Country
import co.uk.basedapps.vpn.network.model.Protocol
import com.google.gson.Gson
import javax.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map

class BasedStorage
@Inject constructor(
  private val plainStorage: PlainStorage,
  private val secureStorage: SecureStorage,
  private val gson: Gson,
  prefs: SharedPreferences,
) {

  private var tokenPref: String by prefs.delegate("device_token", "")

  private val selectedCityDelegate = prefs.delegate("selected_city", "")
  private var selectedCityPref: String by selectedCityDelegate

  private var protocolPref by prefs.delegate("selected_protocol", "")

  fun storeToken(token: String) {
    tokenPref = token
  }

  fun getToken(): String = tokenPref

  fun clearToken() {
    tokenPref = ""
  }

  fun storeSelectedCity(country: Country, city: City) {
    val selectedCity = SelectedCity(
      id = city.id,
      name = city.name,
      countryId = country.id,
      countryName = country.name,
      countryFlag = country.flag,
    )
    val selectedCityJson = gson.toJson(selectedCity)
    selectedCityPref = selectedCityJson
  }

  fun observeSelectedCity(): Flow<SelectedCity?> =
    selectedCityDelegate.observe
      .map { cityJson -> gson.fromJson(cityJson, SelectedCity::class.java) }
      .catch { emit(null) }

  fun storeVpnProtocol(protocol: Protocol) {
    protocolPref = protocol.strValue
  }

  fun getVpnProtocol(): Protocol = Protocol.fromString(protocolPref)

  fun storeKeyValue(key: String, value: String, isSecure: Boolean) {
    when {
      isSecure -> secureStorage.storeKeyValue(key, value)
      else -> plainStorage.storeKeyValue(key, value)
    }
  }

  fun retrieveKeyValue(key: String): Pair<String, Boolean>? =
    secureStorage.retrieveKeyValue(key)?.let { it to true }
      ?: plainStorage.retrieveKeyValue(key)?.let { it to false }

  fun deleteKeyValue(key: String) {
    secureStorage.deleteKeyValue(key)
    plainStorage.deleteKeyValue(key)
  }
}
