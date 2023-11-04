package com.oralhealthapplication.app.modules.questionrio.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.oralhealthapplication.app.R
import com.oralhealthapplication.app.databinding.RowQuestionRioBinding
import com.oralhealthapplication.app.modules.questionrio.`data`.model.QuestionRioRowModel
import kotlin.Int
import kotlin.collections.List

class QuestionrioAdapter(
  var list: List<QuestionRioRowModel>
) : RecyclerView.Adapter<QuestionrioAdapter.RowQuestionRioVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowQuestionRioVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_question_rio,parent,false)
    return RowQuestionRioVH(view)
  }

  override fun onBindViewHolder(holder: RowQuestionRioVH, position: Int) {
    val questionRioRowModel = QuestionRioRowModel()
    // TODO uncomment following line after integration with data source
    // val questionRioRowModel = list[position]
    holder.binding.questionRioRowModel = questionRioRowModel
  }

  override fun getItemCount(): Int = 10
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<QuestionRioRowModel>) {
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
      item: QuestionRioRowModel
    ) {
    }
  }

  inner class RowQuestionRioVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowQuestionRioBinding = RowQuestionRioBinding.bind(itemView)
    init {
      binding.btnSim.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, QuestionRioRowModel())
      }
      binding.btnNo.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, QuestionRioRowModel())
      }
    }
  }
}
