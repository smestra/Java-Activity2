/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg21;

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
      double horasTrabajadas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero de horas trabajadas"));
        double valorHora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese valor de hora"));
        double salarioBruto = horasTrabajadas * valorHora;
        double horasExtras = 0;
        double valorHorasExtras = 0;
        if (horasTrabajadas > 40) {
            horasExtras = horasTrabajadas - 40;
            valorHorasExtras = horasExtras * (valorHora + 2000);
        }
        double retencionFuente = 0;
        if (horasExtras > 0) {
            retencionFuente = salarioBruto * 0.045;
        } else {
            retencionFuente = salarioBruto * 0.03;
        }
        double salarioNeto = salarioBruto + valorHorasExtras - retencionFuente;
        JOptionPane.showMessageDialog(null, "Salario neto a pagar: " + salarioNeto);
    }
    
}
