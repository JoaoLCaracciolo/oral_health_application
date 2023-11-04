package com.oralhealthapplication.app.modules.finalizaoseven.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaoseven.`data`.model.FinalizaOSevenModel
import org.koin.core.KoinComponent

class FinalizaOSevenVM : ViewModel(), KoinComponent {
  val finalizaOSevenModel: MutableLiveData<FinalizaOSevenModel> =
      MutableLiveData(FinalizaOSevenModel())

  var navArguments: Bundle? = null
}
