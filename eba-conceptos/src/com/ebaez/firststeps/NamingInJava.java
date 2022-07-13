package com.ebaez.firststeps;
//Upper Camel Case para nombrar clases
public class NamingInJava {
    public static void main(String[] args) {
        //Java es case sensitive (Diferencia entra mayúsculas y minúsculas
        int cellphone = 333578239;
        int cellPhone = 367102312;
        System.out.println(cellphone);
        System.out.println(cellPhone);
        String $countryName = "Ecuador";
        String _backgroundColor = "yellow";
        String currency$ = "USD";
        String background_color = "Green";
        String $_control = "xBox";

        //Constantes: Por convención va siempre en mayúsculas
        int POSITTION = -5;
        //Para palabras compuestas se puede usar _
        int MAX_WIDTH = 9999;
        int MIN_WIDTH = 1;

        //Lower Camel Case -> convención de nombres para variables y métodos
        String fullName = "Esteban Arturo Baez Vega";
        int sizeInCentimeters = 165;


    }
}
