/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg10;

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
      while (true) {
    int horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas del trabajador"));

    if (horas <= 35) {
    double salario = horas * 15000;
    JOptionPane.showMessageDialog(null, "El salario es: " + salario);
    } else {
    double salario = (35 * 15000) + ((horas - 35) * 27000);
    JOptionPane.showMessageDialog(null, "El salario es: " + salario);
    }
    int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea calcular otro salario?");
    if (respuesta != 0) {
    break;
    }
    }
    }
    }
    

