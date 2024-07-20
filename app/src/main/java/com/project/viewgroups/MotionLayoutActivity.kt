package com.project.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.viewgroups.databinding.ActivityMotionLayoutBinding

class MotionLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMotionLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMotionLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.backBtn.setOnClickListener{ finish() }
    }
}