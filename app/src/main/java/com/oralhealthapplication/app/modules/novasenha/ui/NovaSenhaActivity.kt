package com.oralhealthapplication.app.modules.novasenha.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityNovaSenhaBinding
import com.oralhealthapplication.app.modules.novasenha.`data`.viewmodel.NovaSenhaVM
import kotlin.String
import kotlin.Unit

class NovaSenhaActivity : BaseActivity<ActivityNovaSenhaBinding>(R.layout.activity_nova_senha) {
  private val viewModel: NovaSenhaVM by viewModels<NovaSenhaVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.novaSenhaVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "NOVA_SENHA_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NovaSenhaActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
