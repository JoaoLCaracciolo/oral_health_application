package com.oralhealthapplication.app.modules.pacientes.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PacientesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentes: String? = MyApp.getInstance().resources.getString(R.string.lbl_recentes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAZ: String? = MyApp.getInstance().resources.getString(R.string.lbl_a_z)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZA: String? = MyApp.getInstance().resources.getString(R.string.lbl_z_a)

)
