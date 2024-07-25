/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Clases;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Abraham
 */
public class CustomFrame extends JFrame {
     public CustomFrame() {
        // Configuración básica del JFrame
      
      
        // Crear un JPanel personalizado con borde
        JPanel contentPane = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g.create();
                g2.setStroke(new BasicStroke(5)); // Grosor del borde
                g2.setColor(Color.BLACK); // Color del borde
                g2.drawRect(0, 0, getWidth() - 1, getHeight() - 1); // Dibuja el borde
                g2.dispose();
            }
        };
        contentPane.setBackground(Color.WHITE); // Color de fondo del panel

     
        setContentPane(contentPane);
    }

  
}
