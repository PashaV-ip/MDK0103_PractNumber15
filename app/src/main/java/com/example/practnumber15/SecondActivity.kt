package com.example.practnumber15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView: TextView = findViewById(R.id.textViewInformation)

        var animal : Animal = Animal()

        val arg: Bundle? = intent.extras
        if(arg != null) {
            animal = arg.getParcelable<Animal>(animal.javaClass.simpleName) as Animal

            textView.text = "Месяц рождения: ${animal.getMonth()}\n" +
                    "Год рождения: ${animal.getYear()}\n" +
                    "Порода: ${animal.getBreed()}\n" +
                    "Тип животного: ${animal.getType()}"
        }
    }
}