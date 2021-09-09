
package desafio09;

import javax.swing.*;

public class PesoIdeal {
    public static void main(String[] args) {
        System.out.println("*****En este programa usted podrá saber cual es su peso ideal*****");

        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce su altura en cm: "));

        int genero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 si es hombre, 2 si es mujer: "));

        while (genero > 2 || genero < 1) {
            System.out.println("*****Introduzca un numero que se encuentre dentro de los parametros*****");
            genero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca 1 si es hombre, 2 si es mujer: "));
        }

        if (genero == 1)
        {
            int pesoMasculino = altura - 110;
            System.out.println("Su peso ideal es de: " + pesoMasculino);
        }

        else if (genero == 2) {
        int pesoFemenino = altura - 120;
        System.out.println("Su peso ideal es de: " + pesoFemenino);
    }

    }
}
