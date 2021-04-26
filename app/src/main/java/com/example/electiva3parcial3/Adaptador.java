package com.example.electiva3parcial3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {

    private Context context;
    private String[] nombre_juego;
    private int [] Portadas_juego;
    TextView nombre;
    ImageView imagen_juego;

    public Adaptador(Context context, String[] nombre_juego, int
            [] Portadas_juego)
    {
        this.context = context;
        this.nombre_juego = nombre_juego;
        this.Portadas_juego = Portadas_juego;
    }

    @Override
    public int getCount() {
        return nombre_juego.length;
    }
    @Override
    public Object getItem(int position) {
        return null;
    }
    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup
            parent) {
        View v;
        if(convertView==null){
            LayoutInflater
                    inflater=(LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            v=new View(context);
            v=inflater.inflate(R.layout.fila,null);
        }
        else {
            v=(View)convertView;
        }
        nombre=(TextView)v.findViewById(R.id.txtJuego);
        imagen_juego=(ImageView)v.findViewById(R.id.txtPortada);
        nombre.setText(nombre_juego[position]);
        imagen_juego.setImageResource(Portadas_juego[position]);
        return v;
    }

}
