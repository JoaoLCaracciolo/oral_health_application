package com.oralhealthapplication.app.modules.meusdadosnovasenha.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityMeusDadosNovaSenhaBinding
import com.oralhealthapplication.app.modules.meusdadosnovasenha.`data`.viewmodel.MeusDadosNovaSenhaVM
import kotlin.String
import kotlin.Unit

class MeusDadosNovaSenhaActivity :
    BaseActivity<ActivityMeusDadosNovaSenhaBinding>(R.layout.activity_meus_dados_nova_senha) {
  private val viewModel: MeusDadosNovaSenhaVM by viewModels<MeusDadosNovaSenhaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meusDadosNovaSenhaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "MEUS_DADOS_NOVA_SENHA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MeusDadosNovaSenhaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
