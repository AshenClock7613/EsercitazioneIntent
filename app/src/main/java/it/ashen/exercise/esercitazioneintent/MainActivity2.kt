package it.ashen.exercise.esercitazioneintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.Nullable
import it.ashen.exercise.esercitazioneintent.databinding.ActivityMain2Binding
import it.ashen.exercise.esercitazioneintent.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMain2Binding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button6.setOnClickListener{
            val i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        val myintent = intent
        val argomento_pass:Paolo? =myintent.getSerializableExtra("argomento") as? Paolo
        if(argomento_pass != null)
        binding.testo.setText(argomento_pass?.name + " " + argomento_pass?.cognome + " " + argomento_pass?.eta)
    }
}