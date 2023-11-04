package com.oralhealthapplication.app.modules.meusdadosnovasenha.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.meusdadosnovasenha.`data`.model.MeusDadosNovaSenhaModel
import org.koin.core.KoinComponent

class MeusDadosNovaSenhaVM : ViewModel(), KoinComponent {
  val meusDadosNovaSenhaModel: MutableLiveData<MeusDadosNovaSenhaModel> =
      MutableLiveData(MeusDadosNovaSenhaModel())

  var navArguments: Bundle? = null
}
