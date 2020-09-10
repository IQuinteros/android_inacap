package com.iquinteros.primerproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.iquinteros.primerproyecto.MESSAGE";
    private EditText editNombre;
    private EditText editEdad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* Cuando hay algún error de importación, esto podría marcarse en rojo */
        setContentView(R.layout.activity_main);

        editNombre = findViewById(R.id.NombreCliente);
        editEdad = findViewById(R.id.EdadCliente);
    }

    /* view -> Contexto. Quién llama a la función */
    public void onClick(View view){
        String nombre, edad;
        nombre = editNombre.getText().toString();
        edad = editEdad.getText().toString();

        /* El activity debería llamar al Toast */
        String toDisplay = "Nombre: " + nombre + "\nEdad: " + edad;
        Toast.makeText(this, toDisplay, Toast.LENGTH_SHORT).show();
    }

    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.NombreCliente);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}