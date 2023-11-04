package com.oralhealthapplication.app.modules.pacientes.ui

import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityPacientesBinding
import com.oralhealthapplication.app.modules.meusdados.ui.MeusDadosActivity
import com.oralhealthapplication.app.modules.pacientemirelle.ui.PacienteMirelleActivity
import com.oralhealthapplication.app.modules.pacientes.`data`.model.PacientesRowModel
import com.oralhealthapplication.app.modules.pacientes.`data`.viewmodel.PacientesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PacientesActivity : BaseActivity<ActivityPacientesBinding>(R.layout.activity_pacientes) {
  private val viewModel: PacientesVM by viewModels<PacientesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val pacientesAdapter = PacientesAdapter(viewModel.pacientesList.value?:mutableListOf())
    binding.recyclerPacientes.adapter = pacientesAdapter
    pacientesAdapter.setOnItemClickListener(
    object : PacientesAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PacientesRowModel) {
        onClickRecyclerPacientes(view, position, item)
      }
    }
    )
    viewModel.pacientesList.observe(this) {
      pacientesAdapter.updateData(it)
    }
    binding.pacientesVM = viewModel
    setUpSearchViewPesquisarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imagePerfil.setOnClickListener {
      val destIntent = MeusDadosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerPacientes(
    view: View,
    position: Int,
    item: PacientesRowModel
  ): Unit {
    when(view.id) {
      R.id.linearProperty1Me ->  {
        val destIntent = PacienteMirelleActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }
  }

  private fun setUpSearchViewPesquisarListener(): Unit {
    binding.searchViewPesquisar.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "PACIENTES_ACTIVITY"

    }
  }
