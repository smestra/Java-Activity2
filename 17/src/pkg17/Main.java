/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17;

import javax.swing.JOptionPane;

/**
 *
 * @author GABRIEL-PC
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int cuadrado = calcularCuadradoConSumas(numero);
        JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es: " + cuadrado);
    }

    public static int calcularCuadradoConSumas(int numero) {
        int suma = 0;
        for (int i = 1; i <= numero; i++) {
            suma += (2 * i) - 1;
        }
        return suma;
    }
    
}
