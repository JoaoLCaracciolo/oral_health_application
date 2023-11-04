package com.oralhealthapplication.app.modules.comorbidadespaciente.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowListdiabticocontrBinding
import com.oralhealthapplication.app.modules.comorbidadespaciente.`data`.model.ListdiabticocontrRowModel
import kotlin.Int
import kotlin.collections.List

class ListdiabticocontrAdapter(
  var list: List<ListdiabticocontrRowModel>
) : RecyclerView.Adapter<ListdiabticocontrAdapter.RowListdiabticocontrVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListdiabticocontrVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listdiabticocontr,parent,false)
    return RowListdiabticocontrVH(view)
  }

  override fun onBindViewHolder(holder: RowListdiabticocontrVH, position: Int) {
    val listdiabticocontrRowModel = ListdiabticocontrRowModel()
    // TODO uncomment following line after integration with data source
    // val listdiabticocontrRowModel = list[position]
    holder.binding.listdiabticocontrRowModel = listdiabticocontrRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListdiabticocontrRowModel>) {
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
      item: ListdiabticocontrRowModel
    ) {
    }
  }

  inner class RowListdiabticocontrVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListdiabticocontrBinding = RowListdiabticocontrBinding.bind(itemView)
    init {
      binding.btnSim.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListdiabticocontrRowModel())
      }
      binding.btnNo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListdiabticocontrRowModel())
      }
    }
  }
}
