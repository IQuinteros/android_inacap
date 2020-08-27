/*
*   IGNACIO QUINTEROS FUENTES
* */

package com.iquinteros.app_inacap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    /*
    * Cada activity, suele tener su respectivo XML
    *
    * En el archivo XML, estará lo "visual" de la app.
    * */

    /*
    * Si aparecen errores, lo más probable es que sean problemas de versiones
    * */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}