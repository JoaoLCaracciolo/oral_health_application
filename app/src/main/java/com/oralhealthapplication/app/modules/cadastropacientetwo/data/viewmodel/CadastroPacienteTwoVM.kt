package com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.model.CadastroPacienteTwoModel
import com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.model.ListpacientegestanRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class CadastroPacienteTwoVM : ViewModel(), KoinComponent {
  val cadastroPacienteTwoModel: MutableLiveData<CadastroPacienteTwoModel> =
      MutableLiveData(CadastroPacienteTwoModel())

  var navArguments: Bundle? = null

  val listpacientegestanList: MutableLiveData<MutableList<ListpacientegestanRowModel>> =
      MutableLiveData(mutableListOf())
}
