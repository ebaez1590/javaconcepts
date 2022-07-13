package com.ebaez.firststeps;

public class UpdatingVariables {
    public static void main(String[] args) {
        //Java permite actualizar nuestras variables reutilzando sus valores anteriores
        int salary = 1000;
        //bono $200
        salary = salary + 200;//salary += 200;
        System.out.println(salary);
        //pension $50
        salary = salary -50;
        System.out.println(salary);
        //2 horas extras $30 c/u
        //comida $45
        salary = salary + (2*30) - 45;
        System.out.println(salary);

        //Actualización de cadenas de texto
        // el token + permite concatenar textos
        String employeeName = "Arturo Baez";
        employeeName = employeeName + " Vega";
        System.out.println(employeeName);
        employeeName = "Esteban " + employeeName;
        System.out.println(employeeName);

    }
}
