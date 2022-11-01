package com.example.practnumber15

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun onClick_ButtonRespond(view: View){
        val typeEditText: EditText = findViewById(R.id.typeEditText)
        val breedEditText: EditText = findViewById(R.id.breedEditText)
        val yearEditText: EditText = findViewById(R.id.yearEditText)
        val monthEditText: EditText = findViewById(R.id.monthEditText)
        if(typeEditText.text.isNotEmpty()
            && breedEditText.text.isNotEmpty()
            && yearEditText.text.isNotEmpty()
            && monthEditText.text.isNotEmpty()){
            val animal = Animal(typeEditText.text.toString(), breedEditText.text.toString(), yearEditText.text.toString(), monthEditText.text.toString())
            val intent: Intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra(animal.javaClass.simpleName, animal)
            startActivity(intent)
        }
        else{
            val toast: Toast = Toast.makeText(applicationContext, "Одно или несколько полей пустые!", Toast.LENGTH_LONG)
            toast.show()
        }
    }
}