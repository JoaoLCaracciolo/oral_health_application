package com.oralhealthapplication.app.modules.finalizaoone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOOneBinding
import com.oralhealthapplication.app.modules.finalizaoone.`data`.viewmodel.FinalizaOOneVM
import kotlin.String
import kotlin.Unit

class FinalizaOOneActivity :
    BaseActivity<ActivityFinalizaOOneBinding>(R.layout.activity_finaliza_o_one) {
  private val viewModel: FinalizaOOneVM by viewModels<FinalizaOOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "FINALIZA_O_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalizaOOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
