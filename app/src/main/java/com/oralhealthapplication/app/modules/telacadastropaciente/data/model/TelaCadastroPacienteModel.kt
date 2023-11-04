package com.oralhealthapplication.app.modules.telacadastropaciente.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class TelaCadastroPacienteModel(
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
  var txtNomeCompleto: String? = MyApp.getInstance().resources.getString(R.string.lbl_nome_completo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDatadenascime: String? =
      MyApp.getInstance().resources.getString(R.string.msg_data_de_nascime)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSexo: String? = MyApp.getInstance().resources.getString(R.string.lbl_sexo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCPF: String? = MyApp.getInstance().resources.getString(R.string.lbl_cpf)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRG: String? = MyApp.getInstance().resources.getString(R.string.lbl_rg)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtContato: String? = MyApp.getInstance().resources.getString(R.string.lbl_contato)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFourValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFiveValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFiveOneValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleSixValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleSevenValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etRectangleFiveTwoValue: String? = null
)
