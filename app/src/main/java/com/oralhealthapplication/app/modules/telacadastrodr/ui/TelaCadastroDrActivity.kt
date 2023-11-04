package com.oralhealthapplication.app.modules.telacadastrodr.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityTelaCadastroDrBinding
import com.oralhealthapplication.app.modules.telacadastrodr.`data`.viewmodel.TelaCadastroDrVM
import com.oralhealthapplication.app.modules.telalogindr.ui.TelaLoginDrActivity
import kotlin.String
import kotlin.Unit

class TelaCadastroDrActivity :
    BaseActivity<ActivityTelaCadastroDrBinding>(R.layout.activity_tela_cadastro_dr) {
  private val viewModel: TelaCadastroDrVM by viewModels<TelaCadastroDrVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaCadastroDrVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnCadastrar.setOnClickListener {
      val destIntent = TelaLoginDrActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_CADASTRO_DR_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelaCadastroDrActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
