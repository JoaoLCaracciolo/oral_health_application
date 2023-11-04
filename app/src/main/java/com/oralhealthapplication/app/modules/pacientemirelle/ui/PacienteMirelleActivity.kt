package com.oralhealthapplication.app.modules.pacientemirelle.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityPacienteMirelleBinding
import com.oralhealthapplication.app.modules.chamadaquestionrio.ui.ChamadaQuestionRioActivity
import com.oralhealthapplication.app.modules.pacientemirelle.`data`.viewmodel.PacienteMirelleVM
import kotlin.String
import kotlin.Unit

class PacienteMirelleActivity :
    BaseActivity<ActivityPacienteMirelleBinding>(R.layout.activity_paciente_mirelle) {
  private val viewModel: PacienteMirelleVM by viewModels<PacienteMirelleVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pacienteMirelleVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNovoAtendimentoOne.setOnClickListener {
      val destIntent = ChamadaQuestionRioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageClose.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PACIENTE_MIRELLE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PacienteMirelleActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
