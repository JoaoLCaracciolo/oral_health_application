package com.oralhealthapplication.app.modules.finalizaotwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaotwo.`data`.model.FinalizaOTwoModel
import org.koin.core.KoinComponent

class FinalizaOTwoVM : ViewModel(), KoinComponent {
  val finalizaOTwoModel: MutableLiveData<FinalizaOTwoModel> = MutableLiveData(FinalizaOTwoModel())

  var navArguments: Bundle? = null
}
