package com.oralhealthapplication.app.modules.historicodequestionario.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HistoricoDeQuestionarioModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPatologiasComp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_patologias_comp)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProbabilidaded: String? =
      MyApp.getInstance().resources.getString(R.string.msg_probabilidade_d)

)
