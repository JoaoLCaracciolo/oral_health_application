package com.oralhealthapplication.app.modules.finalizaotwo.ui

import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOTwoBinding
import com.oralhealthapplication.app.modules.finalizaotwo.`data`.viewmodel.FinalizaOTwoVM
import kotlin.String
import kotlin.Unit

class FinalizaOTwoActivity :
    BaseActivity<ActivityFinalizaOTwoBinding>(R.layout.activity_finaliza_o_two) {
  private val viewModel: FinalizaOTwoVM by viewModels<FinalizaOTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FINALIZA_O_TWO_ACTIVITY"

  }
}
