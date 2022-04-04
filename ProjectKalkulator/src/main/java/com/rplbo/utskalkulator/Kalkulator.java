package com.rplbo.utskalkulator;

public class Kalkulator {
    private int bil1;
    private int bil2;
    private String op;

    public Kalkulator(BilanganString x, BilanganString y, Operator z) {
        this.bil1 = x.getBilangan();
        this.bil2 = y.getBilangan();
        this.op = z.getOperatorSimbol();
    }

    public void hitung(){
        if (op.equals("+")){
            int hasil = bil1 + bil2;
            System.out.println(hasil);
        }
        if (op.equals("-")){
            int hasil = bil1 - bil2;
            System.out.println(hasil);
        }
        if (op.equals("*")){
            int hasil = bil1 * bil2;
            System.out.println(hasil);
        }
        if (op.equals("/")){
            int hasil = bil1 / bil2;
            System.out.println(hasil);
        }
        if (op.equals("^")){
            int hasil = (int) Math.pow(bil1, bil2);
            System.out.println(hasil);
        }

    }
}
