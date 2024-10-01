/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg16;

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
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero"));
        int invertido = invertirNumero(numero);
        JOptionPane.showMessageDialog(null, "El número invertido es: " + invertido);
    }

    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
        }
        return invertido;
    }
    
}
