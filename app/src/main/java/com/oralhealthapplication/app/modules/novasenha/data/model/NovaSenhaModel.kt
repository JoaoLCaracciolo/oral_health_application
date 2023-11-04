package com.oralhealthapplication.app.modules.novasenha.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NovaSenhaModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAsenhaprecisa: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_senha_precisa)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNovaSenha: String? = MyApp.getInstance().resources.getString(R.string.lbl_nova_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRepetirsenha: String? = MyApp.getInstance().resources.getString(R.string.lbl_repetir_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordOneValue: String? = null
)
