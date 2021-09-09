package desafio08;

import java.util.Scanner;

public class RaizScanner {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un número para sacar su raíz cuadrada: ");

        int numero = entrada.nextInt();
        double resultado = Math.sqrt(numero);

        System.out.println("La raiz cuadrada de " + numero + " es " + resultado);

    }
}
