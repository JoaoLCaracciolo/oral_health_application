package com.oralhealthapplication.app.modules.telalogindr.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TelaLoginDrModel(
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
  var txtEsqueceuasenh: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esqueceu_a_senh)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNopossuiuma: String? = MyApp.getInstance().resources.getString(R.string.msg_n_o_possui_uma)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFourValue: String? = null
)
