package com.oralhealthapplication.app.modules.chamadaquestionrio.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChamadaQuestionRioModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOlRespondao: String? = MyApp.getInstance().resources.getString(R.string.msg_ol_responda_o)

)
