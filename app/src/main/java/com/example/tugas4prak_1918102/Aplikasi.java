package com.example.tugas4prak_1918102;

public class Aplikasi {
    private String namaapk,jenisapk,tahunapk;
    private int fotoapk;
    public Aplikasi(int foto,String nama, String jenis, String tahun) {
        this.fotoapk = foto;
        this.namaapk = nama;
        this.jenisapk = jenis;
        this.tahunapk = tahun;
    }

    public int getFoto(){
        return fotoapk;
    }

    public String getNama() {
        return namaapk;
    }

    public String getJenis() {
        return jenisapk;
    }

    public String getTahun() {
        return tahunapk;
    }
}
