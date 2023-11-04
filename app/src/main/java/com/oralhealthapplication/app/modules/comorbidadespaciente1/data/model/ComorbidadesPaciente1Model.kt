package com.oralhealthapplication.app.modules.comorbidadespaciente1.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ComorbidadesPaciente1Model(
  /**
   * TODO Replace with dynamic value
   */
  var txtPacientegestan: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paciente_gestan)

)
