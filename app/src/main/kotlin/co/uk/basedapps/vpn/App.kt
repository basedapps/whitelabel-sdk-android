package co.uk.basedapps.vpn

import android.app.Application
import co.uk.basedapps.vpn.vpn.VpnInitializer
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

  @Inject
  lateinit var vpnInitializer: VpnInitializer

  override fun onCreate() {
    super.onCreate()
    setupTimber()
    vpnInitializer.setupVPN(this)
  }

  private fun setupTimber() {
    if (BuildConfig.DEBUG) {
      Timber.plant(Timber.DebugTree())
    }
  }
}
