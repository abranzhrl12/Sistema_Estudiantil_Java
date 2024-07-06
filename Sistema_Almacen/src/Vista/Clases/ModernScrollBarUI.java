/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Clases;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import javax.swing.JComponent;
import javax.swing.JScrollBar;

import javax.swing.plaf.basic.BasicScrollBarUI;

/**
 *
 * @author Abraham
 */
public class ModernScrollBarUI extends BasicScrollBarUI {
 private final int THUMB_WIDTH = 5; // Ancho de la barra de desplazamiento
    private final Color THUMB_COLOR = new Color(229, 229, 229);
    private final float ALPHA = 0.3f;

    @Override
    protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
        if (scrollbar.getVisibleAmount() != scrollbar.getMaximum()) {
            Graphics2D graphics2D = (Graphics2D) g.create();
            graphics2D.setColor(THUMB_COLOR);
            graphics2D.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, ALPHA));

            // Ajustar el ancho de la barra de desplazamiento
            int thumbX = thumbBounds.x + (thumbBounds.width - THUMB_WIDTH) / 2;
            int thumbY = thumbBounds.y;
            int thumbHeight = thumbBounds.height;

            graphics2D.fillRect(thumbX, thumbY, THUMB_WIDTH, thumbHeight);
            graphics2D.dispose();
        }
    }

    @Override
    protected void paintTrack(Graphics g, JComponent c, Rectangle trackBounds) {
        // Hacer que la parte que rodea la barra sea transparente o blanca
        g.setColor(Color.white); // Puedes cambiar Color.WHITE a Color.TRANSPARENT si tu Look and Feel lo admite
        g.fillRect(trackBounds.x, trackBounds.y, trackBounds.width, trackBounds.height);
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new InvisibleScrollBarButton();
    }

    private static class InvisibleScrollBarButton extends JButton {
        private InvisibleScrollBarButton() {
            setOpaque(false);
            setFocusable(false);
            setFocusPainted(false);
            setBorderPainted(false);

            // Elimina el borde del botón superior
            setBorder(BorderFactory.createEmptyBorder());
        }
    }
    
    // Añade este método para eliminar cualquier borde predeterminado
    @Override
    protected void installDefaults() {
        super.installDefaults();
        scrollbar.setBorder(null); // Elimina cualquier borde predeterminado de la barra de desplazamiento
    }
}
