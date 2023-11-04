package com.oralhealthapplication.app.modules.pginamucocele.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityPGinaMucoceleBinding
import com.oralhealthapplication.app.modules.pginamucocele.`data`.viewmodel.PGinaMucoceleVM
import kotlin.String
import kotlin.Unit

class PGinaMucoceleActivity :
    BaseActivity<ActivityPGinaMucoceleBinding>(R.layout.activity_p_gina_mucocele) {
  private val viewModel: PGinaMucoceleVM by viewModels<PGinaMucoceleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pGinaMucoceleVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "P_GINA_MUCOCELE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PGinaMucoceleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
