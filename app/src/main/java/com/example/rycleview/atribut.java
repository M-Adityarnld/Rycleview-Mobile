package com.example.rycleview;

public class atribut {

    String name;
    String nim;
    String kelas;

    int foto;

    public atribut(String name, String nim, String kelas, int foto) {
        this.name = name;
        this.nim = nim;
        this.kelas = kelas;
        this.foto = foto;
    }

    public String getName() {
        return name;
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


    public int getFoto() {
        return foto;
    }

    public void setImage(int foto) {
        this.foto = foto;
    }
}