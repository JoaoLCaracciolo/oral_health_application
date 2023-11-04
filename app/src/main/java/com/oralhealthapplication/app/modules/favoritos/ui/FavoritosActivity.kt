package com.oralhealthapplication.app.modules.favoritos.ui

import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.base.BaseActivity
import com.oralhealthapplication.app.databinding.ActivityFavoritosBinding
import com.oralhealthapplication.app.modules.favoritos.`data`.viewmodel.FavoritosVM
import com.oralhealthapplication.app.modules.meusdados.ui.MeusDadosActivity
import com.oralhealthapplication.app.modules.pginamucocele.ui.PGinaMucoceleActivity
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class FavoritosActivity : BaseActivity<ActivityFavoritosBinding>(R.layout.activity_favoritos) {
  private val viewModel: FavoritosVM by viewModels<FavoritosVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.favoritosVM = viewModel
    setUpSearchViewPesquisarListener()
  }

  override fun setUpClicks(): Unit {
    binding.imagePerfil.setOnClickListener {
      val destIntent = MeusDadosActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageOqueemucocel.setOnClickListener {
      val destIntent = PGinaMucoceleActivity.getIntent(this, null)
      startActivity(destIntent)
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
      const val TAG: String = "FAVORITOS_ACTIVITY"

    }
  }
