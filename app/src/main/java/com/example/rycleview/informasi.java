package com.example.rycleview;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class informasi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informasi);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String name = extras.getString("name");
            String nim = extras.getString("nim");
            String kelas = extras.getString("kelas");
            String angkatan = extras.getString("angkatan");
            String tanggalahir = extras.getString("tanggallahir");
            int foto = extras.getInt("foto");

            // Menampilkan data atribut pada layout detail
            ImageView fotoView = findViewById(R.id.foto);
            TextView nameView = findViewById(R.id.name);
            TextView nimView = findViewById(R.id.nim);
            TextView kelasView = findViewById(R.id.kelas);
            TextView tanggallahirView = findViewById(R.id.tanggallahir);
            TextView angkatanView = findViewById(R.id.angkatan);

            fotoView.setImageResource(foto);
            nameView.setText(name);
            nimView.setText(nim);
            kelasView.setText(kelas);
            tanggallahirView.setText(tanggalahir);
            angkatanView.setText(angkatan);

            String nimText = "NIM : " + nim;
            String tanggallahirText = "Tanggal Lahir : " + tanggalahir;
            String angkatanText = "Angkatan : " + angkatan;
            nimView.setText(nimText);
            tanggallahirView.setText(tanggallahirText);
            angkatanView.setText(angkatanText);


        }
    }
}
