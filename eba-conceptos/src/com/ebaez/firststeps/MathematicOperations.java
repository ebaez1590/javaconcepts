package com.ebaez.firststeps;

public class MathematicOperations {
    public static void main(String[] args) {
        double x = 2.1;
        double y = 3;
        //Metodos de la clase Math
        //Devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));//Es una especie de redondeo hacia arriba
        //Devuelve un entero hacia abajo
        System.out.println(Math.floor(x));
        //Devuelve un número elevado a otro numero
        System.out.println(Math.pow(x,y));
        //Valor mayor entre 2 datos
        System.out.println(Math.max(x,y));
        //Devuelve la raiz cudrada
        System.out.println(Math.sqrt(y));
        //Area del círculo
        //pi*r2
        System.out.println(Math.PI * Math.pow(y,2));
        //Area de una esfera
        //4PI*r2
        System.out.println(4 * Math.PI * Math.pow(y,2));
        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println((4/3) * Math.PI * Math.pow(y,3));
    }
}
