package com.oralhealthapplication.app.modules.pacientes.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.pacientes.`data`.model.PacientesModel
import com.oralhealthapplication.app.modules.pacientes.`data`.model.PacientesRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class PacientesVM : ViewModel(), KoinComponent {
  val pacientesModel: MutableLiveData<PacientesModel> = MutableLiveData(PacientesModel())

  var navArguments: Bundle? = null

  val pacientesList: MutableLiveData<MutableList<PacientesRowModel>> =
      MutableLiveData(mutableListOf())
}
