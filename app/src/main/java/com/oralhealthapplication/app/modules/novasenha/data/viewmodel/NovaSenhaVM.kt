package com.oralhealthapplication.app.modules.novasenha.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.novasenha.`data`.model.NovaSenhaModel
import org.koin.core.KoinComponent

class NovaSenhaVM : ViewModel(), KoinComponent {
  val novaSenhaModel: MutableLiveData<NovaSenhaModel> = MutableLiveData(NovaSenhaModel())

  var navArguments: Bundle? = null
}
