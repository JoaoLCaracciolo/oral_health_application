package com.oralhealthapplication.app.modules.meusdados.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.meusdados.`data`.model.MeusDadosModel
import org.koin.core.KoinComponent

class MeusDadosVM : ViewModel(), KoinComponent {
  val meusDadosModel: MutableLiveData<MeusDadosModel> = MutableLiveData(MeusDadosModel())

  var navArguments: Bundle? = null
}
