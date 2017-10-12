package com.example.heri.resepmakanan;

/**
 * Created by Heri on 09/10/2017.
 */

public class Resep {
    private String Judul, Bahan;
    private int Gambar;

    public Resep(String judul, int gambar , String bahan) {
        Judul = judul;
        Bahan = bahan;
        Gambar = gambar;
    }

    public String getJudul() {
        return Judul;
    }

    public String getBahan() {
        return Bahan;
    }


    public int getGambar() {
        return Gambar;
    }

    public void setJudul(String judul) {
        Judul = judul;
    }

    public void setBahan(String bahan) {
        Bahan = bahan;
    }

    public void setGambar(int gambar) {
        Gambar = gambar;
    }

}
