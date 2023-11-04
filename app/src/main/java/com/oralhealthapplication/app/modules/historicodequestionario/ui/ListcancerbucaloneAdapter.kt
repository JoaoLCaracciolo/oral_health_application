package com.oralhealthapplication.app.modules.historicodequestionario.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowListcancerbucaloneBinding
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListcancerbucaloneRowModel
import kotlin.Int
import kotlin.collections.List

class ListcancerbucaloneAdapter(
  var list: List<ListcancerbucaloneRowModel>
) : RecyclerView.Adapter<ListcancerbucaloneAdapter.RowListcancerbucaloneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListcancerbucaloneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listcancerbucalone,parent,false)
    return RowListcancerbucaloneVH(view)
  }

  override fun onBindViewHolder(holder: RowListcancerbucaloneVH, position: Int) {
    val listcancerbucaloneRowModel = ListcancerbucaloneRowModel()
    // TODO uncomment following line after integration with data source
    // val listcancerbucaloneRowModel = list[position]
    holder.binding.listcancerbucaloneRowModel = listcancerbucaloneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListcancerbucaloneRowModel>) {
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
      item: ListcancerbucaloneRowModel
    ) {
    }
  }

  inner class RowListcancerbucaloneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListcancerbucaloneBinding = RowListcancerbucaloneBinding.bind(itemView)
  }
}
