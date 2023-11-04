package com.oralhealthapplication.app.modules.telalogindr.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.telalogindr.`data`.model.TelaLoginDrModel
import org.koin.core.KoinComponent

class TelaLoginDrVM : ViewModel(), KoinComponent {
  val telaLoginDrModel: MutableLiveData<TelaLoginDrModel> = MutableLiveData(TelaLoginDrModel())

  var navArguments: Bundle? = null
}
