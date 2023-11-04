package com.oralhealthapplication.app.modules.finalizaoseven.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFinalizaOSevenBinding
import com.oralhealthapplication.app.modules.finalizaoseven.`data`.viewmodel.FinalizaOSevenVM
import com.oralhealthapplication.app.modules.menuinicial.ui.MenuInicialActivity
import kotlin.String
import kotlin.Unit

class FinalizaOSevenActivity :
    BaseActivity<ActivityFinalizaOSevenBinding>(R.layout.activity_finaliza_o_seven) {
  private val viewModel: FinalizaOSevenVM by viewModels<FinalizaOSevenVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finalizaOSevenVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.floatingBtnFloatingactionbutton.setOnClickListener {
      val destIntent = MenuInicialActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINALIZA_O_SEVEN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinalizaOSevenActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
