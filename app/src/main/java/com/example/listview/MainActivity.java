package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.listview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ActivityMainBinding binding;
    private List<Opcion> miLista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        miLista = new ArrayList<>();
        miLista.add(new Opcion("Lista 1"));
        miLista.add(new Opcion("Lista 2"));
        miLista.add(new Opcion("Lista 3"));
        miLista.add(new Opcion("Lista 4"));
        miLista.add(new Opcion("Lista 5"));

        MiAdaptador miAdaptador = new MiAdaptador(this, R.layout.opciones_item, miLista);
        binding.listView.setAdapter(miAdaptador);

        binding.listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "Opción seleccionada: " + miLista.get(i), Toast.LENGTH_SHORT).show();
    }
}