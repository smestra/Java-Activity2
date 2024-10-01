/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg14;

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
     int numeroSecreto = (int) (Math.random() * 1000) + 1;
        int intentos = 0;
        int numeroIngresado = 0;
        while (numeroIngresado != numeroSecreto) {
        numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog("Adivine el numero"));
        intentos++;
        if (numeroIngresado < numeroSecreto) {
        JOptionPane.showMessageDialog(null, "El numero es mayor");
        } else if (numeroIngresado > numeroSecreto) {
        JOptionPane.showMessageDialog(null, "El numero es menor");
        }
        }
        JOptionPane.showMessageDialog(null, "Felicitaciones! Has acertado el numero en " + intentos + " intentos");
        if (intentos >= 1 && intentos <= 3) {
            JOptionPane.showMessageDialog(null, "Suertudo");
        } else if (intentos >= 4 && intentos <= 6) {
            JOptionPane.showMessageDialog(null, "Genio");
        } else if (intentos >= 7 && intentos <= 8) {
            JOptionPane.showMessageDialog(null, "Se puede mejorar");
        } else {
            JOptionPane.showMessageDialog(null, "No eres muy inteligente");
        }
    }
    
}
