package com.oralhealthapplication.app.modules.finalizaoone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.finalizaoone.`data`.model.FinalizaOOneModel
import org.koin.core.KoinComponent

class FinalizaOOneVM : ViewModel(), KoinComponent {
  val finalizaOOneModel: MutableLiveData<FinalizaOOneModel> = MutableLiveData(FinalizaOOneModel())

  var navArguments: Bundle? = null
}
