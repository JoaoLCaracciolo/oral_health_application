package com.oralhealthapplication.app.modules.questionrio.ui

import android.view.View
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityQuestionRioBinding
import com.oralhealthapplication.app.modules.finalizaoone.ui.FinalizaOOneActivity
import com.oralhealthapplication.app.modules.questionrio.`data`.model.QuestionRioRowModel
import com.oralhealthapplication.app.modules.questionrio.`data`.viewmodel.QuestionRioVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class QuestionRioActivity : BaseActivity<ActivityQuestionRioBinding>(R.layout.activity_question_rio)
    {
  private val viewModel: QuestionRioVM by viewModels<QuestionRioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val questionrioAdapter =
    QuestionrioAdapter(viewModel.questionrioList.value?:mutableListOf())
    binding.recyclerQuestionrio.adapter = questionrioAdapter
    questionrioAdapter.setOnItemClickListener(
    object : QuestionrioAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : QuestionRioRowModel) {
        onClickRecyclerQuestionrio(view, position, item)
      }
    }
    )
    viewModel.questionrioList.observe(this) {
      questionrioAdapter.updateData(it)
    }
    binding.questionRioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFinalizar.setOnClickListener {
      val destIntent = FinalizaOOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerQuestionrio(
    view: View,
    position: Int,
    item: QuestionRioRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "QUESTION_RIO_ACTIVITY"

  }
}
