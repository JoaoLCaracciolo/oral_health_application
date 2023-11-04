package com.oralhealthapplication.app.modules.carregamentotwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamentotwo.`data`.model.CarregamentoTwoModel
import org.koin.core.KoinComponent

class CarregamentoTwoVM : ViewModel(), KoinComponent {
  val carregamentoTwoModel: MutableLiveData<CarregamentoTwoModel> =
      MutableLiveData(CarregamentoTwoModel())

  var navArguments: Bundle? = null
}
