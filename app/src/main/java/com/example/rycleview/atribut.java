package com.example.rycleview;

public class atribut {

    String name;
    String nim;
    String kelas;

    String tanggallahir;

    String angkatan;

    int foto;

    public atribut(String name, String nim, String kelas,String tanggallahir, String angkatan, int foto) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.tanggallahir = tanggallahir;
        this.angkatan = angkatan;
        this.foto = foto;

    }

    public String getName() {
        return   name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getKelas(){
        return kelas;
    }

    public void setKelas(String kelas){this.kelas = kelas;}

    public String getTanggallahir() {
        return tanggallahir;
    }

    public void setTanggallahir(String tanggallahir) {
        this.tanggallahir = tanggallahir;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }

    public int getFoto() {
        return foto;
    }

    public void setImage(int foto) {
        this.foto = foto;
    }
}