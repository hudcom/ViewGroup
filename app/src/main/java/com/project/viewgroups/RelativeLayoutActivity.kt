package com.project.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.viewgroups.databinding.ActivityRelativeLayoutBinding

class RelativeLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRelativeLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.backBtn.setOnClickListener{ finish() }
    }
}