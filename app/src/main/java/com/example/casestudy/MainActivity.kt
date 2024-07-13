package com.example.casestudy

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.casestudy.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvExporters.layoutManager = LinearLayoutManager(this)
        displayTraders()
    }

    fun displayTraders(){
        val trader1 = Exporter("Wangige exporters","+247990987","London","")
        val trader2 = Exporter("Wanhoi exporters","+247990987","London","")
        val trader3 = Exporter("Wabales exporters","+247990987","London","")
        val trader4 = Exporter("Expensive exporters","+247990987","London","")
        val trader5 = Exporter("Fashionable exporters","+247990987","London","")
        val trader6 = Exporter("Whole exporters","+247990987","London","")
        val trader7 = Exporter("Wide exporters","+247990987","London","")
        val myexporters = listOf(trader1,trader2,trader3,trader4,trader5,trader6,trader7)
        val exportersAdapter = ExportersAdapter(myexporters)
        binding.rvExporters.adapter = exportersAdapter
    }
}