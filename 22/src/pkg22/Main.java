/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg22;

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
    int i;
        for (i=1; i<=100; i++) {
            if (esPrimo(i)) { 
                JOptionPane.showMessageDialog(null, "Numero primo: " + i);
            }
        }
    }
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i=3; i*i<=num; i+=2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}
