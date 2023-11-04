package com.oralhealthapplication.app.modules.historicodequestionario.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowListsentedoraomaBinding
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListsentedoraomaRowModel
import kotlin.Int
import kotlin.collections.List

class ListsentedoraomaAdapter(
  var list: List<ListsentedoraomaRowModel>
) : RecyclerView.Adapter<ListsentedoraomaAdapter.RowListsentedoraomaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsentedoraomaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsentedoraoma,parent,false)
    return RowListsentedoraomaVH(view)
  }

  override fun onBindViewHolder(holder: RowListsentedoraomaVH, position: Int) {
    val listsentedoraomaRowModel = ListsentedoraomaRowModel()
    // TODO uncomment following line after integration with data source
    // val listsentedoraomaRowModel = list[position]
    holder.binding.listsentedoraomaRowModel = listsentedoraomaRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsentedoraomaRowModel>) {
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
      item: ListsentedoraomaRowModel
    ) {
    }
  }

  inner class RowListsentedoraomaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsentedoraomaBinding = RowListsentedoraomaBinding.bind(itemView)
    init {
      binding.btnSim.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListsentedoraomaRowModel())
      }
      binding.btnNo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListsentedoraomaRowModel())
      }
    }
  }
}
