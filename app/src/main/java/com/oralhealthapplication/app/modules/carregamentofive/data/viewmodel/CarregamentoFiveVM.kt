package com.oralhealthapplication.app.modules.carregamentofive.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamentofive.`data`.model.CarregamentoFiveModel
import org.koin.core.KoinComponent

class CarregamentoFiveVM : ViewModel(), KoinComponent {
  val carregamentoFiveModel: MutableLiveData<CarregamentoFiveModel> =
      MutableLiveData(CarregamentoFiveModel())

  var navArguments: Bundle? = null
}
