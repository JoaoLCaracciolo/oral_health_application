package com.oralhealthapplication.app.modules.carregamentothree.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoThreeBinding
import com.oralhealthapplication.app.modules.carregamentofour.ui.CarregamentoFourActivity
import com.oralhealthapplication.app.modules.carregamentothree.`data`.viewmodel.CarregamentoThreeVM
import kotlin.String
import kotlin.Unit

class CarregamentoThreeActivity :
    BaseActivity<ActivityCarregamentoThreeBinding>(R.layout.activity_carregamento_three) {
  private val viewModel: CarregamentoThreeVM by viewModels<CarregamentoThreeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoThreeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameCarregamentoTh.setOnClickListener {
      val destIntent = CarregamentoFourActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_THREE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarregamentoThreeActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
