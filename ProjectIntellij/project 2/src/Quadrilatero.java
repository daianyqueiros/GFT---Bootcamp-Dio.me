public class Quadrilatero {
    public static double area(double lado) {

        System.out.println("Area do Quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {

        System.out.println("Area do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Area do Trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {

        System.out.println("Area do Losango:" + (diagonal1 * diagonal2)/2);
    }

}


