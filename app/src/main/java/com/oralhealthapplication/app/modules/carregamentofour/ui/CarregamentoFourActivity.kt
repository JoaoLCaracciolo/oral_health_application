package com.oralhealthapplication.app.modules.carregamentofour.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoFourBinding
import com.oralhealthapplication.app.modules.carregamentofive.ui.CarregamentoFiveActivity
import com.oralhealthapplication.app.modules.carregamentofour.`data`.viewmodel.CarregamentoFourVM
import kotlin.String
import kotlin.Unit

class CarregamentoFourActivity :
    BaseActivity<ActivityCarregamentoFourBinding>(R.layout.activity_carregamento_four) {
  private val viewModel: CarregamentoFourVM by viewModels<CarregamentoFourVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoFourVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameCarregamentoFo.setOnClickListener {
      val destIntent = CarregamentoFiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_FOUR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarregamentoFourActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
