package com.oralhealthapplication.app.modules.comorbidadespaciente1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.comorbidadespaciente1.`data`.model.ComorbidadesPaciente1Model
import org.koin.core.KoinComponent

class ComorbidadesPaciente1VM : ViewModel(), KoinComponent {
  val comorbidadesPaciente1Model: MutableLiveData<ComorbidadesPaciente1Model> =
      MutableLiveData(ComorbidadesPaciente1Model())

  var navArguments: Bundle? = null
}
