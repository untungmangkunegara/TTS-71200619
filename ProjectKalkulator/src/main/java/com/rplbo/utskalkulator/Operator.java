package com.rplbo.utskalkulator;

public class Operator {
    String operatorString;
    String operatorSimbol;

    public Operator(String oprator) {
        String lowerOprator = oprator.toLowerCase();
        this.operatorString = lowerOprator;
        if (lowerOprator.equals("tambah")) {
            this.operatorSimbol = "+";
        }
        if (lowerOprator.equals("kurang")) {
            this.operatorSimbol = "-";
        }
        if (lowerOprator.equals("kali")) {
            this.operatorSimbol = "*";
        }
        if (lowerOprator.equals("bagi")) {
            this.operatorSimbol = "/";
        }
        if (lowerOprator.equals("pangkat")) {
            this.operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol() {
        return operatorSimbol;
    }

}
