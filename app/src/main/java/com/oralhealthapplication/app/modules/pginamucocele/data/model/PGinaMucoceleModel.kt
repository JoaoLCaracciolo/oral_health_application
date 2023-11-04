package com.oralhealthapplication.app.modules.pginamucocele.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PGinaMucoceleModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMUCOCELE: String? = MyApp.getInstance().resources.getString(R.string.lbl_mucocele)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCistoMucoso: String? = MyApp.getInstance().resources.getString(R.string.lbl_cisto_mucoso)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUmcistonoca: String? =
      MyApp.getInstance().resources.getString(R.string.msg_um_cisto_n_o_ca)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtVISOGERAL: String? = MyApp.getInstance().resources.getString(R.string.lbl_vis_o_geral)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_mordida_no_l_bi)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSINTOMAS: String? = MyApp.getInstance().resources.getString(R.string.lbl_sintomas)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_as_mucoceles_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTRATAMENTO: String? = MyApp.getInstance().resources.getString(R.string.lbl_tratamento)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescriptionTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_a_mucocele_cost)

)
