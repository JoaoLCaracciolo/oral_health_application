package com.oralhealthapplication.app.modules.questionrio.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class QuestionRioRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEstasentindof: String? =
      MyApp.getInstance().resources.getString(R.string.msg_esta_sentindo_f)

)
