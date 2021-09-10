package desafio10;

import javax.swing.*;
import java.util.Random;

public class NumeroAleatorio {

    public static void main(String[] args) {

        int contIntentos = 1;

        int numeroRandom = (int) Math.floor(Math.random()*100+1);

        int numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 100: "));

        while (numeroUsuario < 1 || numeroUsuario > 100) {
            System.out.println("Introduzca un numero que se encuentre dentro de los parametros");
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero entre 1 y 100: "));
        }

        while (numeroUsuario > numeroRandom) {
            System.out.println("El numero ingresado es mayor al numero aleatorio");
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Siga intentando hasta acertar con el numero correcto: "));
            contIntentos++;
        }

        while (numeroUsuario < numeroRandom) {
            System.out.println("El numero ingresado es menor al numero aleatorio");
            numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Siga intentando hasta acertar con el numero correcto: "));
            contIntentos++;
        }

        if (numeroUsuario == numeroRandom) {
            System.out.println("¡Correcto! Usted ha acertado con el numero aleatorio");
            System.out.println("Usted ha hecho " + contIntentos + " para acertar el numero aleatorio");
        }
    }
}
