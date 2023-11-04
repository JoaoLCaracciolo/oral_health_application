package com.oralhealthapplication.app.modules.finalizaofour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOFourBinding
import com.oralhealthapplication.app.modules.finalizaofive.ui.FinalizaOFiveActivity
import com.oralhealthapplication.app.modules.finalizaofour.`data`.viewmodel.FinalizaOFourVM
import kotlin.String
import kotlin.Unit

class FinalizaOFourActivity :
    BaseActivity<ActivityFinalizaOFourBinding>(R.layout.activity_finaliza_o_four) {
  private val viewModel: FinalizaOFourVM by viewModels<FinalizaOFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFinalizaoFou.setOnClickListener {
      val destIntent = FinalizaOFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINALIZA_O_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalizaOFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
