package com.oralhealthapplication.app.modules.telacadastropaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.telacadastropaciente.`data`.model.TelaCadastroPacienteModel
import org.koin.core.KoinComponent

class TelaCadastroPacienteVM : ViewModel(), KoinComponent {
  val telaCadastroPacienteModel: MutableLiveData<TelaCadastroPacienteModel> =
      MutableLiveData(TelaCadastroPacienteModel())

  var navArguments: Bundle? = null
}
