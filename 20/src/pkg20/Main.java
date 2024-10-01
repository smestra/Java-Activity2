/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20;

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
   double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero es par");
        } else {
            JOptionPane.showMessageDialog(null, "El numero es impar");
        }
    }
    
}
