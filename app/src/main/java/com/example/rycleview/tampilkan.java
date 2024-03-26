package com.example.rycleview;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class tampilkan extends RecyclerView.Adapter<tampilkan.PreviewViewHolder> {

    Context context;
    List<atribut> items;
    private OnItemClickListener listener;

    // Inner interface untuk menangani klik item RecyclerView
    public interface OnItemClickListener {
        void onItemClick(atribut atribut);
    }

    // Metode setter untuk listener
    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public tampilkan(Context context, List<atribut> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public PreviewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.preview, parent, false);
        return new PreviewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PreviewViewHolder holder, int position) {
        atribut currentItem = items.get(position);

        holder.nameView.setText("Nama : " + currentItem.getName());
        holder.nimView.setText("NIM : " + currentItem.getNim());
        holder.kelasView.setText(currentItem.getKelas());
        holder.fotoView.setImageResource(currentItem.getFoto());



        // Menangani klik item RecyclerView
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(currentItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    // Kelas ViewHolder
    public static class PreviewViewHolder extends RecyclerView.ViewHolder {
        ImageView fotoView;
        TextView nameView, nimView, kelasView, tanggallahirView, angkatanView;

        public PreviewViewHolder(@NonNull View itemView) {
            super(itemView);
            fotoView = itemView.findViewById(R.id.foto);
            nameView = itemView.findViewById(R.id.name);
            nimView = itemView.findViewById(R.id.nim);
            kelasView = itemView.findViewById(R.id.kelas);
            tanggallahirView = itemView.findViewById(R.id.tanggallahir);
            angkatanView = itemView.findViewById(R.id.angkatan);
        }
    }
}
