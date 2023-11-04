package com.oralhealthapplication.app.modules.historicodequestionario.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.HistoricoDeQuestionarioModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListcancerbucaloneRowModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListlnguascomplaRowModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListsentedoraomaRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HistoricoDeQuestionarioVM : ViewModel(), KoinComponent {
  val historicoDeQuestionarioModel: MutableLiveData<HistoricoDeQuestionarioModel> =
      MutableLiveData(HistoricoDeQuestionarioModel())

  var navArguments: Bundle? = null

  val listsentedoraomaList: MutableLiveData<MutableList<ListsentedoraomaRowModel>> =
      MutableLiveData(mutableListOf())

  val listlnguascomplaList: MutableLiveData<MutableList<ListlnguascomplaRowModel>> =
      MutableLiveData(mutableListOf())

  val listcancerbucaloneList: MutableLiveData<MutableList<ListcancerbucaloneRowModel>> =
      MutableLiveData(mutableListOf())
}
