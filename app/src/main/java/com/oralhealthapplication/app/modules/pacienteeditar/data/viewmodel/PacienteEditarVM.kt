package com.oralhealthapplication.app.modules.pacienteeditar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.pacienteeditar.`data`.model.PacienteEditarModel
import org.koin.core.KoinComponent

class PacienteEditarVM : ViewModel(), KoinComponent {
  val pacienteEditarModel: MutableLiveData<PacienteEditarModel> =
      MutableLiveData(PacienteEditarModel())

  var navArguments: Bundle? = null
}
