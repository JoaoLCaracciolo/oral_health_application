package com.oralhealthapplication.app.modules.menuinicial.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.menuinicial.`data`.model.MenuInicialModel
import com.oralhealthapplication.app.modules.menuinicial.`data`.model.MenuInicialRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MenuInicialVM : ViewModel(), KoinComponent {
  val menuInicialModel: MutableLiveData<MenuInicialModel> = MutableLiveData(MenuInicialModel())

  var navArguments: Bundle? = null

  val menuInicialList: MutableLiveData<MutableList<MenuInicialRowModel>> =
      MutableLiveData(mutableListOf())
}
