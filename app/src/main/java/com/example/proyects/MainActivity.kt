package com.example.proyects

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton

const val USER_NAME = "org.bedu.proyects.USER_NAME"

class MainActivity : AppCompatActivity() {

    private lateinit var boton: Button
    private lateinit var input: EditText

    //------------ stickers ------------
    private lateinit var boton4: ImageButton


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        boton = findViewById(R.id.buttonAccept)
        input = findViewById(R.id.editText)
        /*//------------ stickers ------------
        boton4 = findViewById(R.id.img)*/

        boton.setOnClickListener {
            val bundle = Bundle()

            bundle.putString(USER_NAME, input.text.toString())

            val intent = Intent(this, WelcomeActivity::class.java ).apply{
                putExtras(bundle)
            }

            startActivity(intent)
        }


     /*   boton4.setOnClickListener{
            val intent: Intent = Intent(this, vistacool::class.java)
            startActivity(intent)
        }*/

       /* boton5.setOnClickListener{
            val intent: Intent = Intent(this, vistaarrow::class.java)
            startActivity(intent)
        }

        boton6.setOnClickListener{
            val intent: Intent = Intent(this, vitaboom::class.java)
            startActivity(intent)
        }*/

    }
}