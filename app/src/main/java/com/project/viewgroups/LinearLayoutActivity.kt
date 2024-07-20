package com.project.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.viewgroups.databinding.ActivityLinearLayoutBinding

class LinearLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLinearLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLinearLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.backBtn.setOnClickListener{ finish() }
    }
}