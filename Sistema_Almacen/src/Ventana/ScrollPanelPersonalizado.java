/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ventana;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.*;
import javax.swing.border.LineBorder;

/**
 *
 * @author Abraham
 */
public class ScrollPanelPersonalizado extends JScrollPane{
  public ScrollPanelPersonalizado(Component view) {
        super(view);

        // Configura la apariencia del JScrollPane según tus necesidades
        setBorder(null);
        getVerticalScrollBar().setUI(new ModernScrollBarUI());
        getVerticalScrollBar().setBackground(Color.WHITE);
        getViewport().setBackground(Color.WHITE);
        JPanel cornerPanel = new JPanel();
        cornerPanel.setBackground(Color.WHITE);
        setCorner(JScrollPane.UPPER_RIGHT_CORNER, cornerPanel);
        setPreferredSize(new Dimension(400, 200)); // Establece el tamaño preferido

        // Establece un borde redondeado para el panel de visualización (la vista)
        if (view instanceof JComponent) {
            ((JComponent) view).setBorder(new LineBorder(Color.white, 5, true)); // 5 es el ancho del borde
        }
    }
}
