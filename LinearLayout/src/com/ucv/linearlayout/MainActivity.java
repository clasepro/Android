package com.ucv.linearlayout;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //referenciando a txtMensaje
        TextView texto=(TextView) findViewById(R.id.txtMensaje); 
        		
        
        //Tipos de datos:
        //Enteros
        int numeroentero=12;
        numeroentero=18;
        
        //Texto
        String cadenatexto="Esto es un texto";
        
        //Decimal:
        double decimal=10.2;
        
        //Booleano:
        boolean boleano=false;
        boleano=true;
        
        //Arreglo unidimencional:
        int [] arreglo = new int[] {1,2,3,4,5,6};
        //arreglo[3];
        texto.setText("La posicion 3 del Array: "+arreglo[3]);
        
        
        
        
        //CONDICIONALES
        //IF:
        if (numeroentero>10) {
			cadenatexto="aprobado";
		} else {
			cadenatexto="desaprobado";
		}

        //SWITCH:
        switch (numeroentero) {
		case 0:
			cadenatexto="verano";
			break;
		case 1:
			cadenatexto="invierno";
			break;
		default:
			break;
		}  

        
        //CICLOS O REPETIVOS:
        //FOR:
        for (int i = 0; i < arreglo.length; i++) {
			texto.setText(arreglo[i]);
		}
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

   
}
