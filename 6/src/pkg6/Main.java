/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6;

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
      double ventasSemanales = 1000000;
        double valorSemanal = 250000 + (ventasSemanales * 0.09);
        double valorMensual = valorSemanal * 4;
        double valorTotalMensual = valorMensual * 5;
        JOptionPane.showMessageDialog(null, "El valor total mensual es: " + valorTotalMensual);
    }
    
}
