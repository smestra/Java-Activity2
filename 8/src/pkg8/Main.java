/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg8;

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
     int minutos = Integer.parseInt(JOptionPane.showInputDialog("Digite los minutos: "));
     double horas = minutos / 60;
     double minutosRestantes = minutos % 60;
     double segundos = 0;

        JOptionPane.showMessageDialog(null, minutos + " minutos son: " + horas + " horas, " + minutosRestantes + " minutos, " + segundos + " segundos.");
    }
    
    
}
