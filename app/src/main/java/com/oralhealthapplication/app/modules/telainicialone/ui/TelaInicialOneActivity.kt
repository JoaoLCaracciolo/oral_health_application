package com.oralhealthapplication.app.modules.telainicialone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityTelaInicialOneBinding
import com.oralhealthapplication.app.modules.telainicialone.`data`.viewmodel.TelaInicialOneVM
import com.oralhealthapplication.app.modules.telainicialtwo.ui.TelaInicialTwoActivity
import kotlin.String
import kotlin.Unit

class TelaInicialOneActivity :
    BaseActivity<ActivityTelaInicialOneBinding>(R.layout.activity_tela_inicial_one) {
  private val viewModel: TelaInicialOneVM by viewModels<TelaInicialOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaInicialOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageImagemodonto.setOnClickListener {
      val destIntent = TelaInicialTwoActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "TELA_INICIAL_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TelaInicialOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
