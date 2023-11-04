package com.oralhealthapplication.app.modules.menuinicial.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class MenuInicialRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAFTA: String? = MyApp.getInstance().resources.getString(R.string.lbl_afta)

)
