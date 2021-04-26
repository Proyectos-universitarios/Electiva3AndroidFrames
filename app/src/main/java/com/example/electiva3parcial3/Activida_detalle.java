package com.example.electiva3parcial3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Activida_detalle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activida_detalle);
        Bundle extras = getIntent().getExtras();
        int i = extras.getInt("identificador");
        Fragmento_detalle obj=(Fragmento_detalle)getSupportFragmentManager().findFragmentById
                (R.id.f_detalle);
        obj.detalle(i);
    }

}