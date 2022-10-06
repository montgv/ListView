package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class MiAdaptador extends ArrayAdapter {

    private Context ctx;
    private int layoutTemplate;
    private List<Opcion> opcionLista;

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);

        this.ctx = context;
        this.layoutTemplate = resource;
        this.opcionLista = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = LayoutInflater.from(ctx).inflate(layoutTemplate, parent, false);

        Opcion elementoActual = (Opcion) opcionLista.get(position);

        TextView textViewOpciones = (TextView) v.findViewById(R.id.textViewItem);
        ImageView imagenViewOpciones = (ImageView) v.findViewById(R.id.imageViewItem);

        textViewOpciones.setText(elementoActual.getOpcion());

        if (elementoActual.getOpcion() == "Lista 1") {
            imagenViewOpciones.setImageResource(R.drawable.ic_uno);
        } else {
            imagenViewOpciones.setImageResource(R.drawable.ic_dos);
        }

        return v;
    }
}