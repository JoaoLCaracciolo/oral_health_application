package com.oralhealthapplication.app.modules.telainicialtwo.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityTelaInicialTwoBinding
import com.oralhealthapplication.app.modules.telacadastrodr.ui.TelaCadastroDrActivity
import com.oralhealthapplication.app.modules.telainicialtwo.`data`.viewmodel.TelaInicialTwoVM
import com.oralhealthapplication.app.modules.telalogindr.ui.TelaLoginDrActivity
import kotlin.String
import kotlin.Unit

class TelaInicialTwoActivity :
    BaseActivity<ActivityTelaInicialTwoBinding>(R.layout.activity_tela_inicial_two) {
  private val viewModel: TelaInicialTwoVM by viewModels<TelaInicialTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaInicialTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnEntrar.setOnClickListener {
      val destIntent = TelaLoginDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnCadastrar.setOnClickListener {
      val destIntent = TelaCadastroDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_INICIAL_TWO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelaInicialTwoActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
