package com.oralhealthapplication.app.modules.telacadastrodr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.telacadastrodr.`data`.model.TelaCadastroDrModel
import org.koin.core.KoinComponent

class TelaCadastroDrVM : ViewModel(), KoinComponent {
  val telaCadastroDrModel: MutableLiveData<TelaCadastroDrModel> =
      MutableLiveData(TelaCadastroDrModel())

  var navArguments: Bundle? = null
}
