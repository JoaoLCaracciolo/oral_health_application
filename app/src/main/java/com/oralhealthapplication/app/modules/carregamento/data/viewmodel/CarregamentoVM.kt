package com.oralhealthapplication.app.modules.carregamento.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamento.`data`.model.CarregamentoModel
import org.koin.core.KoinComponent

class CarregamentoVM : ViewModel(), KoinComponent {
  val carregamentoModel: MutableLiveData<CarregamentoModel> = MutableLiveData(CarregamentoModel())

  var navArguments: Bundle? = null
}
