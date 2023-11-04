package com.oralhealthapplication.app.modules.chamadaquestionrio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.chamadaquestionrio.`data`.model.ChamadaQuestionRioModel
import org.koin.core.KoinComponent

class ChamadaQuestionRioVM : ViewModel(), KoinComponent {
  val chamadaQuestionRioModel: MutableLiveData<ChamadaQuestionRioModel> =
      MutableLiveData(ChamadaQuestionRioModel())

  var navArguments: Bundle? = null
}
