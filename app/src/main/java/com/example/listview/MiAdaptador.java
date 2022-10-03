package com.example.listview;

import android.content.Context;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;

import java.util.List;

public class MiAdaptador extends ArrayAdapter {

    public MiAdaptador(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
    }
}
