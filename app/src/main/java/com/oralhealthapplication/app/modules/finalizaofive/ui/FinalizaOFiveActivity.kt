package com.oralhealthapplication.app.modules.finalizaofive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOFiveBinding
import com.oralhealthapplication.app.modules.finalizaofive.`data`.viewmodel.FinalizaOFiveVM
import com.oralhealthapplication.app.modules.finalizaosix.ui.FinalizaOSixActivity
import kotlin.String
import kotlin.Unit

class FinalizaOFiveActivity :
    BaseActivity<ActivityFinalizaOFiveBinding>(R.layout.activity_finaliza_o_five) {
  private val viewModel: FinalizaOFiveVM by viewModels<FinalizaOFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFinalizaoFiv.setOnClickListener {
      val destIntent = FinalizaOSixActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINALIZA_O_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalizaOFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
