package com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListpacientegestanRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPacientegestan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paciente_gestan)

)
