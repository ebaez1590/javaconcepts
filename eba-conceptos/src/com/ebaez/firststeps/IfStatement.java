package com.ebaez.firststeps;

public class IfStatement {
    public static void main(String[] args) {
        //El scope de las variables esta definido por las {}
        boolean isBluetoothEnabled = false;
        int fileSended = 3;
        if (isBluetoothEnabled) {
            //Send File
            fileSended++;
            System.out.println("Archivo enviado");
            int i = 0; // el scope de esta variable es solo dentro del if
            i++;
        } else {
            fileSended--;
            System.out.println("Por favor enciende tu Bluetooth, para iniciar la transferencia");
        }
    }
}
