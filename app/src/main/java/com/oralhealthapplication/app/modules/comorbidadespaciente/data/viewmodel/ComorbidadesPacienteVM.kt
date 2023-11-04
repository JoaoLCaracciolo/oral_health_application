package com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.model.ComorbidadesPacienteModel
import com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.model.ListdiabticocontrRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ComorbidadesPacienteVM : ViewModel(), KoinComponent {
  val comorbidadesPacienteModel: MutableLiveData<ComorbidadesPacienteModel> =
      MutableLiveData(ComorbidadesPacienteModel())

  var navArguments: Bundle? = null

  val listdiabticocontrList: MutableLiveData<MutableList<ListdiabticocontrRowModel>> =
      MutableLiveData(mutableListOf())
}
