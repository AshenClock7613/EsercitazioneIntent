package it.ashen.exercise.esercitazioneintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View.OnClickListener
import it.ashen.exercise.esercitazioneintent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button5.setOnClickListener{
            val i = Intent(this,MainActivity2::class.java)
            startActivity(i)
        }
        binding.button.setOnClickListener {
            val i = Intent(this, MainActivity2::class.java)
            val oggetto = Paolo("Paolo", "Gulotta", "21")
            i.putExtra("argomento", oggetto)
            startActivity(i)
        }
        binding.
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

    }
}