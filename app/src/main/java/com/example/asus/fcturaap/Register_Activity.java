package com.example.asus.fcturaap;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class Register_Activity extends AppCompatActivity {
Button boton,salir;
EditText nombre, apellido,correo,telefono,ciudad;
CheckBox condiciones, autorizacion;
String NumbreUsuario,ApellidoUsuario;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_);

        boton=(Button)findViewById(R.id.buttonRegistro);
        nombre=(EditText)findViewById(R.id.editTextNombre);
        apellido=(EditText)findViewById(R.id.editTextApellido);
        telefono=(EditText)findViewById(R.id.editTextTelefono);
        ciudad=(EditText)findViewById(R.id.editTextCiudad);
        condiciones=(CheckBox)findViewById(R.id.checkBoxCondiciones);
        autorizacion=(CheckBox)findViewById(R.id.checkBox2);
        salir=(Button)findViewById(R.id.btSalir);

        boton.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override

            public void onClick(View v) {
               startActivity(new Intent(Register_Activity.this,Confirmacion_Registro.class));
            NumbreUsuario=nombre.getText().toString();
            ApellidoUsuario=apellido.getText().toString();

            }

        });




    };

    public void salirAhora(View View){
        finish();
    }



    }


