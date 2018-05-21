package com.example.asus.fcturaap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirmacion_Registro extends AppCompatActivity {

    Button boton;
    TextView texto;
     String usuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmacion__registro);

        usuario="Edwin Aldana";

    boton=(Button)findViewById(R.id.btSalir);
    texto=(TextView)findViewById(R.id.textViewUsuario);
    texto.setText(usuario);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View View) {
               finish(); ;
            }
        });



    }
}
