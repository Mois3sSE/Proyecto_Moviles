package com.example.proyectofinal

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class ConsultasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_consultas)

        // Buscamos la fila a la que le pusimos el ID
        val fila1 = findViewById<LinearLayout>(R.id.filaEjemplo1)

        // Al hacer clic en la fila, llamamos a la función que muestra el cuadro
        fila1.setOnClickListener {
            mostrarDialogoEdicion()
        }
    }

    private fun mostrarDialogoEdicion() {
        // Inflamos (cargamos) el diseño XML del cuadro emergente
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_editar_estatus, null)

        // Construimos el AlertDialog
        val builder = AlertDialog.Builder(this)
        builder.setView(dialogView)
        val dialog = builder.create()

        // Configuramos los botones dentro del cuadro para que lo cierren al hacer clic
        val btnActualizar = dialogView.findViewById<Button>(R.id.btnActualizar)
        val btnEliminar = dialogView.findViewById<Button>(R.id.btnEliminarDialog)

        btnActualizar.setOnClickListener {
            dialog.dismiss() // Cierra el cuadro
        }

        btnEliminar.setOnClickListener {
            dialog.dismiss() // Cierra el cuadro
        }

        // Mostramos el cuadro en pantalla
        dialog.show()
    }
}