/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg19;

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
 int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor de N"));
        double suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += (10 * i) + i;
        }
        JOptionPane.showMessageDialog(null, "La sumatoria es: " + suma);
    }
    
}
