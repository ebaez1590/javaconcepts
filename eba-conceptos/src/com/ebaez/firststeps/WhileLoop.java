package com.ebaez.firststeps;

public class WhileLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        int i = 1;
        while (isTurnOnLight && i <= 10) {
            printSOS();
            i++;
        }
        int x = 1;
        while ( x<=10) {
            System.out.println(++x);
        }
    }
    //Void significa no devolver nada
    public static void printSOS () {
        System.out.println("... ___ ...");
    }

    public static boolean turnOnOffLight() {
        //Operador terneario (if) -> ()?valor:valor;
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
