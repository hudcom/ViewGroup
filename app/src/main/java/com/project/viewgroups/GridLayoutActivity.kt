package com.project.viewgroups

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.project.viewgroups.databinding.ActivityGridLayoutBinding

class GridLayoutActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridLayoutBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.backBtn.setOnClickListener{ finish() }
        binding.button1.setOnClickListener { rotateElement(binding.button1) }
        binding.button2.setOnClickListener { rotateElement(binding.button2) }
        binding.button3.setOnClickListener { rotateElement(binding.button3) }
        binding.button4.setOnClickListener { rotateElement(binding.button4) }
        binding.button5.setOnClickListener { rotateElement(binding.button5) }
        binding.button6.setOnClickListener { rotateElement(binding.button6) }
    }

    private fun rotateElement(button: Button) {
        // Отримати поточний кут обертання
        val currentRotation = button.rotation
        // Розрахувати новий кут обертання
        val newRotation = currentRotation + 90f
        // Застосувати новий кут обертання до кнопки
        button.rotation = newRotation
    }
}