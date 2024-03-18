package com.example.rycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<atribut> items = new ArrayList<atribut>();
        items.add(new atribut("Nama : Abmi Sukma Edri","NIM : 12250120341","Kelas A",R.drawable.sukma));
        items.add(new atribut("Nama : Ahmad Kurniawan","NIM  : 12250111514","Kelas A",R.drawable.amad));
        items.add(new atribut("Nama : Aufa Hajati","NIM : 12250120338", "kelas A",R.drawable.aufa));
        items.add(new atribut("Nama : Daffa Finanda ","NIM : 12250111603","Kelas A",R.drawable.dapin));
        items.add(new atribut("Nama : Daffa Ikhwan N","NIM : 12250110979","Kelas A",R.drawable.dafa));
        items.add(new atribut("Nama : Diki Afdol","NIM : 12250110383","Kelas A",R.drawable.mail));
        items.add(new atribut("Nama : Dwi Jelita A","NIM : 12250120331","Kelas A",R.drawable.jelita));
        items.add(new atribut("Nama : Dwi Mahdini","NIM : 12250111298","Kelas A",R.drawable.dwi));
        items.add(new atribut("Nama : Fajri","NIM : 12250110382","Kelas A",R.drawable.fajri));
        items.add(new atribut("Nama : Fakhri","NIM : 12250111381","Kelas A",R.drawable.fakhri));
        items.add(new atribut("Nama : Farras Lathief","NIM : 12250111328","Kelas A",R.drawable.farras));
        items.add(new atribut("Nama : Gilang Ramadhan I","NIM : 12250111323","Kelas A",R.drawable.gilang));
        items.add(new atribut("Nama : Hafidz Alhadid R","NIM : 12250111794","Kelas A",R.drawable.hafidz));
        items.add(new atribut("Nama : Haritsah Naufaldy","NIM : 12250110361","Kelas A",R.drawable.aldy));
        items.add(new atribut("Nama : M.Nabil Dawami","NIM : 12250111527","Kelas A",R.drawable.nabil));
        items.add(new atribut("Nama : Muh.Zaki Erbay Syas","NIM : 12250111134","Kelas A",R.drawable.zaki));
        items.add(new atribut("Nama : Muhammad Aditya R","NIM : 12250111048","Kelas A",R.drawable.adit));
        items.add(new atribut("Nama : Muhammad Dhimas H","NIM : 12250111231","Kelas A",R.drawable.dimas));
        items.add(new atribut("Nama : Muhammad Faruq","NIM : 12250111791","Kelas A",R.drawable.faruq));
        items.add(new atribut("Nama : Muhammad Rafly W","NIM : 12250111489","Kelas A",R.drawable.rafly));
        items.add(new atribut("Nama : Nurika Dwi Wahyuni","NIM : 12250120360","Kelas A",R.drawable.nurika));
        items.add(new atribut("Nama : Ogya Secio Nugroho.S","NIM : 12250111346","Kelas A",R.drawable.ogi));
        items.add(new atribut("Nama : Rahma Laksita","NIM : 12250124357","Kelas A",R.drawable.rahma));
        items.add(new atribut("Nama : Raka Sabri","NIM : 12250110342","Kelas A",R.drawable.mail));
        items.add(new atribut("Nama : Surya Hidayatullah F","NIM : 12250111759","Kelas A",R.drawable.surya));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new tampilkan(getApplicationContext(),items));

    }
}