package com.ugurcandede.multicampcommunitiesturkey

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.ugurcandede.multicampcommunitiesturkey.data.model.MccResponse
import kotlinx.android.synthetic.main.rw_item_multicamp.view.*

class MulticampAdapter(
    private val mcList: MutableList<MccResponse>,
    private val onClick: (MccResponse) -> Unit
) : RecyclerView.Adapter<MulticampAdapter.mcViewHolder>() {

    class mcViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(item_mc: MccResponse, onClick: (MccResponse) -> Unit) {
            itemView.tv_leader.text = item_mc.leader?.name
            itemView.tv_dept.text = item_mc.name
            itemView.mc_gdg_avatar.load(item_mc.leader?.photo)
            itemView.setOnClickListener {
                onClick(item_mc)
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): mcViewHolder {
        return mcViewHolder(parent.inflate(R.layout.rw_item_multicamp))
    }

    override fun onBindViewHolder(holder: mcViewHolder, position: Int) {
        val mc = mcList[position]
        holder.bind(mc, onClick)
    }

    override fun getItemCount(): Int = mcList.size

}

fun ViewGroup.inflate(layoutId: Int): View {
    val layoutInflater = LayoutInflater.from(context)
    return layoutInflater.inflate(layoutId, this, false)
}