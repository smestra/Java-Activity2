/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1;

import java.util.Scanner;
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
        double edad = Double.parseDouble(JOptionPane.showInputDialog("ingrese la edad del del portista"));

        
        String nacionalidad = JOptionPane.showInputDialog("ingrese la nacionalidad del deportista");

        
        double peso = Double.parseDouble(JOptionPane.showInputDialog("ingrese el peso del deportista"));

        boolean esApto = (edad > 15) && (nacionalidad.equalsIgnoreCase("colombiano")) && (peso >= 60) && (peso <= 90);

        if(esApto){
            System.out.println("El deportista es apto para ejercer el deporte.");
        }else{
            System.out.println("El deportista no es apto para ejercer el deporte.");
    }
    
    }
}
