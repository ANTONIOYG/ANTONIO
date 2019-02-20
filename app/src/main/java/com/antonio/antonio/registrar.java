package com.antonio.antonio;

import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class registrar extends Activity {

    EditText id,mes,dia,hentrada,hsalida,obra,compi;

    Button grabar,limpiar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        grabar = (Button) findViewById(R.id.grabar);
        limpiar =(Button) findViewById(R.id.limpiar);

        id = (EditText) findViewById(R.id.tid);
        mes = (EditText) findViewById(R.id.tmes);
        dia = (EditText) findViewById(R.id.tdia);
        hentrada = (EditText) findViewById(R.id.hentrada);
        hsalida = (EditText) findViewById(R.id.hsalida);
        obra = (EditText) findViewById(R.id.tobra);
        compi = (EditText) findViewById(R.id.compi);

        final Admin conn = new Admin(this);


        try{
            grabar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    /* intent i = new intent(); */
                    SQLiteDatabase db = conn.getWritableDatabase();

                    ContentValues values = new ContentValues();
                    values.put(estructura_db.COLID, id.getText().toString());
                    values.put(estructura_db.MES, mes.getText().toString());
                    values.put(estructura_db.DIA, dia.getText().toString());
                    values.put(estructura_db.ENTRADA, hentrada.getText().toString());
                    values.put(estructura_db.SALIDA, hsalida.getText().toString());
                    values.put(estructura_db.OBRA, obra.getText().toString());
                    values.put(estructura_db.COMPI, compi.getText().toString());

                    long newROWId = db.insert(estructura_db.TABLA, null, values);

                    Toast.makeText(getApplicationContext(), "SE GUARDO EL REGISTRO CON CLAVE: "
                            +newROWId, Toast.LENGTH_LONG).show();

                }
            });
        }catch(Exception e){
            Toast.makeText(getApplicationContext()," ERROR EN REGISTRAR ", LENGTH_LONG).show();
        conn.close();

         }

        limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                id.setText("");
                mes.setText("");
                dia.setText("");
                hentrada.setText("");
                hsalida.setText("");
                obra.setText("");
                compi.setText("");

            }
        });
    }
}
