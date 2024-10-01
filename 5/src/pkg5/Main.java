/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5;

import java.util.Random;
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
      Random random = new Random();

        int dado1 = random.nextInt(6) + 1;
        int dado2 = random.nextInt(6) + 1;

        while (dado1 != 6 || dado2 != 4) {
            JOptionPane.showMessageDialog(null, "No eres un afortunado. ¡Inténtalo de nuevo!");
            dado1 = random.nextInt(6) + 1;
            dado2 = random.nextInt(6) + 1;
        }

        JOptionPane.showMessageDialog(null, "Eres un afortunado!");
    }
}

    
    

