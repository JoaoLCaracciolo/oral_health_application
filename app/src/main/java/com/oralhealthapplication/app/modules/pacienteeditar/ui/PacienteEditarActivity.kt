package com.oralhealthapplication.app.modules.pacienteeditar.ui

import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityPacienteEditarBinding
import com.oralhealthapplication.app.modules.pacienteeditar.`data`.viewmodel.PacienteEditarVM
import kotlin.String
import kotlin.Unit

class PacienteEditarActivity :
    BaseActivity<ActivityPacienteEditarBinding>(R.layout.activity_paciente_editar) {
  private val viewModel: PacienteEditarVM by viewModels<PacienteEditarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.pacienteEditarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PACIENTE_EDITAR_ACTIVITY"

  }
}
