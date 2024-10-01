/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12;

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
   int numeroSecreto = (int) (Math.random() * 10000);
        int intentos = 0;
        int fijas = 0;
        int picas = 0;

        while (fijas < 4) {
            String numeroIngresado = JOptionPane.showInputDialog("Ingrese un número de 4 dígitos");

            fijas = 0;
            picas = 0;

            for (int i = 0; i < 4; i++) {
                if (numeroIngresado.charAt(i) == Integer.toString(numeroSecreto).charAt(i)) {
                    fijas++;
                } else if (Integer.toString(numeroSecreto).contains(String.valueOf(numeroIngresado.charAt(i)))) {
                    picas++;
                }
            }

            JOptionPane.showMessageDialog(null, "Picas: " + picas + "\nFijas: " + fijas);
            intentos++;
        }

        JOptionPane.showMessageDialog(null, "¡Ganaste! El número era " + numeroSecreto + "\nIntentos: " + intentos);
    }
        }
    
    
    

