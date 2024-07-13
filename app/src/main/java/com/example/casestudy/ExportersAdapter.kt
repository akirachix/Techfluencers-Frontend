package com.example.casestudy

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ExportersAdapter (var exporterList: List<Exporter> ):
        RecyclerView.Adapter<ExporterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExporterViewHolder {
      val itemView = LayoutInflater.from(parent.context)
          .inflate(R.layout.exporters_list_item, parent, false)
        return  ExporterViewHolder(itemView)
    }
    override fun getItemCount(): Int {
        return exporterList.size
    }

    override fun onBindViewHolder(holder: ExporterViewHolder, position: Int) {
        val exporter =exporterList[position]
        holder.tvName.text = exporter.name
        holder.tvContact.text = exporter.contacts
        holder.tvLocation.text = exporter.location
    }


    }



class ExporterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvTitle = itemView.findViewById<TextView>(R.id.tvTittle)
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvLocation = itemView.findViewById<TextView>(R.id.tvLocation)
    var tvContact = itemView.findViewById<TextView>(R.id.tvContact)
}