package com.ebaez.firststeps;

public class JavaInstructions {
    public static void main(String[] args) {
        //Break
        System.out.println("************BREAK*************");
        for (int i = 0; i <=5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("*********CONTINUE WHILE**********");
        int a = 0;
        while (a < 10) {
            if (a == 6) {
                a++;
                System.out.println("No imprime el 6");
                continue;
            }
            System.out.println(a);
            a++;
        }
        System.out.println("**********CONTINUE FOR************");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println("No imprime el 4");
                continue;
            }
            System.out.println(i);
        }
    }
}
