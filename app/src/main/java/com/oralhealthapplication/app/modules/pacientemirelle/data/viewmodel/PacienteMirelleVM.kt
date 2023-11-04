package com.oralhealthapplication.app.modules.pacientemirelle.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.pacientemirelle.`data`.model.PacienteMirelleModel
import org.koin.core.KoinComponent

class PacienteMirelleVM : ViewModel(), KoinComponent {
  val pacienteMirelleModel: MutableLiveData<PacienteMirelleModel> =
      MutableLiveData(PacienteMirelleModel())

  var navArguments: Bundle? = null
}
