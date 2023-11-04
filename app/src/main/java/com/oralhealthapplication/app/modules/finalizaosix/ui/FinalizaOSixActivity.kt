package com.oralhealthapplication.app.modules.finalizaosix.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOSixBinding
import com.oralhealthapplication.app.modules.finalizaoseven.ui.FinalizaOSevenActivity
import com.oralhealthapplication.app.modules.finalizaosix.`data`.viewmodel.FinalizaOSixVM
import kotlin.String
import kotlin.Unit

class FinalizaOSixActivity :
    BaseActivity<ActivityFinalizaOSixBinding>(R.layout.activity_finaliza_o_six) {
  private val viewModel: FinalizaOSixVM by viewModels<FinalizaOSixVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOSixVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFinalizaoSix.setOnClickListener {
      val destIntent = FinalizaOSevenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINALIZA_O_SIX_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalizaOSixActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
