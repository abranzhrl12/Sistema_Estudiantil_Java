/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Vista.Clases.ScrollPanelPersonalizado;
import java.awt.Color;
import Vista.Clases.SimpleTitleBar;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
/**
 *
 * @author Abraham
 */
public class prueba extends javax.swing.JFrame {

    int ancho=0;
    int alto=0;
    public prueba() {
         
        initComponents();
        this.setLocationRelativeTo(null);
        setBackground(new Color(0,0,0,0));
       simpleTitleBar1.init(this);
      desplegable1.setVisible(false);
     
    }

    public void LogicaPanel(JPanel jo,int tamaño){
        if (jo.isVisible()) {
            jo.setVisible(false);
            jo.setPreferredSize(new Dimension(300, 0)); // Establece altura cero
        } else {
            jo.setVisible(true);
            jo.setPreferredSize(new Dimension(300, tamaño)); // Establece altura deseada
        }
        // Revalidar el diseño para reflejar los cambios
        jo.revalidate();
        jo.repaint();
    }
    
     JPanel glo;

    public void InitContent(JPanel x) {
        try {
            x.show();
        x.setSize(contenedorPrincipal.getSize());
        x.setLocation(0, 0);
        contenedorPrincipal.removeAll();
        contenedorPrincipal.add(x, BorderLayout.CENTER);
        contenedorPrincipal.revalidate();
        contenedorPrincipal.repaint(); 
        } catch (Exception e) {
        }
       

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fiveCodMoverJFrame1 = new FiveCodMover.FiveCodMoverJFrame();
        panelRound1 = new Vista.Clases.PanelRound();
        simpleTitleBar1 = new Vista.Clases.SimpleTitleBar();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        jpanelRound2 = new Vista.Clases.JpanelRound();
        btn_equipo = new rojerusan.RSButtonIconI();
        desplegable1 = new javax.swing.JPanel();
        jpanelRound4 = new Vista.Clases.JpanelRound();
        btnconectar = new rojerusan.RSButtonRound();
        jpanelRound5 = new Vista.Clases.JpanelRound();
        btn_equipo3 = new rojerusan.RSButtonIconI();
        jpanelRound3 = new Vista.Clases.JpanelRound();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        btn_equipo1 = new rojerusan.RSButtonIconI();
        jpanelRound6 = new Vista.Clases.JpanelRound();
        jpanelRound7 = new Vista.Clases.JpanelRound();
        btn_equipo5 = new rojerusan.RSButtonIconI();
        jpanelRound8 = new Vista.Clases.JpanelRound();
        btn_equipo6 = new rojerusan.RSButtonIconI();
        desplegable2 = new javax.swing.JPanel();
        jpanelRound9 = new Vista.Clases.JpanelRound();
        btn_equipo7 = new rojerusan.RSButtonIconI();
        jpanelRound10 = new Vista.Clases.JpanelRound();
        btn_equipo8 = new rojerusan.RSButtonIconI();
        btn_equipo4 = new rojerusan.RSButtonIconI();
        contenedorPrincipal = new Vista.Clases.JpanelRound();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(248, 250, 249));
        panelRound1.setBorderColor(new java.awt.Color(226, 226, 226));

        simpleTitleBar1.setBackground(new java.awt.Color(255, 255, 255));
        simpleTitleBar1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                simpleTitleBar1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                simpleTitleBar1MouseMoved(evt);
            }
        });

        javax.swing.GroupLayout simpleTitleBar1Layout = new javax.swing.GroupLayout(simpleTitleBar1);
        simpleTitleBar1.setLayout(simpleTitleBar1Layout);
        simpleTitleBar1Layout.setHorizontalGroup(
            simpleTitleBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1175, Short.MAX_VALUE)
        );
        simpleTitleBar1Layout.setVerticalGroup(
            simpleTitleBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 26, Short.MAX_VALUE)
        );

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomLeft(25);

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setDoubleBuffered(false);
        jpanelRound2.setRoundBottomLeft(15);
        jpanelRound2.setRoundBottomRight(15);
        jpanelRound2.setRoundTopLeft(15);
        jpanelRound2.setRoundTopRight(15);

        btn_equipo.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo.setText("Escaner");
        btn_equipo.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo.setName(""); // NOI18N
        btn_equipo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound2Layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(btn_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        desplegable1.setBackground(new java.awt.Color(255, 255, 255));

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(15);
        jpanelRound4.setRoundBottomRight(15);
        jpanelRound4.setRoundTopLeft(15);
        jpanelRound4.setRoundTopRight(15);

        btnconectar.setBackground(new java.awt.Color(255, 255, 255));
        btnconectar.setText("Ingresar");
        btnconectar.setColorText(new java.awt.Color(95, 95, 112));
        btnconectar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jpanelRound5.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound5.setRoundBottomLeft(15);
        jpanelRound5.setRoundBottomRight(15);
        jpanelRound5.setRoundTopLeft(15);
        jpanelRound5.setRoundTopRight(15);

        btn_equipo3.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo3.setText("Generar QR");
        btn_equipo3.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo3.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo3.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo3.setName(""); // NOI18N
        btn_equipo3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound5Layout = new javax.swing.GroupLayout(jpanelRound5);
        jpanelRound5.setLayout(jpanelRound5Layout);
        jpanelRound5Layout.setHorizontalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelRound5Layout.setVerticalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btn_equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout desplegable1Layout = new javax.swing.GroupLayout(desplegable1);
        desplegable1.setLayout(desplegable1Layout);
        desplegable1Layout.setHorizontalGroup(
            desplegable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(desplegable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        desplegable1Layout.setVerticalGroup(
            desplegable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jpanelRound3.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound3.setRoundBottomLeft(15);
        jpanelRound3.setRoundBottomRight(15);
        jpanelRound3.setRoundTopLeft(15);
        jpanelRound3.setRoundTopRight(15);
        jpanelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrowdowm.png"))); // NOI18N
        jpanelRound3.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 12, 20, 20));

        btn_equipo1.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student2.png"))); // NOI18N
        btn_equipo1.setText("Estudiantes");
        btn_equipo1.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo1.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo1.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo1.setName(""); // NOI18N
        btn_equipo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo1ActionPerformed(evt);
            }
        });
        jpanelRound3.add(btn_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 180, 32));

        jpanelRound6.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound6.setRoundBottomLeft(15);
        jpanelRound6.setRoundBottomRight(15);
        jpanelRound6.setRoundTopLeft(15);
        jpanelRound6.setRoundTopRight(15);

        javax.swing.GroupLayout jpanelRound6Layout = new javax.swing.GroupLayout(jpanelRound6);
        jpanelRound6.setLayout(jpanelRound6Layout);
        jpanelRound6Layout.setHorizontalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jpanelRound6Layout.setVerticalGroup(
            jpanelRound6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jpanelRound7.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound7.setRoundBottomLeft(15);
        jpanelRound7.setRoundBottomRight(15);
        jpanelRound7.setRoundTopLeft(15);
        jpanelRound7.setRoundTopRight(15);

        btn_equipo5.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo5.setText("Inicio");
        btn_equipo5.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo5.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo5.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo5.setName(""); // NOI18N
        btn_equipo5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound7Layout = new javax.swing.GroupLayout(jpanelRound7);
        jpanelRound7.setLayout(jpanelRound7Layout);
        jpanelRound7Layout.setHorizontalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jpanelRound7Layout.setVerticalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound7Layout.createSequentialGroup()
                .addGap(0, 14, Short.MAX_VALUE)
                .addComponent(btn_equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanelRound8.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound8.setRoundBottomLeft(15);
        jpanelRound8.setRoundBottomRight(15);
        jpanelRound8.setRoundTopLeft(15);
        jpanelRound8.setRoundTopRight(15);

        btn_equipo6.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo6.setText("Vehiculos");
        btn_equipo6.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo6.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo6.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo6.setName(""); // NOI18N
        btn_equipo6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound8Layout = new javax.swing.GroupLayout(jpanelRound8);
        jpanelRound8.setLayout(jpanelRound8Layout);
        jpanelRound8Layout.setHorizontalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpanelRound8Layout.setVerticalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound8Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btn_equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanelRound9.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound9.setRoundBottomLeft(15);
        jpanelRound9.setRoundBottomRight(15);
        jpanelRound9.setRoundTopLeft(15);
        jpanelRound9.setRoundTopRight(15);

        btn_equipo7.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo7.setText("Agregar");
        btn_equipo7.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo7.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo7.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo7.setName(""); // NOI18N
        btn_equipo7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound9Layout = new javax.swing.GroupLayout(jpanelRound9);
        jpanelRound9.setLayout(jpanelRound9Layout);
        jpanelRound9Layout.setHorizontalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_equipo7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jpanelRound9Layout.setVerticalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_equipo7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        jpanelRound10.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound10.setRoundBottomLeft(15);
        jpanelRound10.setRoundBottomRight(15);
        jpanelRound10.setRoundTopLeft(15);
        jpanelRound10.setRoundTopRight(15);

        btn_equipo8.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo8.setText("Generar QR");
        btn_equipo8.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo8.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo8.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo8.setName(""); // NOI18N
        btn_equipo8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound10Layout = new javax.swing.GroupLayout(jpanelRound10);
        jpanelRound10.setLayout(jpanelRound10Layout);
        jpanelRound10Layout.setHorizontalGroup(
            jpanelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound10Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_equipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelRound10Layout.setVerticalGroup(
            jpanelRound10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound10Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btn_equipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout desplegable2Layout = new javax.swing.GroupLayout(desplegable2);
        desplegable2.setLayout(desplegable2Layout);
        desplegable2Layout.setHorizontalGroup(
            desplegable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(desplegable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        desplegable2Layout.setVerticalGroup(
            desplegable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpanelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btn_equipo4.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo4.setText("Reportes");
        btn_equipo4.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo4.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo4.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo4.setName(""); // NOI18N
        btn_equipo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(desplegable1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(desplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btn_equipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(desplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRound1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_equipo4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        contenedorPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contenedorPrincipalLayout = new javax.swing.GroupLayout(contenedorPrincipal);
        contenedorPrincipal.setLayout(contenedorPrincipalLayout);
        contenedorPrincipalLayout.setHorizontalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        contenedorPrincipalLayout.setVerticalGroup(
            contenedorPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 689, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(simpleTitleBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void simpleTitleBar1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpleTitleBar1MouseDragged
       FiveCodMover.FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }//GEN-LAST:event_simpleTitleBar1MouseDragged

    private void simpleTitleBar1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_simpleTitleBar1MouseMoved
       FiveCodMover.FiveCodMoverJFrame.MousePressed(evt);
    }//GEN-LAST:event_simpleTitleBar1MouseMoved
Frm_R_Empleado p = new Frm_R_Empleado();

    public void btn2_equipo() {
      
     
        p.show();
        p.setSize(contenedorPrincipal.getSize());
       // p.coloraaa(ree,gee,bluee);
       // p.paneles(255, 255,255);
        p.setLocation(0, 0);
        contenedorPrincipal.removeAll();
        
        contenedorPrincipal.add(p, BorderLayout.CENTER);
        contenedorPrincipal.revalidate();
       contenedorPrincipal.repaint();
       
    glo = p;
    }

    private void btn_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipoActionPerformed
contenedorPrincipal.removeAll();
      
       btn2_equipo();
       
    }//GEN-LAST:event_btn_equipoActionPerformed

    private void btn_equipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo1ActionPerformed
        LogicaPanel(desplegable1,114);
    }//GEN-LAST:event_btn_equipo1ActionPerformed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
     ancho =   contenedorPrincipal.getHeight();
        alto =   contenedorPrincipal.getWidth();
        InitContent(glo);
    }//GEN-LAST:event_formMouseDragged

    private void btn_equipo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo3ActionPerformed

    private void btn_equipo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo4ActionPerformed

    private void btn_equipo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo5ActionPerformed

    private void btn_equipo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo6ActionPerformed

    private void btn_equipo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo7ActionPerformed

    private void btn_equipo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo8ActionPerformed

    private void btnconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconectarActionPerformed
//        ValidarC_Vacios val=new ValidarC_Vacios();
//        boolean a= val.camposTextoVacios(txtusuario,txtpass);
//        if(a){
//            log.validarCredenciales();
//        }
    }//GEN-LAST:event_btnconectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prueba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btn_equipo;
    private rojerusan.RSButtonIconI btn_equipo1;
    private rojerusan.RSButtonIconI btn_equipo3;
    private rojerusan.RSButtonIconI btn_equipo4;
    private rojerusan.RSButtonIconI btn_equipo5;
    private rojerusan.RSButtonIconI btn_equipo6;
    private rojerusan.RSButtonIconI btn_equipo7;
    private rojerusan.RSButtonIconI btn_equipo8;
    private rojerusan.RSButtonRound btnconectar;
    private Vista.Clases.JpanelRound contenedorPrincipal;
    private javax.swing.JPanel desplegable1;
    private javax.swing.JPanel desplegable2;
    private FiveCodMover.FiveCodMoverJFrame fiveCodMoverJFrame1;
    private Vista.Clases.JpanelRound jpanelRound1;
    private Vista.Clases.JpanelRound jpanelRound10;
    private Vista.Clases.JpanelRound jpanelRound2;
    private Vista.Clases.JpanelRound jpanelRound3;
    private Vista.Clases.JpanelRound jpanelRound4;
    private Vista.Clases.JpanelRound jpanelRound5;
    private Vista.Clases.JpanelRound jpanelRound6;
    private Vista.Clases.JpanelRound jpanelRound7;
    private Vista.Clases.JpanelRound jpanelRound8;
    private Vista.Clases.JpanelRound jpanelRound9;
    private Vista.Clases.PanelRound panelRound1;
    private rojerusan.RSLabelImage rSLabelImage1;
    private Vista.Clases.SimpleTitleBar simpleTitleBar1;
    // End of variables declaration//GEN-END:variables
}
