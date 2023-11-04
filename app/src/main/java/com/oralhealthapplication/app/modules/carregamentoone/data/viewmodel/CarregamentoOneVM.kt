package com.oralhealthapplication.app.modules.carregamentoone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamentoone.`data`.model.CarregamentoOneModel
import org.koin.core.KoinComponent

class CarregamentoOneVM : ViewModel(), KoinComponent {
  val carregamentoOneModel: MutableLiveData<CarregamentoOneModel> =
      MutableLiveData(CarregamentoOneModel())

  var navArguments: Bundle? = null
}
