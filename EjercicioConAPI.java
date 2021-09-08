package desafio07;

public class EjercicioConAPI {
    public static void main(String[] args) {


    }

    // Ejemplo con funciones trigonometricas habituales

    static {
        double x = Math.sin(0.5);
        System.out.println("El resultado de la operacion con la funcion seno es " + x);
    }

    static {
        double a = Math.cos(0.5);
        System.out.println("El resultado de la operacion con la funcion coseno es " + a);
    }

    static {
        double b = Math.tan(0.5);
        System.out.println("El resultado de la operacion con la funcion tangente es " + b);
    }

    static {
        double c = Math.atan(1);
        System.out.println("El resultado de la operacion con la funcion atan es " + c);
    }

    static {
        double d = Math.atan2(1, 1);
        System.out.println("El resultado de la operacion con la funcion atan2 es " + d);
    }

    // Ejemplos de funcion exponencial y su inversa
    static {
        double e = Math.exp(1);
        System.out.println("El resultado de la operacion con la funcion exponenciación es " + e);
    }

    static {
        double f = Math.log(2.7172);
        System.out.println("El resultado de la operacion con la funcion logartimo es " + f);
    }

    // Ejemplos con constantes PI y e

    static {
        System.out.println("La constante PI es " + Math.PI);
        System.out.println("La constante e es " + Math.E);
    }


    static {
        double angulo = 45.0 * Math.PI/180.0; // así se convierte el grado 45 en radianes y se pueden hallar las
                                                // funciones trigonometricas
        System.out.println("cos(" + angulo + ") es " + Math.cos(angulo));
        System.out.println("sin(" + angulo + ") es " + Math.sin(angulo));
        System.out.println("tan(" + angulo + ") es " + Math.tan(angulo));
    }


}
