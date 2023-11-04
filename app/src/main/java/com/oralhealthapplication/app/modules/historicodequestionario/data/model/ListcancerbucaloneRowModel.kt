package com.oralhealthapplication.app.modules.historicodequestionario.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListcancerbucaloneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProbabilidadedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_probabilidade_d2)

)
