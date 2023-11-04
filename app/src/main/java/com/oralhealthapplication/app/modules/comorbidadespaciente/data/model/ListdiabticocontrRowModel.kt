package com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListdiabticocontrRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDiabticocontr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_diab_tico_contr)

)
