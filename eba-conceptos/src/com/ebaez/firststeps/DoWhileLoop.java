package com.ebaez.firststeps;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int response = 0;
        do {
            System.out.println("Selecciona la opción deseada:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 0:
                    System.out.println("Gracias por visitarnos!!");
                    break;
                case 1:
                    System.out.println("Movies!!!");
                    break;
                case 2:
                    System.out.println("Series!!!");
                    break;
                default:
                    System.out.println("Selecciona una opción válida");
            }
        } while (response !=0);
        System.out.println("El porgrama ha finalizado");
    }
}
