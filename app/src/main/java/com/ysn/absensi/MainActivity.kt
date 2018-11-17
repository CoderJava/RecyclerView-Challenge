package com.ysn.absensi

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listKehadiran = mutableListOf<Kehadiran>()
        listKehadiran.add(Kehadiran("Yudi Setiawan"))
        listKehadiran.add(Kehadiran("Ayu Lestari"))
        listKehadiran.add(Kehadiran("Icha"))
        listKehadiran.add(Kehadiran("Putra"))
        listKehadiran.add(Kehadiran("Putri"))
        listKehadiran.add(Kehadiran("Anindya"))
        listKehadiran.add(Kehadiran("Mayuko"))
        listKehadiran.add(Kehadiran("Yoko"))
        listKehadiran.add(Kehadiran("Surya"))
        listKehadiran.add(Kehadiran("Deka"))
        listKehadiran.add(Kehadiran("Fitriani"))
        listKehadiran.add(Kehadiran("Rizqy"))
        listKehadiran.add(Kehadiran(("Lili")))
        listKehadiran.add(Kehadiran("Ali"))
        listKehadiran.add(Kehadiran("Albert"))
        listKehadiran.add(Kehadiran("Indah"))
        listKehadiran.add(Kehadiran("Silvina"))
        listKehadiran.add(Kehadiran("Agung"))
        listKehadiran.add(Kehadiran("Bobby"))
        val adapterAbsensi = AdapterAbsensi(listKehadiran)
        recycler_view.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        recycler_view.layoutManager = LinearLayoutManager(this)
        recycler_view.adapter = adapterAbsensi
    }
}
