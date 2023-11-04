package com.oralhealthapplication.app.modules.telacadastrodr.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TelaCadastroDrModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBemvindo: String? = MyApp.getInstance().resources.getString(R.string.lbl_bem_vindo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAseuappdeat: String? = MyApp.getInstance().resources.getString(R.string.msg_a_seu_app_de_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNome: String? = MyApp.getInstance().resources.getString(R.string.lbl_nome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCROMatrcula: String? = MyApp.getInstance().resources.getString(R.string.lbl_cro_matr_cula)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSenha: String? = MyApp.getInstance().resources.getString(R.string.lbl_senha)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightyFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etGroupEightySevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null
)
