package com.example.holausuario;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class saludo extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.saludo);
		
		//Localizar los controles
        TextView Saludo = (TextView)findViewById(R.id.TxtSaludo);

        //Recuperamos la información pasada en el intent
        Bundle bundle = this.getIntent().getExtras();

        //Construimos el mensaje a mostrar
        Saludo.setText("Hola " + bundle.getString("NOMBREUSER"));
	}

}
