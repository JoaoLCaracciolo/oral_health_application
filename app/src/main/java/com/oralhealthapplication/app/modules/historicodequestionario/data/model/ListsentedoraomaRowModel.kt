package com.oralhealthapplication.app.modules.historicodequestionario.`data`.model

import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListsentedoraomaRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSentedoraoma: String? =
      MyApp.getInstance().resources.getString(R.string.msg_sente_dor_ao_ma)

)
