package com.example.mad_241

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

//import com.example.mad_241.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        binding= ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        binding.button.setOnClickListener {
//            binding.button.text="lol"
//            binding.textView.text = "You have clicked!"
//            binding.textView.setTextColor(Color.BLUE)
//            }
        val tvTxt: TextView =findViewById(R.id.tvTxt)
        val background:ConstraintLayout=findViewById(R.id.bgId)
        val btFontSize: Button =findViewById(R.id.btFontSize)
        val btFontColor:Button=findViewById(R.id.btFontColor)
        val btBgColor:Button=findViewById(R.id.btBgColor)
        var fontSize:Float=5f
        var fontColor:Int=0
        var bgColor:Int=0
        btFontSize.setOnClickListener {
            tvTxt.setTextSize(fontSize)
            fontSize=(fontSize+5)%50
        }
        btFontColor.setOnClickListener {
            when (fontColor%3) {
                0 -> tvTxt.setTextColor(Color.RED)
                1 -> tvTxt.setTextColor(Color.GREEN)
                2 -> tvTxt.setTextColor(Color.BLUE)
            }
            fontColor++
        }
        btBgColor.setOnClickListener {
            when (bgColor%3) {
                0 -> background.setBackgroundColor(Color.RED)
                1 -> background.setBackgroundColor(Color.GREEN)
                2 -> background.setBackgroundColor(Color.BLUE)
            }
            bgColor++
        }




    }
}