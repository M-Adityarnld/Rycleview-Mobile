package com.example.rycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class tampilkan extends RecyclerView.Adapter<View> {


    Context context;
    List<atribut> items;

    public tampilkan(Context context, List<atribut> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public View onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        return new View(LayoutInflater.from(context).inflate(R.layout.preview,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull View holder, int position) {
        holder.nameView.setText(items.get(position).getName());
        holder.nimView.setText(items.get(position).getNim());
        holder.kelasView.setText(items.get(position).getKelas());
        holder.fotoView.setImageResource(items.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}