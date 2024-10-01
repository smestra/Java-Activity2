/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2;

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
    
        
        double numero = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"));

        double digito1 = numero / 100;
        double digito2 = (numero % 100) / 10;
        double digito3 = numero % 10;

        if ((digito1 <= digito2) && (digito2 <= digito3)) {
            JOptionPane.showMessageDialog(null,"El número del medio es: " + digito2);
        } else if ((digito1 >= digito2) && (digito2 >= digito3)) {
            JOptionPane.showMessageDialog(null,"El número del medio es: " + digito2);
        } else if ((digito1 <= digito3) && (digito3 <= digito2)) {
            JOptionPane.showMessageDialog(null,"El número del medio es: " + digito3);
        } else {
            JOptionPane.showMessageDialog(null,"El número del medio es: " + digito1);
    }
    
    }
}