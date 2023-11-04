package com.oralhealthapplication.app.modules.comorbidadespaciente1.ui

import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityComorbidadesPaciente1Binding
import com.oralhealthapplication.app.modules.comorbidadespaciente1.`data`.viewmodel.ComorbidadesPaciente1VM
import kotlin.String
import kotlin.Unit

class ComorbidadesPaciente1Activity :
    BaseActivity<ActivityComorbidadesPaciente1Binding>(R.layout.activity_comorbidades_paciente1) {
  private val viewModel: ComorbidadesPaciente1VM by viewModels<ComorbidadesPaciente1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.comorbidadesPaciente1VM = viewModel
    val adapter = ComorbidadesPaciente1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerViewpager.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup6,binding.viewPagerViewpager) { tab, position ->
      tab.text = ComorbidadesPaciente1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
      binding.imageArrowleft.setOnClickListener {
        finish()
      }
    }

    companion object {
      const val TAG: String = "COMORBIDADES_PACIENTE1ACTIVITY"

    }
  }
