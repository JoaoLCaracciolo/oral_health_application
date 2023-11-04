package com.oralhealthapplication.app.modules.comorbidadespaciente1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.appcomponents.di.MyApp
import com.oralhealthapplication.app.modules.comorbidadespaciente.ui.ComorbidadesPacienteFragment
import com.oralhealthapplication.app.modules.historicodequestionario.ui.HistoricoDeQuestionarioFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ComorbidadesPaciente1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_sim),MyApp.getInstance().resources.getString(R.string.lbl_n_o))

        val viewPages: List<Fragment> =
                listOf(ComorbidadesPacienteFragment(),HistoricoDeQuestionarioFragment())

    }
}
