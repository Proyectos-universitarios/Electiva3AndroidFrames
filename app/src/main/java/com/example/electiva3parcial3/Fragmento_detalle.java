package com.example.electiva3parcial3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;


public class Fragmento_detalle extends Fragment {
    String[] nombre_Juego;
    String[] descripcion_Juego;
    TextView nombreJuego, descripcionJuego;
    ImageView escudoJuego;

    int[] imagen = {R.drawable.caratulalastusparteii, R.drawable.caratulasupermariogalaxy2,
            R.drawable.reddeadredemption2caratulaprovisional, R.drawable.caratulametalgearsolid, R.drawable.supermariooddyseycaratula,
            R.drawable.caratulastarcraft2, R.drawable.mgsportada, R.drawable.caratulastarcraft2wingsliberty,
            R.drawable.mgsportada, R.drawable.re2psxportada};

    public Fragmento_detalle() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container, Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragmento_detalle, container,
                false);
        nombreJuego=(TextView)v.findViewById(R.id.f_detalle_txtJuego);
        descripcionJuego=(TextView)v.findViewById(R.id.f_detalle_txtDescripcion);
        escudoJuego=(ImageView)v.findViewById(R.id.f_detalle_imgJuego);
        // Inflate the layout for this fragment
        return v;
}

    public void detalle(int posicion){

        descripcion_Juego=getResources().getStringArray(R.array.descripcion);
        nombre_Juego=getResources().getStringArray(R.array.viedojuegos);
        nombreJuego.setText(nombre_Juego[posicion]);
        descripcionJuego.setText(descripcion_Juego[posicion]);
        escudoJuego.setImageResource(imagen[posicion]);
    }



    public void Regresar(View view) { getFragmentManager().popBackStack();}

}