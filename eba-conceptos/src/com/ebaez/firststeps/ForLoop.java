package com.ebaez.firststeps;

public class ForLoop {
    static boolean isTurnOnLight = false;
    public static void main(String[] args) {
        turnOnOffLight();
        for (int i = 1; i <= 10 ; i++) {
            printSOS();
            //break -> hace que salga del bucle
            //continue -> detiene el ciclo pero no sale de el
            //Vuelve a evaluar la condicion
        }
    }
    public static void printSOS () {
        System.out.println("... ___ ...");
    }

    public static boolean turnOnOffLight() {
        //Operador terneario (if) -> ()?valor:valor;
        isTurnOnLight = (isTurnOnLight)?false:true;
        return isTurnOnLight;
    }
}
