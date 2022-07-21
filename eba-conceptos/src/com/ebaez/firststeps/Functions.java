package com.ebaez.firststeps;

public class Functions {
    public static void main(String[] args) {
        double y = 3;
        //Area del círculo
        //pi*r2
        double area = circleArea(y);
        System.out.println(area);
        //Area de una esfera
        //4PI*r2
        System.out.println(sphereArea(y));
        //Volumen de una esfera
        //(4/3)*PI*r3
        System.out.println(sphereVolumen(y));

        //Conversiones
        System.out.println("PESO MEXICANO A DOLARES: " + convertToDollar(400, "MXN"));
        System.out.println("PESO COLOMBIANO A DOLARES: " + convertToDollar(5000, "COP"));
        System.out.println("PESO CHILENO A DOLARES: " + convertToDollar(5000, "CHP"));
    }
    //Metodos estaticos pueden ser llamados dentro de otros metodos
    /**
     * Descripción: Función que al enviarle el radio calcula el área de un círculo
     * @param r  Radio del círculo
     * @return area Devuelve el resultado del área del círculo.
     * */
    public static double circleArea (double r) {
        return Math.PI * Math.pow(r,2);
    }
    /**
     * Descripción: Función que recibe el radio de una esfera y calcula su area
     * @param r Radio de la esfera
     * @return area Devuelve el area de cualquier esfera conociendo su radio
     * */
    public static double sphereArea (double r) {
        return  4 * Math.PI * Math.pow(r,2);
    }
    /**
     * Descripción: Función que calcula el vulumen de una esfera conociendo su radio
     * @param r Radio de la Esfera
     * @return volumen Devuelve el valor calculadod del volumen de una esfera
     * */
    public static double sphereVolumen (double r) {
        return (4/3) * Math.PI * Math.pow(r,3);
    }
    /**
     * Descripción: Función que espcificando su moneda convierte una cantidad de dinero a dólares.
     *
     * @param quantity Cantidad de dinero.
     * @param currency Tipo de Monea, solo acepta MXN o COP.
     * @return quantity Devuelve la cantidad actualizada en dólares.
     *
     * */
    public static double convertToDollar (double quantity, String currency) {
        //MX COP
        switch (currency) {
            case "MXN":
                quantity = quantity * 0.52;
                break;
            case "COP":
                quantity = quantity * 0.00022;
                break;
            default:
                System.out.println("Ingrese una moneda valida");
        }
        return quantity;
    }
}
