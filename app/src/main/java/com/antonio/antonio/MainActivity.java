package com.antonio.antonio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Admin db = new Admin(this);
    }

        public void registrar(View view){

            Intent i = new Intent(this, registrar.class);

            startActivity(i);
        }

        public void buscar(View view){

            Intent i = new Intent(this, menu.class);

            startActivity(i);
        }

        public void actualizar(View view){

            Intent i = new Intent(this, menu.class);

            startActivity(i);
        }

        public void borrar(View view){

            Intent i = new Intent(this, menu.class);

            startActivity(i);
        }

        public void salir(View view){

            finish();
        }


}
