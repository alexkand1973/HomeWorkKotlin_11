package com.alexkand.homeworkkotlin_11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    //Сделайте приложение в котором будет два EditText и кнопка.
    // В роле ViewGroup используйте ConstraintLayout.
    // Суть приложения в ведении имени и фамилии пользователя.
    // После введения данных, нажимаем на кнопку с текстом Greet и
    // снизу появляется Toast, который будет приветствовать пользователя.

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main)
        super.onCreate(savedInstanceState)

        btn_search_thing.setOnClickListener {
            val currentText_1 = et_1_search_thing.text.toString()
            val currentText_2 = et_2_search_thing.text.toString()

            Toast.makeText(this, "Hello, $currentText_1 $currentText_2!",
                Toast.LENGTH_LONG).show()

        }
    }

}