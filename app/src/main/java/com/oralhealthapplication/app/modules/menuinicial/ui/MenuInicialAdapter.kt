package com.oralhealthapplication.app.modules.menuinicial.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowMenuInicialBinding
import com.oralhealthapplication.app.modules.menuinicial.`data`.model.MenuInicialRowModel
import kotlin.Int
import kotlin.collections.List

class MenuInicialAdapter(
  var list: List<MenuInicialRowModel>
) : RecyclerView.Adapter<MenuInicialAdapter.RowMenuInicialVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowMenuInicialVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_menu_inicial,parent,false)
    return RowMenuInicialVH(view)
  }

  override fun onBindViewHolder(holder: RowMenuInicialVH, position: Int) {
    val menuInicialRowModel = MenuInicialRowModel()
    // TODO uncomment following line after integration with data source
    // val menuInicialRowModel = list[position]
    holder.binding.menuInicialRowModel = menuInicialRowModel
  }

  override fun getItemCount(): Int = 8
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<MenuInicialRowModel>) {
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
      item: MenuInicialRowModel
    ) {
    }
  }

  inner class RowMenuInicialVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowMenuInicialBinding = RowMenuInicialBinding.bind(itemView)
  }
}
