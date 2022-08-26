package com.dzakwan.dicodingsubmision.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.dzakwan.dicodingsubmision.DetailActivity
import com.dzakwan.dicodingsubmision.data.Data
import com.dzakwan.dicodingsubmision.data.DataSiswa
import com.dzakwan.dicodingsubmision.databinding.RawItemRvHomeBinding

class AdapterSiswa( val context: Context)
    : RecyclerView.Adapter<AdapterSiswa.MyViewHolder>(){

    val listSiswa = DataSiswa.listName

    inner class MyViewHolder(val binding: RawItemRvHomeBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)= MyViewHolder(
        RawItemRvHomeBinding.inflate(LayoutInflater.from(parent.context), parent,false)
    )

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.apply {
            with(listSiswa[position]){
                tvTitleRaw.text = namaSiswa
                tvLocationRaw.text = lokasi
                tvUmurRaw.text = umur
            }

            Glide.with(imgRaw).load(listSiswa[position].image).into(imgRaw)

            holder.itemView.setOnClickListener {
                val intent = Intent(context, DetailActivity::class.java)
                intent.putExtra(DetailActivity.DETAIL_KEY, listSiswa[position])
                context.startActivity(intent)
            }
        }
    }

    override fun getItemCount(): Int = listSiswa.size
}