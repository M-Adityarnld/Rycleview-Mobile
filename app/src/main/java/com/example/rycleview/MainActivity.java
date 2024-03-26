package com.example.rycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<atribut> items = new ArrayList<atribut>();
        items.add(new atribut(" Abmi Sukma Edri"," 12250120341","Kelas A","01 Januari 2003","22",R.drawable.sukma));
        items.add(new atribut(" Ahmad Kurniawan"," 12250111514","Kelas A","01 Januari 2003","22",R.drawable.amad));
        items.add(new atribut(" Aufa Hajati"," 12250120338", "kelas A","01 Januari 2003","22",R.drawable.aufa));
        items.add(new atribut(" Daffa Finanda "," 12250111603","Kelas A","01 Januari 2003","22",R.drawable.dapin));
        items.add(new atribut(" Daffa Ikhwan N"," 12250110979","Kelas A","01 Januari 2003","22",R.drawable.dafa));
        items.add(new atribut(" Diki Afdol"," 12250110383","Kelas A","01 Januari 2003","22",R.drawable.mail));
        items.add(new atribut(" Dwi Jelita A"," 12250120331","Kelas A","01 Januari 2003","22",R.drawable.jelita));
        items.add(new atribut(" Dwi Mahdini"," 12250111298","Kelas A","01 Januari 2003","22",R.drawable.dwi));
        items.add(new atribut(" Fajri"," 12250110382","Kelas A","01 Januari 2003","22",R.drawable.fajri));
        items.add(new atribut(" Fakhri"," 12250111381","Kelas A","01 Januari 2003","22",R.drawable.fakhri));
        items.add(new atribut(" Farras Lathief"," 12250111328","Kelas A","01 Januari 2003","22",R.drawable.farras));
        items.add(new atribut(" Gilang Ramadhan I"," 12250111323","Kelas A","01 Januari 2003","22",R.drawable.gilang));
        items.add(new atribut(" Hafidz Alhadid R"," 12250111794","Kelas A","01 Januari 2003","22",R.drawable.hafidz));
        items.add(new atribut(" Haritsah Naufaldy"," 12250110361","Kelas A","01 Januari 2003","22",R.drawable.aldy));
        items.add(new atribut(" M.Nabil Dawami"," 12250111527","Kelas A","01 Januari 2003","22",R.drawable.nabil));
        items.add(new atribut(" Muh.Zaki Erbay Syas"," 12250111134","Kelas A","01 Januari 2003","22",R.drawable.zaki));
        items.add(new atribut(" Muhammad Aditya R"," 12250111048","Kelas A","20 Agustus 2004","22",R.drawable.adit));
        items.add(new atribut(" Muhammad Dhimas H"," 12250111231","Kelas A","01 Januari 2003","22",R.drawable.dimas));
        items.add(new atribut(" Muhammad Faruq"," 12250111791","Kelas A","01 Januari 2003","22",R.drawable.faruq));
        items.add(new atribut(" Muhammad Rafly W"," 12250111489","Kelas A","01 Januari 2003","22",R.drawable.rafly));
        items.add(new atribut(" Nurika Dwi Wahyuni"," 12250120360","Kelas A","01 Januari 2003","22",R.drawable.nurika));
        items.add(new atribut(" Ogya Secio Nugroho.S"," 12250111346","Kelas A","01 Januari 2003","22",R.drawable.ogi));
        items.add(new atribut(" Rahma Laksita"," 12250124357","Kelas A","01 Januari 2003","22",R.drawable.rahma));
        items.add(new atribut(" Raka Sabri","  12250110342","Kelas A","01 Januari 2003","22",R.drawable.mail));
        items.add(new atribut(" Surya Hidayatullah F"," 12250111759","Kelas A","01 Januari 2003","22",R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        tampilkan adapter = new tampilkan(this, items);
        recyclerView.setAdapter(adapter);
        adapter.setOnItemClickListener(this::onItemClick);


    }

    public void onItemClick(atribut atribut) {
        // Menangani klik item RecyclerView
        Intent intent = new Intent(this, informasi.class);
        intent.putExtra("name", atribut.getName());
        intent.putExtra("nim", atribut.getNim());
        intent.putExtra("kelas", atribut.getKelas());
        intent.putExtra("tanggallahir", atribut.getTanggallahir());
        intent.putExtra("angkatan", atribut.getAngkatan());
        intent.putExtra("foto", atribut.getFoto());
        startActivity(intent);
    }
}