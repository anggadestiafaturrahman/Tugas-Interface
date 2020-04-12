package com.belajar;

public class Main {

    public static void main(String[] args) {
        System.out.println("INFORMASI FILM 1\n");
        Superman film1 = new Superman();
        film1.namafilm();
        System.out.println("Tahun pembuata Film : "+film1.tahun());
        film1.namagenre();
        film1.kategoripenonton();
        System.out.println("Umur Minimum Penonton : "+film1.umurpenonton());

        System.out.println("INFORMASI FILM 2\n");
        Insidious_3 film2 = new Insidious_3();
        film2.namafilm();
        System.out.println("Tahun pembuata Film : "+film2.tahun());
        film2.namagenre();
        film2.kategoripenonton();
        System.out.println("Umur Minimum Penonton : "+film2.umurpenonton());
    }
}
