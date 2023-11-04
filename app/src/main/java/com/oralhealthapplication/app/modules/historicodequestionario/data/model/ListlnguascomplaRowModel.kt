package com.oralhealthapplication.app.modules.historicodequestionario.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListlnguascomplaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLnguascompla: String? =
      MyApp.getInstance().resources.getString(R.string.msg_l_nguas_com_pla)

)
