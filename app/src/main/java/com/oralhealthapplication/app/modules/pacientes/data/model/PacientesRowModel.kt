package com.oralhealthapplication.app.modules.pacientes.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PacientesRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMirelleSantos: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_mirelle_santos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPacienteInfant: String? =
      MyApp.getInstance().resources.getString(R.string.msg_paciente_infant)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnosCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_12_anos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUltimoatendime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_ultimo_atendime)

)
