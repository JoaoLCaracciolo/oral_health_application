package com.oralhealthapplication.app.modules.pacientemirelle.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PacienteMirelleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? = MyApp.getInstance().resources.getString(R.string.msg_mirelle_santos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mirelle_santos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCadastrodoPac: String? =
      MyApp.getInstance().resources.getString(R.string.msg_cadastro_do_pac)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etNomeValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etDateValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSenhaValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupTwentyOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etSenhaOneValue: String? = null
)
