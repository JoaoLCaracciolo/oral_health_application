package com.oralhealthapplication.app.modules.chamadaquestionrio.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityChamadaQuestionRioBinding
import com.oralhealthapplication.app.modules.chamadaquestionrio.`data`.viewmodel.ChamadaQuestionRioVM
import kotlin.String
import kotlin.Unit

class ChamadaQuestionRioActivity :
    BaseActivity<ActivityChamadaQuestionRioBinding>(R.layout.activity_chamada_question_rio) {
  private val viewModel: ChamadaQuestionRioVM by viewModels<ChamadaQuestionRioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.chamadaQuestionRioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CHAMADA_QUESTION_RIO_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ChamadaQuestionRioActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
