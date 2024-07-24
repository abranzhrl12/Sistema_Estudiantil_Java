/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Clases;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.RoundRectangle2D;
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

    private final int THUMB_WIDTH = 9; // Ancho de la barra de desplazamiento ajustado
    private final Color THUMB_COLOR = new Color(139, 143, 156); // Color del thumb
    private final Color TRACK_COLOR = new Color(249, 249, 249); // Color del track
    private final float ALPHA = 0.7f; // Ajuste de la transparencia
    private final int ARC_WIDTH = 10; // Ancho del arco para esquinas redondeadas
    private final int ARC_HEIGHT = 10; // Altura del arco para esquinas redondeadas
    private final int SCROLL_MULTIPLIER = 14; // Factor de multiplicación para la velocidad del desplazamiento
    private final int MARGIN = 10; // Espacio en blanco en la parte superior e inferior

    @Override
    protected Dimension getMaximumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(THUMB_WIDTH, Integer.MAX_VALUE);
        } else {
            return new Dimension(Integer.MAX_VALUE, THUMB_WIDTH);
        }
    }

    @Override
    protected Dimension getMinimumThumbSize() {
        if (scrollbar.getOrientation() == JScrollBar.VERTICAL) {
            return new Dimension(THUMB_WIDTH, THUMB_WIDTH);
        } else {
            return new Dimension(THUMB_WIDTH, THUMB_WIDTH);
        }
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new ScrollBarButton();
    }

    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new ScrollBarButton();
    }

    @Override
    protected void paintTrack(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(TRACK_COLOR); // Usar el color definido para el track
        g2.fillRect(rctngl.x, rctngl.y, rctngl.width, rctngl.height);
    }

    @Override
    protected void paintThumb(Graphics grphcs, JComponent jc, Rectangle rctngl) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        int x = rctngl.x + (rctngl.width - THUMB_WIDTH) / 2;
        int y = rctngl.y + MARGIN;
        int width = THUMB_WIDTH;
        int height = rctngl.height - 2 * MARGIN;
        g2.setColor(THUMB_COLOR);
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, ALPHA));
        g2.fillRoundRect(x, y, width, height, ARC_WIDTH, ARC_HEIGHT);
    }

    private static class ScrollBarButton extends JButton {
        public ScrollBarButton() {
            setBorder(BorderFactory.createEmptyBorder());
            setPreferredSize(new Dimension(0, 0));  // Hacer los botones completamente transparentes
        }

        @Override
        public void paint(Graphics grphcs) {
            // No pintar nada
        }
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        scrollbar.setBorder(null); // Elimina cualquier borde predeterminado de la barra de desplazamiento
    }

    @Override
    protected void installListeners() {
        super.installListeners();
        scrollbar.addMouseWheelListener(e -> {
            int rotation = e.getWheelRotation();
            int increment = scrollbar.getUnitIncrement(rotation > 0 ? 1 : -1) * SCROLL_MULTIPLIER;
            if (rotation < 0) {
                scrollbar.setValue(scrollbar.getValue() - increment);
            } else {
                scrollbar.setValue(scrollbar.getValue() + increment);
            }
        });
    }
}