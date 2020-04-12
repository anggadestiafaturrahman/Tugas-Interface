package com.belajar;

public class Superman implements Film,GenreFilm {

    @Override
    public void namafilm() {
        System.out.println("Nama Film : Superman III");
    }

    @Override
    public int tahun() {
        return 1983;
    }

    @Override
    public void namagenre() {
        System.out.println("Genre Film : Action");
    }

    @Override
    public void kategoripenonton() {
        System.out.println("Kategori Film : Remaja ");
    }

    @Override
    public int umurpenonton() {
        return 18;
    }
}
