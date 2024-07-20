package com.project.viewgroups

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.viewgroups.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initComponent()
    }

    private fun initComponent(){
        binding.constraintLayoutBtn.setOnClickListener{ openActivity(ConstraintLayoutActivity::class.java) }
        binding.linearLayoutBtn.setOnClickListener { openActivity(LinearLayoutActivity::class.java) }
        binding.frameLayoutBtn.setOnClickListener { openActivity(FrameLayoutActivity::class.java) }
        binding.relativeLayoutBtn.setOnClickListener { openActivity(RelativeLayoutActivity::class.java) }
        binding.motionLayoutBtn.setOnClickListener { openActivity(MotionLayoutActivity::class.java) }
        binding.gridLayoutBtn.setOnClickListener { openActivity(GridLayoutActivity::class.java) }
    }


    /**
     * inline функції - це такі функції, які дозволяють компілятору вставляти тіло функції безпосередньо в місце виклику.
     * Це може призвести до оптимізації виконання, оскільки усуваються накладні витрати на виклик функції
     *
     * У Kotlin є особливість, що називається reified типи, які можуть використовуватися тільки у inline функціях.
     * reified дозволяє зберегти інформацію про тип параметра під час виконання, що зазвичай неможливо через типізацію стирання в Java.
     */
    private inline fun <reified T : Activity> openActivity(activity: Class<T>) {
        val intent = Intent(this, activity)
        startActivity(intent)
    }
}