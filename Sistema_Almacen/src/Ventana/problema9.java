
package Ventana;

import javax.swing.JOptionPane;

/**
 *
 * @author Abraham
 */
public class problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          float costoPorDocena, montoCompra, descuento, montoAPagar;
        int cantidadDocenas, unidadesObsequio;
        
        // Solicitar al usuario que ingrese el costo por docena del producto
        costoPorDocena = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el costo por docena del producto:"));
        
        // Solicitar al usuario que ingrese la cantidad de docenas a comprar
        cantidadDocenas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de docenas a comprar:"));
        
        // Calcular el monto de la compra
        montoCompra = costoPorDocena * cantidadDocenas * 12;
        
        // Calcular el descuento
        descuento = (cantidadDocenas > 3) ? montoCompra * 0.15f : montoCompra * 0.10f;
        
        // Calcular el monto a pagar
        montoAPagar = montoCompra - descuento;
        
        // Calcular el número de unidades de obsequio
        unidadesObsequio = (cantidadDocenas > 3) ? cantidadDocenas - 3 : 0;
        
        // Mostrar los resultados utilizando JOptionPane
        JOptionPane.showMessageDialog(null, "Monto de la compra: $" + montoCompra);
        JOptionPane.showMessageDialog(null, "Monto del descuento: $" + descuento);
        JOptionPane.showMessageDialog(null, "Monto a pagar: $" + montoAPagar);
        JOptionPane.showMessageDialog(null, "Número de unidades de obsequio: " + unidadesObsequio);
    }
    
}
