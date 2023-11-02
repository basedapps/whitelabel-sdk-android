package co.uk.basedapps.vpn.viewModel.countries

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import co.uk.basedapps.domain.functional.getOrNull
import co.uk.basedapps.vpn.common.state.Status
import co.uk.basedapps.vpn.network.repository.BasedRepository
import co.uk.basedapps.vpn.network.model.Country
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.launch

@HiltViewModel
class CountriesScreenViewModel
@Inject constructor(
  val stateHolder: CountriesScreenStateHolder,
  private val repository: BasedRepository,
) : ViewModel() {

  private val state: CountriesScreenState
    get() = stateHolder.state.value

  init {
    stateHolder.updateState { copy(status = Status.Loading) }
    getCountries()
  }

  private fun getCountries() {
    viewModelScope.launch {
      val countries = repository.getCountries().getOrNull()?.data
      if (countries != null) {
        stateHolder.updateState {
          copy(
            status = Status.Data,
            countries = countries,
          )
        }
      } else {
        stateHolder.updateState { copy(status = Status.Error(false)) }
      }
    }
  }

  fun onCountryClick(country: Country) {
    stateHolder.sendEffect(CountriesScreenEffect.ShowCitiesScreen(country))
  }

  fun onTryAgainClick() {
    stateHolder.updateState { copy(status = Status.Error(true)) }
    getCountries()
  }
}
