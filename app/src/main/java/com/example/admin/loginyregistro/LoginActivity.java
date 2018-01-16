package com.example.admin.loginyregistro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    protected TextView mensajeRegistro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //quitamos la barra superior de la ventana(dnd sale el nombre que tiene el layout)
        getSupportActionBar().hide();

        mensajeRegistro = (TextView)findViewById(R.id.txt_registrate);

        mensajeRegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Despues de crear el oyente, hacemos que se muestre la vista signup
                Intent intent = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(intent);
            }
        });


    }
}
