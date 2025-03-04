package Vista.Clases;


import java.awt.Dimension;
import java.awt.DisplayMode;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;


public class SimpleTitleBar extends javax.swing.JPanel {
//
   private ComponentResizer resize;
    private int x;
    private int y;

    
    
    
    public SimpleTitleBar() {
        initComponents();
    }

    public void init(JFrame fram) {
//        resize = new ComponentResizer();
//        resize.setSnapSize(new Dimension(1, 1));
//        resize.setMinimumSize(new Dimension(1040, 645));
//        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//GraphicsDevice[] screens = ge.getScreenDevices();
//
//// Inicializa el tamaño máximo con 0,0
//Dimension maxSize = new Dimension(0, 0);
//
//// Itera a través de todos los dispositivos gráficos para obtener sus tamaños
//for (GraphicsDevice screen : screens) {
//    DisplayMode dm = screen.getDisplayMode();
//    int screenWidth = dm.getWidth();
//    int screenHeight = dm.getHeight();
//
////     Agrega el tamaño de este monitor al tamaño máximo
//    maxSize.width += screenWidth;
//    if (screenHeight > maxSize.height) {
//        maxSize.height = screenHeight; // El tamaño máximo es la altura del monitor más alto
//    }
//}

// Establece el tamaño máximo para tu JFrame
//resize.setMaximumSize(maxSize);
//// Crea una nueva instancia de ComponentResizer
//ComponentResizer resize2 = new ComponentResizer();
//resize2.setSnapSize(new Dimension(15, 15));
//resize2.setMinimumSize(new Dimension(1040, 945));
//resize2.registerComponent(fram);

//      

  resize = new ComponentResizer();
        resize.setSnapSize(new Dimension(15, 15));
        resize.setMinimumSize(new Dimension(1040, 645));

        // Obtener el tamaño del monitor principal
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice screen = ge.getDefaultScreenDevice();
        DisplayMode dm = screen.getDisplayMode();
        int screenWidth = dm.getWidth();
        int screenHeight = dm.getHeight();

        Dimension maxSize = new Dimension(screenWidth, screenHeight);
        resize.setMaximumSize(maxSize);
        resize.registerComponent(fram);
    }
    
    
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMove = new javax.swing.JPanel();

        panelMove.setOpaque(false);

        javax.swing.GroupLayout panelMoveLayout = new javax.swing.GroupLayout(panelMove);
        panelMove.setLayout(panelMoveLayout);
        panelMoveLayout.setHorizontalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 865, Short.MAX_VALUE)
        );
        panelMoveLayout.setVerticalGroup(
            panelMoveLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 943, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMove;
    // End of variables declaration//GEN-END:variables
}
