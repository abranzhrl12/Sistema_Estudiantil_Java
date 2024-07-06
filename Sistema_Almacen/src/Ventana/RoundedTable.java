/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;


import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import java.awt.geom.RoundRectangle2D;

import javax.swing.JTable;

/**
 *
 * @author Abraham
 */
public class RoundedTable extends JTable{

  private int arcWidth = 15; // Ancho del arco
    private int arcHeight = 15; // Alto del arco

    public RoundedTable() {
        super();
        setOpaque(false); // Hace que la tabla sea transparente
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        // Crear un objeto Graphics2D para habilitar la representación gráfica
        Graphics2D g2d = (Graphics2D) g.create();

        // Aplicar bordes redondeados a la tabla
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setColor(getBackground());
        g2d.fill(new RoundRectangle2D.Float(0, 0, getWidth() - 1, getHeight() - 1, arcWidth, arcHeight));

        // Llamar al método paintComponent de la superclase (para dibujar la tabla)
        super.paintComponent(g2d);

        // Liberar recursos de Graphics2D
        g2d.dispose();
    }
}
