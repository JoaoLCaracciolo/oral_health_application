package com.oralhealthapplication.app.modules.carregamentothree.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.carregamentothree.`data`.model.CarregamentoThreeModel
import org.koin.core.KoinComponent

class CarregamentoThreeVM : ViewModel(), KoinComponent {
  val carregamentoThreeModel: MutableLiveData<CarregamentoThreeModel> =
      MutableLiveData(CarregamentoThreeModel())

  var navArguments: Bundle? = null
}
