package com.oralhealthapplication.app.modules.carregamentotwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoTwoBinding
import com.oralhealthapplication.app.modules.carregamentothree.ui.CarregamentoThreeActivity
import com.oralhealthapplication.app.modules.carregamentotwo.`data`.viewmodel.CarregamentoTwoVM
import kotlin.String
import kotlin.Unit

class CarregamentoTwoActivity :
    BaseActivity<ActivityCarregamentoTwoBinding>(R.layout.activity_carregamento_two) {
  private val viewModel: CarregamentoTwoVM by viewModels<CarregamentoTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameCarregamentoTw.setOnClickListener {
      val destIntent = CarregamentoThreeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarregamentoTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
