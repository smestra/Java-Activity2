/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg7;

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
       double lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer lado del triángulo"));
        double lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo lado del triángulo"));
        double lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tercer lado del triángulo"));

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es Equilátero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            JOptionPane.showMessageDialog(null, "El triángulo es Isósceles");
        } else {
            JOptionPane.showMessageDialog(null, "El triángulo es Escaleno");
        }
    }

    }
    

