package com.oralhealthapplication.app.modules.finalizaofour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaofour.`data`.model.FinalizaOFourModel
import org.koin.core.KoinComponent

class FinalizaOFourVM : ViewModel(), KoinComponent {
  val finalizaOFourModel: MutableLiveData<FinalizaOFourModel> =
      MutableLiveData(FinalizaOFourModel())

  var navArguments: Bundle? = null
}
