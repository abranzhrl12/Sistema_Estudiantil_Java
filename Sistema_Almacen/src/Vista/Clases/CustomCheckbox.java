/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista.Clases;

import java.awt.BasicStroke;
import java.awt.Color;

import java.awt.Cursor;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.RenderingHints;

import javax.swing.JCheckBox;


/**
 *
 * @author Abraham
 */
public class CustomCheckbox extends JCheckBox{
     private  int border = 15;

    private Color uncheckedBackgroundColor = new Color(69, 124, 235); // Color de fondo antes de seleccionar
    private Color checkedBackgroundColor = Color.WHITE; // Color de fondo después de seleccionar
    private Color selectedColor = Color.BLACK; // Color cuando está seleccionado
    private Color borderColor = Color.BLACK; // Color del borde del cuadro
    private int borderThickness = 1; // Grosor del borde del cuadro

    public CustomCheckbox() {
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setOpaque(false); // Hace el componente no opaco
    }
public int getBorderRadius() {
    return border;
}

public void setBorderRadius(int radius) {
    this.border = radius;
    repaint(); // Vuelve a pintar el componente cuando se cambia el radio de los bordes
}
    public Color getUncheckedBackgroundColor() {
        return uncheckedBackgroundColor;
    }

    public void setUncheckedBackgroundColor(Color uncheckedBackgroundColor) {
        this.uncheckedBackgroundColor = uncheckedBackgroundColor;
        repaint(); // Vuelve a pintar el componente cuando se cambia el color de fondo antes de seleccionar
    }

    public Color getCheckedBackgroundColor() {
        return checkedBackgroundColor;
    }

    public void setCheckedBackgroundColor(Color checkedBackgroundColor) {
        this.checkedBackgroundColor = checkedBackgroundColor;
        repaint(); // Vuelve a pintar el componente cuando se cambia el color de fondo después de seleccionar
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Color selectedColor) {
        this.selectedColor = selectedColor;
        repaint(); // Vuelve a pintar el componente cuando se cambia el color cuando está seleccionado
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
        repaint(); // Vuelve a pintar el componente cuando se cambia el color del borde
    }

    public int getBorderThickness() {
        return borderThickness;
    }

    public void setBorderThickness(int borderThickness) {
        this.borderThickness = borderThickness;
        repaint(); // Vuelve a pintar el componente cuando se cambia el grosor del borde
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create(); // Se crea una copia de Graphics2D para evitar modificaciones permanentes
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Determinar el color de fondo a dibujar
        Color backgroundColor = isSelected() ? checkedBackgroundColor : uncheckedBackgroundColor;

        // Dibujar el fondo del checkbox
        g2.setColor(backgroundColor);
        g2.fillRoundRect(1, 1, getHeight() - 2, getHeight() - 2, border, border);

        // Dibujar el borde del checkbox
        g2.setColor(borderColor);
        g2.setStroke(new BasicStroke(borderThickness));
        g2.drawRoundRect(1, 1, getHeight() - 2, getHeight() - 2, border, border);

        // Dibujar la marca de selección (flechita) si está seleccionado
        if (isSelected()) {
            int ly = (getHeight() - 16) / 2;
            int[] px = {4, 8, 14, 12, 8, 6};
            int[] py = {ly + 8, ly + 14, ly + 5, ly + 3, ly + 10, ly + 6};
            g2.setColor(selectedColor);
            g2.fillPolygon(px, py, px.length);
        }

        g2.dispose(); // Liberar los recursos de Graphics2D
    }

    @Override
    protected void paintBorder(Graphics g) {
        // No se pinta el borde aquí para controlar el dibujo en paintComponent
    }

}
