package com.oralhealthapplication.app.modules.telainicialone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.telainicialone.`data`.model.TelaInicialOneModel
import org.koin.core.KoinComponent

class TelaInicialOneVM : ViewModel(), KoinComponent {
  val telaInicialOneModel: MutableLiveData<TelaInicialOneModel> =
      MutableLiveData(TelaInicialOneModel())

  var navArguments: Bundle? = null
}
