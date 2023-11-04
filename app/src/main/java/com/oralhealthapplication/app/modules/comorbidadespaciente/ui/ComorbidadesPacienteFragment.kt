package com.oralhealthapplication.app.modules.comorbidadespaciente.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseFragment
import com.oralhealthapplication.app.databinding.FragmentComorbidadesPacienteBinding
import com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.model.ListdiabticocontrRowModel
import com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.viewmodel.ComorbidadesPacienteVM
import com.oralhealthapplication.app.modules.pacientemirelle.ui.PacienteMirelleActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ComorbidadesPacienteFragment :
    BaseFragment<FragmentComorbidadesPacienteBinding>(R.layout.fragment_comorbidades_paciente) {
  private val viewModel: ComorbidadesPacienteVM by viewModels<ComorbidadesPacienteVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listdiabticocontrAdapter =
    ListdiabticocontrAdapter(viewModel.listdiabticocontrList.value?:mutableListOf())
    binding.recyclerListdiabticocontr.adapter = listdiabticocontrAdapter
    listdiabticocontrAdapter.setOnItemClickListener(
    object : ListdiabticocontrAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListdiabticocontrRowModel) {
        onClickRecyclerListdiabticocontr(view, position, item)
      }
    }
    )
    viewModel.listdiabticocontrList.observe(requireActivity()) {
      listdiabticocontrAdapter.updateData(it)
    }
    binding.comorbidadesPacienteVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFechar.setOnClickListener {
      val destIntent = PacienteMirelleActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListdiabticocontr(
    view: View,
    position: Int,
    item: ListdiabticocontrRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "COMORBIDADES_PACIENTE_FRAGMENT"

  }
}
