package com.ebaez.firststeps;

public class Casting {
    public static void main(String[] args) {
        //En un año ubicar 30 perritos
        //Cuantos perritos ubique al mes
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);
        //ESTIMACION
        int estimatedMonthlyDogs = (int) monthlyDogs; // se trunca la parte decimal; no redondea
        System.out.println(estimatedMonthlyDogs);

        //EXACTITUD
        int a = 30;
        int b = 12;
        //El resultado es mas preciso
        System.out.println((double)a/b);

        double c = a/b; //Casting automático del resultado que es entero
        //double c = (double)a/b; Fuerza a que el resultado sea mas preciso
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n; // char es > que short por eso requiere un cast explicito
        System.out.println(nS);
        byte i = 1;
        byte j = 1;
        //byte k = i + j;
    }
}
