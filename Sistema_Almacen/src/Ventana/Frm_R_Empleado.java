/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Ventana;

import java.awt.Color;

/**
 *
 * @author Abraham
 */
public class Frm_R_Empleado extends javax.swing.JPanel {
    int x1;
   int x2;
   int x3;
  
    public Frm_R_Empleado() {
   
    
        initComponents();
        cambiar();
    }

       public void cambiar() {
    // Crea una instancia de tu ScrollPanelPersonalizado y configúrala según tus necesidades
    ScrollPanelPersonalizado customScrollPane = new ScrollPanelPersonalizado(dttabla);

    // Establece el ScrollPanelPersonalizado en tu JScrollPane
    rSScrollPane1.setViewportView(customScrollPane);
    rSScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
    rSScrollPane1.getHorizontalScrollBar().setUI(new ModernScrollBarUI());
    dttabla.setFillsViewportHeight(true);
    rSScrollPane1.setColumnHeader(null);
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_r_7 = new LIB.JPanelRound();
        jPanel7 = new javax.swing.JPanel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        rSMTextFull9 = new rojeru_san.RSMTextFull();
        rSButtonIconI6 = new rojerusan.RSButtonIconI();
        panel_r_3 = new LIB.JPanelRound();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rSMTextFull11 = new rojeru_san.RSMTextFull();
        rSMTextFull2 = new rojeru_san.RSMTextFull();
        rSMTextFull12 = new rojeru_san.RSMTextFull();
        rSMTextFull13 = new rojeru_san.RSMTextFull();
        jLabel13 = new javax.swing.JLabel();
        rSMTextFull14 = new rojeru_san.RSMTextFull();
        jLabel14 = new javax.swing.JLabel();
        rSMTextFull15 = new rojeru_san.RSMTextFull();
        jLabel15 = new javax.swing.JLabel();
        rSMTextFull16 = new rojeru_san.RSMTextFull();
        jLabel16 = new javax.swing.JLabel();
        rSMTextFull17 = new rojeru_san.RSMTextFull();
        rSButtonRound8 = new rojerusan.RSButtonRound();
        rSButtonRound3 = new rojerusan.RSButtonRound();
        rSButtonRound2 = new rojerusan.RSButtonRound();
        rSButtonRound1 = new rojerusan.RSButtonRound();
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(235, 238, 245));

        panel_r_7.setBackground(new java.awt.Color(255, 255, 255));
        panel_r_7.setForeground(new java.awt.Color(204, 204, 204));
        panel_r_7.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel_r_7.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel_r_7.setOpaque(true);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153), 2), "BUSCAR EQUIPO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel7.setToolTipText("KOLA");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jRadioButton7.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jRadioButton7.setText("ID");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel7.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 90, 20));

        jRadioButton8.setFont(new java.awt.Font("Leelawadee UI", 1, 12)); // NOI18N
        jRadioButton8.setText("DNI");
        jPanel7.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, 20));

        rSMTextFull9.setForeground(new java.awt.Color(0, 153, 153));
        rSMTextFull9.setBordeColorFocus(new java.awt.Color(0, 153, 153));
        rSMTextFull9.setPlaceholder("Buscar Equipo");
        rSMTextFull9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSMTextFull9ActionPerformed(evt);
            }
        });
        jPanel7.add(rSMTextFull9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 270, 37));

        rSButtonIconI6.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonIconI6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupa.png"))); // NOI18N
        rSButtonIconI6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonIconI6ActionPerformed(evt);
            }
        });
        jPanel7.add(rSButtonIconI6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 30, 20));

        javax.swing.GroupLayout panel_r_7Layout = new javax.swing.GroupLayout(panel_r_7);
        panel_r_7.setLayout(panel_r_7Layout);
        panel_r_7Layout.setHorizontalGroup(
            panel_r_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_r_7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, 377, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        panel_r_7Layout.setVerticalGroup(
            panel_r_7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_r_7Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        panel_r_3.setBackground(new java.awt.Color(255, 255, 255));
        panel_r_3.setForeground(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel_r_3.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("ID:");

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Nombre:");

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Apellido:");

        rSMTextFull11.setText(" ");
        rSMTextFull11.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        rSMTextFull2.setText(" ");
        rSMTextFull2.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        rSMTextFull12.setText(" ");
        rSMTextFull12.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        rSMTextFull13.setText(" ");
        rSMTextFull13.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel13.setText("Fecha de Nac:");

        rSMTextFull14.setText(" ");
        rSMTextFull14.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel14.setText("Teléfono:");

        rSMTextFull15.setText(" ");
        rSMTextFull15.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        jLabel15.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel15.setText("Usuario:");

        rSMTextFull16.setText(" ");
        rSMTextFull16.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        jLabel16.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel16.setText("Contraseña:");

        rSMTextFull17.setText(" ");
        rSMTextFull17.setBordeColorFocus(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout panel_r_3Layout = new javax.swing.GroupLayout(panel_r_3);
        panel_r_3.setLayout(panel_r_3Layout);
        panel_r_3Layout.setHorizontalGroup(
            panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_r_3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addGap(39, 39, 39)
                        .addComponent(rSMTextFull17, javax.swing.GroupLayout.DEFAULT_SIZE, 306, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_r_3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_r_3Layout.createSequentialGroup()
                        .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panel_r_3Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addGap(67, 67, 67))
                                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)))
                            .addComponent(jLabel15))
                        .addGap(25, 25, 25)
                        .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSMTextFull16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rSMTextFull12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(23, 23, 23))
        );
        panel_r_3Layout.setVerticalGroup(
            panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_r_3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel8))
                    .addComponent(rSMTextFull2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addComponent(rSMTextFull11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(rSMTextFull14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rSMTextFull15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel9)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addComponent(rSMTextFull16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(rSMTextFull17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        rSButtonRound8.setBackground(new java.awt.Color(102, 102, 0));
        rSButtonRound8.setText("Registrar Empleado");
        rSButtonRound8.setColorHover(new java.awt.Color(235, 238, 245));
        rSButtonRound8.setColorText(new java.awt.Color(255, 255, 0));
        rSButtonRound8.setColorTextHover(new java.awt.Color(102, 102, 0));
        rSButtonRound8.setFont(new java.awt.Font("Montserrat Black", 1, 36)); // NOI18N

        rSButtonRound3.setBackground(new java.awt.Color(153, 204, 0));
        rSButtonRound3.setText("Nuevo");
        rSButtonRound3.setColorText(new java.awt.Color(0, 102, 102));
        rSButtonRound3.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        rSButtonRound3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonRound3ActionPerformed(evt);
            }
        });

        rSButtonRound2.setBackground(new java.awt.Color(153, 204, 0));
        rSButtonRound2.setText("Actualizar");
        rSButtonRound2.setColorText(new java.awt.Color(0, 102, 102));
        rSButtonRound2.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N

        rSButtonRound1.setBackground(new java.awt.Color(153, 204, 0));
        rSButtonRound1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        rSButtonRound1.setText("Registrar");
        rSButtonRound1.setColorText(new java.awt.Color(0, 102, 102));
        rSButtonRound1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane1.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla.setBackground(new java.awt.Color(204, 204, 204));
        dttabla.setForeground(new java.awt.Color(204, 204, 204));
        dttabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12321", "fdsfsd", "54", "fsdf", "fdsf"},
                {"121", "fdsfsd", "453", "fdsf", null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE", "CANTIDAD ", "MARCA", "MODELO"
            }
        ));
        dttabla.setAltoHead(40);
        dttabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        dttabla.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        dttabla.setColorBordeFilas(new java.awt.Color(153, 153, 153));
        dttabla.setColorBordeHead(new java.awt.Color(255, 255, 255));
        dttabla.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        dttabla.setColorFilasForeground1(new java.awt.Color(153, 153, 153));
        dttabla.setColorFilasForeground2(new java.awt.Color(153, 153, 153));
        dttabla.setColorForegroundHead(new java.awt.Color(102, 102, 102));
        dttabla.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        dttabla.setColorSelForeground(new java.awt.Color(102, 102, 102));
        dttabla.setDoubleBuffered(true);
        dttabla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dttabla.setGridColor(new java.awt.Color(153, 153, 153));
        dttabla.setGrosorBordeFilas(0);
        dttabla.setRowHeight(35);
        dttabla.setRowMargin(2);
        dttabla.setSelectionForeground(new java.awt.Color(153, 153, 153));
        dttabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        dttabla.setShowGrid(false);
        rSScrollPane1.setViewportView(dttabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(panel_r_7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33)
                .addComponent(panel_r_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(rSButtonRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rSButtonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(rSButtonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(rSButtonRound8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_r_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_r_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSButtonRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSButtonRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonIconI6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonIconI6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSButtonIconI6ActionPerformed

    private void rSMTextFull9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSMTextFull9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rSMTextFull9ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void rSButtonRound3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonRound3ActionPerformed

    }//GEN-LAST:event_rSButtonRound3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private LIB.JPanelRound panel_r_3;
    private LIB.JPanelRound panel_r_7;
    private rojerusan.RSButtonIconI rSButtonIconI6;
    private rojerusan.RSButtonRound rSButtonRound1;
    private rojerusan.RSButtonRound rSButtonRound2;
    private rojerusan.RSButtonRound rSButtonRound3;
    private rojerusan.RSButtonRound rSButtonRound8;
    private rojeru_san.RSMTextFull rSMTextFull11;
    private rojeru_san.RSMTextFull rSMTextFull12;
    private rojeru_san.RSMTextFull rSMTextFull13;
    private rojeru_san.RSMTextFull rSMTextFull14;
    private rojeru_san.RSMTextFull rSMTextFull15;
    private rojeru_san.RSMTextFull rSMTextFull16;
    private rojeru_san.RSMTextFull rSMTextFull17;
    private rojeru_san.RSMTextFull rSMTextFull2;
    private rojeru_san.RSMTextFull rSMTextFull9;
    private necesario.RSScrollPane rSScrollPane1;
    // End of variables declaration//GEN-END:variables
}
