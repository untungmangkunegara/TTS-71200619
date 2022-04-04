package com.uts.prakrplbo;

import java.util.ArrayList;
import java.util.List;

public class Keranjang {
    private List daftarBuah;

    public Keranjang() {
    }

    List<String> myList = new ArrayList<>();
    List<String> myList2 = new ArrayList<>();

    public void addMangga(){
        myList.add("Mangga");
    }

    public void addApel(){
        myList2.add("Apel");
    }

    public void removeMangga(){
        myList.remove("Mangga");
    }

    public void removeApel(){
        myList2.remove("Apel");
    }

    public void tambahProduk(Mangga manggaKu){
        addMangga();
        System.out.println("Mangga berhasil ditambahkan ke dalam keranjang!");
    }

    public void tambahProduk(Apel apelKu){
        addApel();
        System.out.println("Apel berhasil ditambahkan ke dalam keranjang!");
    }

    public void hapusProduk(Mangga manggaku){
        removeMangga();
        System.out.println("Mangga berhasil dikeluarkan dari dalam keranjang!");
    }

    public void hapusProduk(Apel apelKu){
        removeApel();
        System.out.println("Apel sudah tidak ada di dalam keranjang!");
    }

    public void getKeranjang() {
        int size = myList.size();
        int size2 = myList2.size();
        if (myList.contains("Mangga")) {
            System.out.println("Mangga [Rp2.000,00] x "+ size);
            System.out.println("Total : Rp"+size*2000);
        }
        if (myList.contains("Apel")) {
            System.out.println("Apel [Rp3.000,00] x "+ size2);
            System.out.println("Total : Rp"+(size2*3000));
        }
        if (myList.contains("Mangga") && myList2.contains("Apel")) {
            System.out.println("Apel [Rp3.000,00] x "+ size2);
            System.out.println("Total : Rp"+(size*2000+ size2*3000));
        }
    }
}
