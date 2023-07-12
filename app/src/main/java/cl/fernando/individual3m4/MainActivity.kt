package cl.fernando.individual3m4

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Eliminar los valores nulos de las variables y agregando las inicializaciones tardias
    // lateinit
    private lateinit var num1: EditText
    private lateinit var num2: EditText
    private lateinit var textResultado: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        textResultado = findViewById(R.id.textResultado)
        val suma = findViewById<Button>(R.id.btmsuma)
        val resta = findViewById<Button>(R.id.btnresta)
        val division = findViewById<Button>(R.id.btndivision)
        val multiplicacion = findViewById<Button>(R.id.btnmultiplicacion)
        val btnSalir = findViewById<Button>(R.id.btnSalir)

        //Toast.makeText(this, "hi", Toast.LENGTH_LONG).show();
        //Snackbar.make(MainActivity, "hi",Snackbar.LENGTH_LONG).show()

        suma.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 + numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(
                    baseContext,
                    "Apretaste Sumar, resultado: $resultado",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        resta.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 - numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(
                    baseContext,
                    "Apretaste Resta, resultado: $resultado",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        division.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString()
                    .isEmpty() || num2.getText().toString().toInt() == 0
            ) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 / numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(
                    baseContext,
                    "Apretaste Division, resultado: $resultado",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        multiplicacion.setOnClickListener {
            if (num1.getText().toString().isEmpty() || num2.getText().toString().isEmpty()) {
                Toast.makeText(baseContext, "Rellenar los campos vacios.", Toast.LENGTH_LONG).show()
            } else {
                val numero1 = num1.getText().toString().toDouble()
                val numero2 = num2.getText().toString().toDouble()
                val resultado = numero1 * numero2
                textResultado.setText("Resultado: $resultado")
                Toast.makeText(
                    baseContext,
                    "Apretaste multiplicacion, resultado: $resultado",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
        btnSalir.setOnClickListener {
            finish() // Cierra la actividad actual y sale de la aplicación
        }
    }
}