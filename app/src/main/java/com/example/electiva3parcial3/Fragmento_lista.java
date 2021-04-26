package com.example.electiva3parcial3;

import android.content.Context;
import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Fragmento_lista extends Fragment {

    String[] nombre_equipo;
    ListView portada;
    Enlace enlace;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragmento_lista() {
        // Required empty public constructor
    }

    public interface Enlace {
        public void mostrar(int item);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup
            container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_fragmento_lista,
                container, false);

        nombre_equipo=getResources().getStringArray(R.array.viedojuegos);
        int[] imagen={R.drawable.caratulalastusparteii,R.drawable.caratulasupermariogalaxy2,
                R.drawable.reddeadredemption2caratulaprovisional,R.drawable.caratulametalgearsolid,R.drawable.supermariooddyseycaratula,
                R.drawable.caratulastarcraft2,R.drawable.mgsportada,R.drawable.caratulastarcraft2wingsliberty,
                R.drawable.mgsportada,R.drawable.re2psxportada};

        portada=(ListView)v.findViewById(R.id.lstLista);
        Adaptador adapte=new
                Adaptador(getActivity().getApplicationContext(),nombre_equipo,imagen);
        portada.setAdapter(adapte);
        portada.setOnItemClickListener(new
          AdapterView.OnItemClickListener() {
              @Override
              public void onItemClick(AdapterView<?> parent, View
                      view, int position, long id) {
                  enlace.mostrar(position);
              }
          });
        // Inflate the layout for this fragment
        return v;
    }
    @Override
    public void onAttach(Context context) {
        enlace=(Enlace)context;
        super.onAttach(context);
    }

}