package com.example.rma_lv4.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.rma_lv4.R
import com.example.rma_lv4.data.model.User
import kotlinx.android.synthetic.main.item_layout.view.*

class MainAdapter(private val users: ArrayList<User>): RecyclerView.Adapter<MainAdapter.DataViewHolder>(){
    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(user: User){
            itemView.tv_UserName.text= user.name
            itemView.tv_UserEmail.text = user.email
            Glide.with(itemView.iv_Avatar.context)
                .load(user.avatar)
                .into(itemView.iv_Avatar)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) = holder.bind(users[position])

    fun addData(list: List<User>)
    {
        users.addAll(list)
    }


}
