package com.oralhealthapplication.app.modules.pginamucocele.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.pginamucocele.`data`.model.PGinaMucoceleModel
import org.koin.core.KoinComponent

class PGinaMucoceleVM : ViewModel(), KoinComponent {
  val pGinaMucoceleModel: MutableLiveData<PGinaMucoceleModel> =
      MutableLiveData(PGinaMucoceleModel())

  var navArguments: Bundle? = null
}
