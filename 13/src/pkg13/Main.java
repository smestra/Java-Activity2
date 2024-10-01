/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg13;

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
    int capacidadJarra = 1000;
        int cantidadPorSegundo = 7;
        int porcentajePierde = 5; 
        int tiempo = 0; 
        int cantidadActual = 0;
        while (cantidadActual < capacidadJarra) { 
            cantidadActual += cantidadPorSegundo;
            tiempo++;
            if (tiempo % 5 == 0) {
                int cantidadRestar = (int) (cantidadActual * porcentajePierde / 100);
                cantidadActual -= cantidadRestar;
            }
        }

        JOptionPane.showMessageDialog(null, "El tiempo que tarda en llenarse la jarra es: " + tiempo + " segundos");
    }
}
    
    

