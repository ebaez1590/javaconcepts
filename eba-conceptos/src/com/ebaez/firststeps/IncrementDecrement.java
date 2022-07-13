package com.ebaez.firststeps;

public class IncrementDecrement {
    public static void main(String[] args) {
        int lives = 5;
        lives = lives -1;
        System.out.println(lives);//4
        lives--; //Decremento postfija
        System.out.println(lives);//3
        lives++; //Icremento postfija

        //Prefija
        //Gana un regalo por ganar una vida;
        //int gift = 100 + lives++; //Postfijo -> se accede al dato de la variable no al icremento
        int gift = 100 + ++lives; //Prefijo -> se incrementa o decrementa la variable
        System.out.println("Gift: " + gift);
        System.out.println("Lives: " + lives);
    }
}
