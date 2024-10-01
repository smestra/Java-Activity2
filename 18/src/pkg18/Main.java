/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg18;

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
        double montoCompra;
        double descuento;
        double montoAPagar;
        montoCompra = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto de la compra"));   
        String color = JOptionPane.showInputDialog("Seleccione el color de la bolita: rojo, amarillo o blanco");
        switch (color) {
            case "rojo":
                descuento = 0.4;
                break;
            case "amarillo":
                descuento = 0.25;
                break;
            default:
                descuento = 0;
        }
        montoAPagar = montoCompra - (montoCompra * descuento);
        JOptionPane.showMessageDialog(null, "Monto a pagar: $" + montoAPagar);
    }
    
}
