package com.oralhealthapplication.app.modules.meusdadosmudar.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.meusdadosmudar.`data`.model.MeusDadosMudarModel
import org.koin.core.KoinComponent

class MeusDadosMudarVM : ViewModel(), KoinComponent {
  val meusDadosMudarModel: MutableLiveData<MeusDadosMudarModel> =
      MutableLiveData(MeusDadosMudarModel())

  var navArguments: Bundle? = null
}
