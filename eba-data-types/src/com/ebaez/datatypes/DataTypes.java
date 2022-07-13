package com.ebaez.datatypes;

public class DataTypes {
    public static void main(String[] args) {
        //Tipos de datos numericos enteros
        int n = 1234567890;
        //Para definir una variable tipo de dato long se debe agregar la L al final del valor
        long nL = 12345678901L;

        //Tipos de datos decimales o de punto flotante
        double nD = 123.456123456;
        //Para definir una variable de tipo Float es necesario agregar la F al final.
        float nf = 123.456F;

        //Tipos de datos de texto
        char cT; //Unicode es decir que solo recibe un solo elemento

        //Tipos de datos logicos
        boolean vb; // ture o false

        //A partir de JAVA version 10 existe inferencia de datos
        var salary = 1000; // int
        // pension 3%
        var pension = salary * 0.03; // double
        var totalSalary = salary - pension; // int - double
        System.out.println("Salary: " + salary);
        System.out.println("Pension: " + pension);
        System.out.println("Total Salary: " + totalSalary);

        var employeeName = "Esteban Baez";
        System.out.println("Employee: " +employeeName + " Salary: " + salary);

    }
}
