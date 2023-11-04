package com.oralhealthapplication.app.modules.carregamentofour.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamentofour.`data`.model.CarregamentoFourModel
import org.koin.core.KoinComponent

class CarregamentoFourVM : ViewModel(), KoinComponent {
  val carregamentoFourModel: MutableLiveData<CarregamentoFourModel> =
      MutableLiveData(CarregamentoFourModel())

  var navArguments: Bundle? = null
}
