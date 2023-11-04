package com.oralhealthapplication.app.modules.carregamentoone.ui

import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCarregamentoOneBinding
import com.oralhealthapplication.app.modules.carregamentoone.`data`.viewmodel.CarregamentoOneVM
import com.oralhealthapplication.app.modules.telainicialone.ui.TelaInicialOneActivity
import kotlin.String
import kotlin.Unit

class CarregamentoOneActivity :
    BaseActivity<ActivityCarregamentoOneBinding>(R.layout.activity_carregamento_one) {
  private val viewModel: CarregamentoOneVM by viewModels<CarregamentoOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.carregamentoOneVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = TelaInicialOneActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.frameCarregamentoOn.setOnClickListener {
        val destIntent = TelaInicialOneActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "CARREGAMENTO_ONE_ACTIVITY"

    }
  }
