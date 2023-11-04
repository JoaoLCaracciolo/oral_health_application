package com.oralhealthapplication.app.modules.finalizaoseven.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FinalizaOSevenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPatologiasComp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_patologias_comp2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCliqueparasab: String? =
      MyApp.getInstance().resources.getString(R.string.msg_clique_para_sab)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProbabilidaded: String? =
      MyApp.getInstance().resources.getString(R.string.msg_probabilidade_d)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProbabilidadedOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_probabilidade_d2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProbabilidadedTwo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_probabilidade_d3)

)
