package com.oralhealthapplication.app.modules.telacadastropaciente.ui

import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.oralhealthapplication.app.databinding.ActivityTelaCadastroPacienteBinding
import com.oralhealthapplication.app.modules.telacadastropaciente.`data`.viewmodel.TelaCadastroPacienteVM
import kotlin.String
import kotlin.Unit

class TelaCadastroPacienteActivity :
    BaseActivity<ActivityTelaCadastroPacienteBinding>(R.layout.activity_tela_cadastro_paciente) {
  private val viewModel: TelaCadastroPacienteVM by viewModels<TelaCadastroPacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.telaCadastroPacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {


    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "TELA_CADASTRO_PACIENTE_ACTIVITY"

  }
}
