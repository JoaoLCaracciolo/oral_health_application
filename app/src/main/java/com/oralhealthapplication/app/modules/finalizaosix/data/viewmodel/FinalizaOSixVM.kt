package com.oralhealthapplication.app.modules.finalizaosix.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaosix.`data`.model.FinalizaOSixModel
import org.koin.core.KoinComponent

class FinalizaOSixVM : ViewModel(), KoinComponent {
  val finalizaOSixModel: MutableLiveData<FinalizaOSixModel> = MutableLiveData(FinalizaOSixModel())

  var navArguments: Bundle? = null
}
