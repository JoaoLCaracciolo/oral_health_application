package com.oralhealthapplication.app.modules.finalizaosix.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FinalizaOSixModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtObrigadoAgora: String? =
      MyApp.getInstance().resources.getString(R.string.msg_obrigado_agora)

)
