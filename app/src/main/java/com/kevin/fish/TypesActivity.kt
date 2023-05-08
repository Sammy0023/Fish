package com.kevin.fish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kevin.fish.databinding.ActivityTypesBinding
import com.kevin.fish.types.CodActivity
import com.kevin.fish.types.SalmonActivity
import com.kevin.fish.types.TunaActivity

class TypesActivity : AppCompatActivity() {
    lateinit var binding: ActivityTypesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTypesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.firstLevel.setOnClickListener{
            startActivity(Intent(this, SalmonActivity::class.java))
        }

        binding.secondLevel.setOnClickListener{
            startActivity(Intent(this, TunaActivity::class.java))
        }

        binding.thirdLevel.setOnClickListener{
            startActivity(Intent(this, CodActivity::class.java))
        }
    }
}