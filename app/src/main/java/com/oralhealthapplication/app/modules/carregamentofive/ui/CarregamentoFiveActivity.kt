package com.oralhealthapplication.app.modules.carregamentofive.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoFiveBinding
import com.oralhealthapplication.app.modules.carregamentofive.`data`.viewmodel.CarregamentoFiveVM
import com.oralhealthapplication.app.modules.menuinicial.ui.MenuInicialActivity
import kotlin.String
import kotlin.Unit

class CarregamentoFiveActivity :
    BaseActivity<ActivityCarregamentoFiveBinding>(R.layout.activity_carregamento_five) {
  private val viewModel: CarregamentoFiveVM by viewModels<CarregamentoFiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoFiveVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.frameCarregamentoFi.setOnClickListener {
      val destIntent = MenuInicialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CARREGAMENTO_FIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CarregamentoFiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
