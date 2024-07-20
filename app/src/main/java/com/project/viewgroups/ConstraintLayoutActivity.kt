package com.project.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.viewgroups.databinding.ActivityConstraintLayoutBinding

class ConstraintLayoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConstraintLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConstraintLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.backBtn.setOnClickListener{ finish() }
    }
}