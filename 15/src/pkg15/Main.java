/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg15;

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
      double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el dividendo"));
        double divisor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el divisor"));
        double cociente = 0;
        double residuo = dividendo;

        while (residuo >= divisor) {
            residuo -= divisor;
            cociente++;
        }

        JOptionPane.showMessageDialog(null, "Cociente: " + cociente + "\nResiduo: " + residuo);
    }
    
    
}
