package com.oralhealthapplication.app.modules.pacientes.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowPacientesBinding
import com.oralhealthapplication.app.modules.pacientes.`data`.model.PacientesRowModel
import kotlin.Int
import kotlin.collections.List

class PacientesAdapter(
  var list: List<PacientesRowModel>
) : RecyclerView.Adapter<PacientesAdapter.RowPacientesVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowPacientesVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_pacientes,parent,false)
    return RowPacientesVH(view)
  }

  override fun onBindViewHolder(holder: RowPacientesVH, position: Int) {
    val pacientesRowModel = PacientesRowModel()
    // TODO uncomment following line after integration with data source
    // val pacientesRowModel = list[position]
    holder.binding.pacientesRowModel = pacientesRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<PacientesRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: PacientesRowModel
    ) {
    }
  }

  inner class RowPacientesVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowPacientesBinding = RowPacientesBinding.bind(itemView)
    init {
      binding.linearProperty1Me.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, PacientesRowModel())
      }
    }
  }
}
