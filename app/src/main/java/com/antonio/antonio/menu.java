package com.antonio.antonio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;

public class menu extends AppCompatActivity implements View.OnClickListener{

    EditText id,mes,dia,hentrada,hsalida,obra,compi;

    Button buscar,bmodi,borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        final Admin conn = new Admin(this);



        id = (EditText) findViewById(R.id.tid);
        mes = (EditText) findViewById(R.id.mes);
        dia = (EditText) findViewById(R.id.dia);
        hentrada = (EditText) findViewById(R.id.hentrada);
        hsalida = (EditText) findViewById(R.id.hsalida);
        obra = (EditText) findViewById(R.id.obra);
        compi = (EditText) findViewById(R.id.compi);

        buscar = (Button) findViewById(R.id.buscar);
        bmodi = (Button) findViewById(R.id.bmodi);
        borrar = (Button) findViewById(R.id.borrar);


}
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.buscar:
                Buscar();
                break;
            case R.id.bmodi:
                aztualizar();
                break;
            case R.id.borrar:
                Borrar();
                break;
        }

    }



    private void Buscar() {
        Toast.makeText(getApplicationContext(),"METODO BUSCAR",Toast.LENGTH_LONG).show();
    }

    private void aztualizar(){
        Toast.makeText(getApplicationContext(),"METODO AZTUALIZAR",Toast.LENGTH_LONG).show();
    }

    private void Borrar() {
        Toast.makeText(getApplicationContext(),"METODO BORRAR",Toast.LENGTH_LONG).show();
    }

}
