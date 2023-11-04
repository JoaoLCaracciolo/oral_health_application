package com.oralhealthapplication.app.modules.questionrio.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.oralhealthapplication.app.modules.questionrio.`data`.model.QuestionRioModel
import com.oralhealthapplication.app.modules.questionrio.`data`.model.QuestionRioRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class QuestionRioVM : ViewModel(), KoinComponent {
  val questionRioModel: MutableLiveData<QuestionRioModel> = MutableLiveData(QuestionRioModel())

  var navArguments: Bundle? = null

  val questionrioList: MutableLiveData<MutableList<QuestionRioRowModel>> =
      MutableLiveData(mutableListOf())
}
