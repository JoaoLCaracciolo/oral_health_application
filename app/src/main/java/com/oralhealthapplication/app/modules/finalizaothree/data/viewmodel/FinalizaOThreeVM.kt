package com.oralhealthapplication.app.modules.finalizaothree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaothree.`data`.model.FinalizaOThreeModel
import org.koin.core.KoinComponent

class FinalizaOThreeVM : ViewModel(), KoinComponent {
  val finalizaOThreeModel: MutableLiveData<FinalizaOThreeModel> =
      MutableLiveData(FinalizaOThreeModel())

  var navArguments: Bundle? = null
}
