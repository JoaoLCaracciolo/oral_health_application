package com.oralhealthapplication.app.modules.carregamento.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoBinding
import com.oralhealthapplication.app.modules.carregamento.`data`.viewmodel.CarregamentoVM
import com.oralhealthapplication.app.modules.carregamentotwo.ui.CarregamentoTwoActivity
import kotlin.String
import kotlin.Unit

class CarregamentoActivity :
    BaseActivity<ActivityCarregamentoBinding>(R.layout.activity_carregamento) {
  private val viewModel: CarregamentoVM by viewModels<CarregamentoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameCarregamento.setOnClickListener {
      val destIntent = CarregamentoTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarregamentoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
