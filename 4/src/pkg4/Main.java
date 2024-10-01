/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4;

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
      int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número del 1 al 15: "));

        if (numero >= 1 && numero <= 15) {
            for (int i = 0; i < numero; i++) {
                System.out.print("*");
            }
        } else {
            JOptionPane.showMessageDialog(null, "El número ingresado no está en el rango de 1 a 15.");
        }
    

    }
    
}
