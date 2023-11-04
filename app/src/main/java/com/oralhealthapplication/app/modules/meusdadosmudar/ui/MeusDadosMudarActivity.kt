package com.oralhealthapplication.app.modules.meusdadosmudar.ui

import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.oralhealthapplication.app.databinding.ActivityMeusDadosMudarBinding
import com.oralhealthapplication.app.modules.meusdadosmudar.`data`.viewmodel.MeusDadosMudarVM
import kotlin.String
import kotlin.Unit

class MeusDadosMudarActivity :
    BaseActivity<ActivityMeusDadosMudarBinding>(R.layout.activity_meus_dados_mudar) {
  private val viewModel: MeusDadosMudarVM by viewModels<MeusDadosMudarVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.meusDadosMudarVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "MEUS_DADOS_MUDAR_ACTIVITY"

    }
  }
