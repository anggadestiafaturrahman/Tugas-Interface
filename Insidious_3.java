package com.belajar;

public class Insidious_3 implements Film,GenreFilm  {

    @Override
    public void namafilm() {
        System.out.println("Nama Film : Insidious 3");
    }

    @Override
    public int tahun() {
        return 2015;
    }

    @Override
    public void namagenre() {
        System.out.println("Genre Film : Horror");
    }

    @Override
    public void kategoripenonton() {
        System.out.println("Kategori Film : Remaja");
    }

    @Override
    public int umurpenonton() {
        return 18;
    }
}
