package com.example.electiva3parcial3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements
        Fragmento_lista.Enlace {

    private boolean dosFragmentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if(findViewById(R.id.f_tablet_detalle)!=null)
        {
            dosFragmentos=true;
        }
    }

    @Override
    public void mostrar(int item) {
        if(dosFragmentos){
            Fragmento_detalle obj = (Fragmento_detalle)getSupportFragmentManager().findFragmentById(R.id.f_tablet_detalle);
            obj.detalle(item);
        }
        else{
            Intent enviarDetalle=new Intent(this,Activida_detalle.class);
            enviarDetalle.putExtra("identificador",item);
            startActivity(enviarDetalle);
        }
    }


}