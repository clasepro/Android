package com.example.holausuario;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
      //Obtenemos una referencia a los controles de la interfaz
        final EditText txtNombre = (EditText)findViewById(R.id.TxtNombre);
        final Button btnHola = (Button)findViewById(R.id.BtnHola);
        
        //Implementamos el evento “click” del botón
        btnHola.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// Creamos el Intent
				Intent miintent = new Intent(MainActivity.this, saludo.class);
				
				//Creamos la información a pasar entre actividades
                Bundle b = new Bundle();
                b.putString("NOMBREUSER", txtNombre.getText().toString());

                //Añadimos la información al intent
                miintent.putExtras(b);

                //Iniciamos la nueva actividad
                startActivity(miintent);
				
			}
		});
    }
}
