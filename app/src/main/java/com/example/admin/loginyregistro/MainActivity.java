package com.example.admin.loginyregistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Cogemos la clase que queremos que abra de primeras.
        Intent intent = new Intent(this,LoginActivity.class);

        //Creamos una bandera que crea la nueva tarea y despues eliminamos la actividad anterior(en este caso,el main)para que no se pueda mostrar
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }
}
