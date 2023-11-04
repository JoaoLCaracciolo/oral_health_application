package com.oralhealthapplication.app.modules.finalizaothree.ui

import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOThreeBinding
import com.oralhealthapplication.app.modules.finalizaofour.ui.FinalizaOFourActivity
import com.oralhealthapplication.app.modules.finalizaothree.`data`.viewmodel.FinalizaOThreeVM
import kotlin.String
import kotlin.Unit

class FinalizaOThreeActivity :
    BaseActivity<ActivityFinalizaOThreeBinding>(R.layout.activity_finaliza_o_three) {
  private val viewModel: FinalizaOThreeVM by viewModels<FinalizaOThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearFinalizaoThr.setOnClickListener {
      val destIntent = FinalizaOFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINALIZA_O_THREE_ACTIVITY"

  }
}
