/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3;

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
      double[] ventas = new double[5];

        for (int i = 0; i < 5; i++) {
            ventas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la venta " + (i + 1) + ": "));
        }

        int contadorVentasMayores = 0;
        double sumaVentas = 0;
        double mayorVenta = 0;
        double menorVenta = ventas[0];

        for (int i = 0; i < 5; i++) {
            if (ventas[i] > 1000000) {
                contadorVentasMayores++;
            }
            sumaVentas += ventas[i];
            if (ventas[i] > mayorVenta) {
                mayorVenta = ventas[i];
            }
            if (ventas[i] < menorVenta) {
                menorVenta = ventas[i];
            }
        }

        double promedioVentas = sumaVentas / 5;

        JOptionPane.showMessageDialog(null, "Ventas mayores a 1.000.000: " + contadorVentasMayores);
        JOptionPane.showMessageDialog(null, "Promedio de ventas: " + promedioVentas);
        JOptionPane.showMessageDialog(null, "Mayor venta: " + mayorVenta);
        JOptionPane.showMessageDialog(null, "Menor venta: " + menorVenta);
    }
    
}
