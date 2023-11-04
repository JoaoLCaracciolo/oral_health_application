package com.oralhealthapplication.app.modules.historicodequestionario.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowListlnguascomplaBinding
import com.oralhealthapplication.app.modules.historicodequestionario.`data`.model.ListlnguascomplaRowModel
import kotlin.Int
import kotlin.collections.List

class ListlnguascomplaAdapter(
  var list: List<ListlnguascomplaRowModel>
) : RecyclerView.Adapter<ListlnguascomplaAdapter.RowListlnguascomplaVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListlnguascomplaVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listlnguascompla,parent,false)
    return RowListlnguascomplaVH(view)
  }

  override fun onBindViewHolder(holder: RowListlnguascomplaVH, position: Int) {
    val listlnguascomplaRowModel = ListlnguascomplaRowModel()
    // TODO uncomment following line after integration with data source
    // val listlnguascomplaRowModel = list[position]
    holder.binding.listlnguascomplaRowModel = listlnguascomplaRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListlnguascomplaRowModel>) {
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
      item: ListlnguascomplaRowModel
    ) {
    }
  }

  inner class RowListlnguascomplaVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListlnguascomplaBinding = RowListlnguascomplaBinding.bind(itemView)
    init {
      binding.btnSimFive.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListlnguascomplaRowModel())
      }
      binding.btnNoFive.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListlnguascomplaRowModel())
      }
    }
  }
}
