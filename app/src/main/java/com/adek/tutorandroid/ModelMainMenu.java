package com.adek.tutorandroid;

/**
 * Created by Adek on 11/03/2018.
 */

public class ModelMainMenu {

    private String judul;
    private int gambar;

    public String getJudul(){
        return judul;
    }

    public int getGambar(){
        return gambar;
    }

    public ModelMainMenu(String judul, int gambar){
        this.judul = judul;
        this.gambar = gambar;
    }
}
