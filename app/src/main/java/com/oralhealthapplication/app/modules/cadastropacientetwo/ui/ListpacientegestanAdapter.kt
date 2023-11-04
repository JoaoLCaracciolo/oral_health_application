package com.oralhealthapplication.app.modules.cadastropacientetwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowListpacientegestanBinding
import com.oralhealthapplication.app.modules.cadastropacientetwo.`data`.model.ListpacientegestanRowModel
import kotlin.Int
import kotlin.collections.List

class ListpacientegestanAdapter(
  var list: List<ListpacientegestanRowModel>
) : RecyclerView.Adapter<ListpacientegestanAdapter.RowListpacientegestanVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListpacientegestanVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listpacientegestan,parent,false)
    return RowListpacientegestanVH(view)
  }

  override fun onBindViewHolder(holder: RowListpacientegestanVH, position: Int) {
    val listpacientegestanRowModel = ListpacientegestanRowModel()
    // TODO uncomment following line after integration with data source
    // val listpacientegestanRowModel = list[position]
    holder.binding.listpacientegestanRowModel = listpacientegestanRowModel
  }

  override fun getItemCount(): Int = 7
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListpacientegestanRowModel>) {
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
      item: ListpacientegestanRowModel
    ) {
    }
  }

  inner class RowListpacientegestanVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListpacientegestanBinding = RowListpacientegestanBinding.bind(itemView)
    init {
      binding.btnSim.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListpacientegestanRowModel())
      }
      binding.btnNo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListpacientegestanRowModel())
      }
    }
  }
}
