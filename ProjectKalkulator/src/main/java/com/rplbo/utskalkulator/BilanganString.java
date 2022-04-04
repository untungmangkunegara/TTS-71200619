package com.rplbo.utskalkulator;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String bilanganstring) {
        String lower = bilanganstring.toLowerCase();
        this.bilanganstring = lower;
        if (lower.equals("dua")) {
            this.bilangan=2;
        }
        if (lower.equals("tiga")) {
            this.bilangan=3;
        }
        if (lower.equals("dua belas")) {
            this.bilangan=12;
        }
        if (lower.equals("tiga belas")) {
            this.bilangan=13;
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
