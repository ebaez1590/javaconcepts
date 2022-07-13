package com.ebaez.ejercicios;

public class StringReverse {
    public static void main(String[] args) {
        String str = "Esteban";
        String reverse = new StringBuilder(str).reverse().toString();
        System.out.printf("Inicial: %s, Despues del Reverso: %s", str, reverse);
        System.out.println("****************Segunda cadena***************");
        String str2 = "Arturo";
        System.out.printf("Valor inicial: %s, Reversado: %s", str2, reverse(str2));
    }
    public static String reverse (String str) {
        if (null == str || str.isEmpty()) {
            return str;
        }
        String reverse = "";
        for (int i = str.length() - 1; i >= 0 ; i--) {
            reverse = reverse + str.charAt(i);
        }
        return reverse;
    }
}
