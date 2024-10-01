/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg9;

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
       double total = 0;

        while (true) {
         int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad vendida"));

        if (cantidad == 0) {
                break;
         }

        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduzca el precio"));

            total += cantidad * precio;
        }

        JOptionPane.showMessageDialog(null, "Total: " + total);
    }
    }
    
