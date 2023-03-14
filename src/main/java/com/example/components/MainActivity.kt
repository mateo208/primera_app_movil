package com.example.components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btncalcular: Button = findViewById(R.id.btncalcular)
      btncalcular.setOnClickListener{ realizarCalculo() }
    }

  private  fun realizarCalculo() {
    val editText = findViewById<EditText>(R.id.text)
    val radioButton1 = findViewById<RadioButton>(R.id.radio1)
    val radioButton2 = findViewById<RadioButton>(R.id.radio2)
    val checkBox1 = findViewById<CheckBox>(R.id.chexbox1)
    val checkBox2 = findViewById<CheckBox>(R.id.chexbox2)
    val toggleButton = findViewById<Switch>(R.id.Swith)
    val imageButton = findViewById<ImageButton>(R.id.btnImagen)
    val calcularButton = findViewById<Button>(R.id.btncalcular)

    calcularButton.setOnClickListener {
      val nombre = editText.text.toString()
      val radioButtonSelected = if (radioButton1.isChecked) radioButton1.text else radioButton2.text
      val checkBox1Selected = checkBox1.isChecked
      val checkBox2Selected = checkBox2.isChecked
      val toggleButtonSelected = toggleButton.isChecked

      val message = "Nombre: $nombre\nRadioButton seleccionado: $radioButtonSelected\n" +
        "CheckBox 1 seleccionado: $checkBox1Selected\nCheckBox 2 seleccionado: $checkBox2Selected\n" +
        "ToggleButton seleccionado: $toggleButtonSelected"
      Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }


  }

}
