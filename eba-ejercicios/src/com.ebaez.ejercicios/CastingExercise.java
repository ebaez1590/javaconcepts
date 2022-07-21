package com.ebaez.ejercicios;

public class CastingExercise {
    public static void main(String[] args) {
        //Resuelve los siguientes cast -> Implicito o Explicito -> Estimacion o Exactitud
        char c = 'z'; //conviertelo a int
        int fI = 250; //conviertelo a long y luego de long a short
        double fD = 301.067; //conviertelo a long
        int sI = 100; //súmale 5000.66 y conviertelo a float
        int tI = 737; //multiplícalo por 100 y conviertelo a byte
        double sD = 298.638; //divídelo entre 25 y conviertelo a long
        System.out.println("********Char to INT***********");
        int cToI = c;
        System.out.println(cToI + " Implícita; Exatitud");
        System.out.println("********Int to LONG***********");
        long iToL = fI;
        System.out.println(iToL + " Implícita; Exactitud");
        System.out.println("********LONG to SHORT***********");
        short lToS = (short)iToL;
        System.out.println(lToS + " Explícita; Exactitud");
        System.out.println("********Double to Long***********");
        long dToL = (long)fD;
        System.out.println(dToL + " Explícita; Estimación");
        System.out.println("********Int to Float***********");
        float iToF = (float)(sI + 5000.66);
        System.out.println(iToF + " Explícita; Exactitud");
        System.out.println("********Int to BYTE***********");
        byte iToB = (byte)(tI*100);
        System.out.println(iToB + " Explícita; Estimación");
        long dToLTwo = (long)(sD / 25);
        System.out.println(dToLTwo + " Explícita; Estimación");

    }
}
