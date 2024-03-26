package com.example.rycleview;


import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Pratinjau extends RecyclerView.ViewHolder {

    ImageView fotoView;
    TextView nameView, nimView, kelasView, tanggallahirView, angkatanView;

    public Pratinjau(@NonNull View itemView) {
        super(itemView);
        fotoView = itemView.findViewById(R.id.foto);
        nameView = itemView.findViewById(R.id.name);
        nimView = itemView.findViewById(R.id.nim);
        kelasView = itemView.findViewById(R.id.kelas);
        tanggallahirView = itemView.findViewById(R.id.tanggallahir);
        angkatanView = itemView.findViewById(R.id.angkatan);
    }
}
