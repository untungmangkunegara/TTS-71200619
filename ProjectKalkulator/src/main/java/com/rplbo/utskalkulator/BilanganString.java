package com.rplbo.utskalkulator;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring) {
        String lower = bilanganstring.toLowerCase();
        this.bilanganstring = lower;
        if (lower.equals("satu")) {
            this.bilangan=1;
        }
        if (lower.equals("dua")) {
            this.bilangan=2;
        }
        if (lower.equals("tiga")) {
            this.bilangan=3;
        }
        if (lower.equals("empat")) {
            this.bilangan=4;
        }
        if (lower.equals("lima")) {
            this.bilangan=5;
        }
        if (lower.equals("enam")) {
            this.bilangan=6;
        }
        if (lower.equals("tujuh")) {
            this.bilangan=7;
        }
        if (lower.equals("delapan")) {
            this.bilangan=8;
        }
        if (lower.equals("sembilan")) {
            this.bilangan=9;
        }
        if (lower.equals("sepuluh")) {
            this.bilangan=10;
        }
        if (lower.equals("sebelas")) {
            this.bilangan=11;
        }
        if (lower.equals("dua belas")) {
            this.bilangan=12;
        }
        if (lower.equals("tiga belas")) {
            this.bilangan=13;
        }
        if (lower.equals("empat belas")) {
            this.bilangan=14;
        }
        if (lower.equals("lima belas")) {
            this.bilangan=15;
        }
        if (lower.equals("enam belas")) {
            this.bilangan=16;
        }
        if (lower.equals("tujuh belas")) {
            this.bilangan=17;
        }
        if (lower.equals("delapan belas")) {
            this.bilangan=18;
        }
        if (lower.equals("sembilan belas")) {
            this.bilangan=19;
        }
        if (lower.equals("dua puluh")) {
            this.bilangan=20;
        }
    }

    public int getBilangan() {
        return bilangan;
    }

    public boolean apakahDuaDigit() {
        if (bilanganstring.length() > 2){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean apakahLebihDari10() {
        if (bilangan > 10){
            return true;
        }
        else {
            return false;
        }
    }
}
