/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11;

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
       while (true) {
            String opcion = JOptionPane.showInputDialog("Seleccione una opción\n1. Salir\n2. Sumatorio\n3. Factorial");

            switch (opcion) {
                case "1":
                    System.exit(0);
                    break;
                case "2":
                    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    int sumatorio = 0;
                    for (int i = 1; i <= numero; i++) {
                        sumatorio += i;
                    }
                    JOptionPane.showMessageDialog(null, "El sumatorio de " + numero + " es " + sumatorio);
                    break;
                case "3":
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
                    int factorial = 1;
                    for (int i = 1; i <= numero; i++) {
                        factorial *= i;
                    }
                    JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + factorial);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
          }
    
       }
   }
}