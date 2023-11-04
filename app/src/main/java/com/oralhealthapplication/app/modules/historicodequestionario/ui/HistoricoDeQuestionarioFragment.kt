package com.oralhealthapplication.app.modules.historicodequestionario.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseFragment
import com.oralhealthapplication.app.databinding.FragmentHistoricoDeQuestionarioBinding
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListcancerbucaloneRowModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListlnguascomplaRowModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListsentedoraomaRowModel
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.viewmodel.HistoricoDeQuestionarioVM
import com.oralhealthapplication.app.modules.pacientemirelle.ui.PacienteMirelleActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HistoricoDeQuestionarioFragment :
    BaseFragment<FragmentHistoricoDeQuestionarioBinding>(R.layout.fragment_historico_de_questionario)
    {
  private val viewModel: HistoricoDeQuestionarioVM by viewModels<HistoricoDeQuestionarioVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val listsentedoraomaAdapter =
    ListsentedoraomaAdapter(viewModel.listsentedoraomaList.value?:mutableListOf())
    binding.recyclerListsentedoraoma.adapter = listsentedoraomaAdapter
    listsentedoraomaAdapter.setOnItemClickListener(
    object : ListsentedoraomaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsentedoraomaRowModel) {
        onClickRecyclerListsentedoraoma(view, position, item)
      }
    }
    )
    viewModel.listsentedoraomaList.observe(requireActivity()) {
      listsentedoraomaAdapter.updateData(it)
    }
    val listlnguascomplaAdapter =
    ListlnguascomplaAdapter(viewModel.listlnguascomplaList.value?:mutableListOf())
    binding.recyclerListlnguascompla.adapter = listlnguascomplaAdapter
    listlnguascomplaAdapter.setOnItemClickListener(
    object : ListlnguascomplaAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListlnguascomplaRowModel) {
        onClickRecyclerListlnguascompla(view, position, item)
      }
    }
    )
    viewModel.listlnguascomplaList.observe(requireActivity()) {
      listlnguascomplaAdapter.updateData(it)
    }
    val listcancerbucaloneAdapter =
    ListcancerbucaloneAdapter(viewModel.listcancerbucaloneList.value?:mutableListOf())
    binding.recyclerListcancerbucalone.adapter = listcancerbucaloneAdapter
    listcancerbucaloneAdapter.setOnItemClickListener(
    object : ListcancerbucaloneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListcancerbucaloneRowModel) {
        onClickRecyclerListcancerbucalone(view, position, item)
      }
    }
    )
    viewModel.listcancerbucaloneList.observe(requireActivity()) {
      listcancerbucaloneAdapter.updateData(it)
    }
    binding.historicoDeQuestionarioVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFechar.setOnClickListener {
      val destIntent = PacienteMirelleActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerListsentedoraoma(
    view: View,
    position: Int,
    item: ListsentedoraomaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListlnguascompla(
    view: View,
    position: Int,
    item: ListlnguascomplaRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListcancerbucalone(
    view: View,
    position: Int,
    item: ListcancerbucaloneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HISTORICO_DE_QUESTIONARIO_FRAGMENT"

  }
}
