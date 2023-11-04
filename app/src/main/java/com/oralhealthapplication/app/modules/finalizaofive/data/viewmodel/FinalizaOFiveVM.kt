package com.oralhealthapplication.app.modules.finalizaofive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaofive.`data`.model.FinalizaOFiveModel
import org.koin.core.KoinComponent

class FinalizaOFiveVM : ViewModel(), KoinComponent {
  val finalizaOFiveModel: MutableLiveData<FinalizaOFiveModel> =
      MutableLiveData(FinalizaOFiveModel())

  var navArguments: Bundle? = null
}
