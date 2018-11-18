package com.ysn.absensi

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class AdapterAbsensi constructor(private val listKehadiran: MutableList<Kehadiran>) : RecyclerView.Adapter<AdapterAbsensi.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_adapter, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val kehadiran = listKehadiran[position]
        holder.textViewName.text = kehadiran.nama
        when (kehadiran.tipeKehadiran) {
            "hadir" -> {
                holder.radioButtonHadir.isChecked = true
            }
            "absen" -> {
                holder.radioButtonAbsen.isChecked = true
            }
            "sakit" -> {
                holder.radioButtonSakit.isChecked = true
            }
            else -> {
                holder.radioGroupAbsensi.clearCheck()
            }
        }
    }

    override fun getItemCount(): Int = listKehadiran.size

    inner class ViewHolder constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textViewName: TextView = itemView.findViewById(R.id.text_view_name)

        val radioGroupAbsensi: RadioGroup = itemView.findViewById(R.id.radio_group_absensi)
        val radioButtonHadir: RadioButton = itemView.findViewById(R.id.radio_button_hadir)
        val radioButtonAbsen: RadioButton = itemView.findViewById(R.id.radio_button_absen)
        val radioButtonSakit: RadioButton = itemView.findViewById(R.id.radio_button_sakit)

        init {
            radioGroupAbsensi.setOnCheckedChangeListener { radioGroup, id ->
                when (radioGroup.checkedRadioButtonId) {
                    R.id.radio_button_hadir -> {
                        listKehadiran[adapterPosition].tipeKehadiran = "hadir"
                    }
                    R.id.radio_button_absen -> {
                        listKehadiran[adapterPosition].tipeKehadiran = "absen"
                    }
                    R.id.radio_button_sakit -> {
                        listKehadiran[adapterPosition].tipeKehadiran = "sakit"
                    }
                    else -> {
                        listKehadiran[adapterPosition].tipeKehadiran = ""
                    }
                }
            }
        }
    }

}