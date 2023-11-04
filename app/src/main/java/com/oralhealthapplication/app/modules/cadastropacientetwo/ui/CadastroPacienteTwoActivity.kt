package com.oralhealthapplication.app.modules.cadastropacientetwo.ui

import android.view.View
import androidx.activity.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityCadastroPacienteTwoBinding
import com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.model.ListpacientegestanRowModel
import com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.viewmodel.CadastroPacienteTwoVM
import com.oralhealthapplication.app.modules.chamadaquestionrio.ui.ChamadaQuestionRioActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class CadastroPacienteTwoActivity :
    BaseActivity<ActivityCadastroPacienteTwoBinding>(R.layout.activity_cadastro_paciente_two) {
  private val viewModel: CadastroPacienteTwoVM by viewModels<CadastroPacienteTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listpacientegestanAdapter =
    ListpacientegestanAdapter(viewModel.listpacientegestanList.value?:mutableListOf())
    binding.recyclerListpacientegestan.adapter = listpacientegestanAdapter
    listpacientegestanAdapter.setOnItemClickListener(
    object : ListpacientegestanAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListpacientegestanRowModel) {
        onClickRecyclerListpacientegestan(view, position, item)
      }
    }
    )
    viewModel.listpacientegestanList.observe(this) {
      listpacientegestanAdapter.updateData(it)
    }
    binding.cadastroPacienteTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnCadastrar.setOnClickListener {
      val destIntent = ChamadaQuestionRioActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListpacientegestan(
    view: View,
    position: Int,
    item: ListpacientegestanRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "CADASTRO_PACIENTE_TWO_ACTIVITY"

  }
}
