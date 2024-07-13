
package Vista;

import java.awt.Dimension;

public class Frm_R_Empleado extends javax.swing.JFrame {

    public Frm_R_Empleado() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanelRound1 = new Vista.Clases.JpanelRound();
        panelRound1 = new Vista.Clases.PanelRound();
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();
        txtcodigo = new componentes.TextFieldShadown();
        jLabel17 = new javax.swing.JLabel();
        txtdniEstudiante = new componentes.TextFieldShadown();
        txtnomEstudiante = new componentes.TextFieldShadown();
        jLabel19 = new javax.swing.JLabel();
        txtapePaterno = new componentes.TextFieldShadown();
        jLabel20 = new javax.swing.JLabel();
        txtapeMaterno = new componentes.TextFieldShadown();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        panelfecha = new Vista.Clases.JpanelRound();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        lblfechaNacimiento = new javax.swing.JLabel();
        lblclose = new rojerusan.RSLabelImage();
        jLabel21 = new javax.swing.JLabel();
        txtapeMaterno1 = new componentes.TextFieldShadown();
        jLabel22 = new javax.swing.JLabel();
        txtapeMaterno2 = new componentes.TextFieldShadown();
        jLabel23 = new javax.swing.JLabel();
        txtapeMaterno3 = new componentes.TextFieldShadown();
        button2 = new componentes.Button();
        button1 = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorderColor(new java.awt.Color(204, 204, 204));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane1.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla.setBackground(new java.awt.Color(204, 204, 204));
        dttabla.setForeground(new java.awt.Color(255, 255, 255));
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
        dttabla.setColorBordeFilas(new java.awt.Color(0, 0, 204));
        dttabla.setColorBordeHead(new java.awt.Color(255, 255, 255));
        dttabla.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        dttabla.setColorFilasForeground1(new java.awt.Color(153, 153, 153));
        dttabla.setColorFilasForeground2(new java.awt.Color(153, 153, 153));
        dttabla.setColorForegroundHead(new java.awt.Color(102, 102, 102));
        dttabla.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        dttabla.setColorSelForeground(new java.awt.Color(102, 102, 102));
        dttabla.setDoubleBuffered(true);
        dttabla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dttabla.setGridColor(new java.awt.Color(255, 255, 255));
        dttabla.setGrosorBordeFilas(0);
        dttabla.setRowHeight(39);
        dttabla.setRowMargin(2);
        dttabla.setRowSelectionAllowed(false);
        dttabla.setSelectionForeground(new java.awt.Color(153, 153, 153));
        dttabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        dttabla.setShowGrid(false);
        rSScrollPane1.setViewportView(dttabla);

        panelRound1.add(rSScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, 230));

        jpanelRound1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));
        jpanelRound1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, -1));

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel17.setText("Nombres:");
        jpanelRound1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        jpanelRound1.add(txtdniEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, -1));
        jpanelRound1.add(txtnomEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 420, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paterno:");
        jpanelRound1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        jpanelRound1.add(txtapePaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 420, -1));

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel20.setText("Apellido Materno:");
        jpanelRound1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));
        jpanelRound1.add(txtapeMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 420, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        jpanelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel18.setText("DNI:");
        jpanelRound1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Fecha de nacimiento");
        jpanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, -1));

        panelfecha.setBackground(new java.awt.Color(255, 255, 255));
        panelfecha.setRoundBottomLeft(10);
        panelfecha.setRoundBottomRight(10);
        panelfecha.setRoundTopLeft(10);
        panelfecha.setRoundTopRight(10);
        panelfecha.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelfechaMouseMoved(evt);
            }
        });
        panelfecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelfechaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelfechaMouseExited(evt);
            }
        });

        dateChooser1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255)));
        dateChooser1.setForeground(new java.awt.Color(102, 102, 255));
        dateChooser1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                dateChooser1ComponentAdded(evt);
            }
        });
        dateChooser1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                dateChooser1MouseMoved(evt);
            }
        });
        dateChooser1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dateChooser1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dateChooser1FocusLost(evt);
            }
        });
        dateChooser1.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                dateChooser1MouseWheelMoved(evt);
            }
        });
        dateChooser1.addHierarchyBoundsListener(new java.awt.event.HierarchyBoundsListener() {
            public void ancestorMoved(java.awt.event.HierarchyEvent evt) {
                dateChooser1AncestorMoved(evt);
            }
            public void ancestorResized(java.awt.event.HierarchyEvent evt) {
            }
        });
        dateChooser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateChooser1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dateChooser1MouseExited(evt);
            }
        });

        lblfechaNacimiento.setForeground(new java.awt.Color(140, 140, 140));
        lblfechaNacimiento.setText("Selecionar Fecha");
        lblfechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfechaNacimientoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelfechaLayout = new javax.swing.GroupLayout(panelfecha);
        panelfecha.setLayout(panelfechaLayout);
        panelfechaLayout.setHorizontalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addComponent(lblfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
                .addGap(10, 10, 10))
        );

        jpanelRound1.add(panelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 40, -1, -1));

        lblclose.setBackground(new java.awt.Color(255, 153, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        jpanelRound1.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 48, 40));

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel21.setText("Usuario:");
        jpanelRound1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        jpanelRound1.add(txtapeMaterno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 420, -1));

        jLabel22.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel22.setText("Contraseña:");
        jpanelRound1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, -1));
        jpanelRound1.add(txtapeMaterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 420, -1));

        jLabel23.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel23.setText("Teléfono:");
        jpanelRound1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));
        jpanelRound1.add(txtapeMaterno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 340, -1));

        button2.setBackground(new java.awt.Color(255, 255, 51));
        button2.setBorder(null);
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Nuevo");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jpanelRound1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 590, 240, 50));

        button1.setBackground(new java.awt.Color(255, 255, 51));
        button1.setBorder(null);
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Registrar");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        jpanelRound1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 590, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblfechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfechaNacimientoMouseClicked


        lblclose.setPreferredSize(new Dimension(20, 20));
        lblclose.setVisible(true);
    }//GEN-LAST:event_lblfechaNacimientoMouseClicked

    private void dateChooser1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_dateChooser1ComponentAdded

    }//GEN-LAST:event_dateChooser1ComponentAdded

    private void dateChooser1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseMoved

    }//GEN-LAST:event_dateChooser1MouseMoved

    private void dateChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateChooser1FocusGained

    }//GEN-LAST:event_dateChooser1FocusGained

    private void dateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateChooser1FocusLost

    }//GEN-LAST:event_dateChooser1FocusLost

    private void dateChooser1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_dateChooser1MouseWheelMoved

    }//GEN-LAST:event_dateChooser1MouseWheelMoved

    private void dateChooser1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_dateChooser1AncestorMoved

    }//GEN-LAST:event_dateChooser1AncestorMoved

    private void dateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseClicked

    }//GEN-LAST:event_dateChooser1MouseClicked

    private void dateChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseExited

    }//GEN-LAST:event_dateChooser1MouseExited

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        dateChooser1.setVisible(false);
        lblclose.setPreferredSize(new Dimension(0, 0));
        lblclose.setVisible(false);
    }//GEN-LAST:event_lblcloseMouseClicked

    private void panelfechaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseMoved

    }//GEN-LAST:event_panelfechaMouseMoved

    private void panelfechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseEntered

    }//GEN-LAST:event_panelfechaMouseEntered

    private void panelfechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseExited

    }//GEN-LAST:event_panelfechaMouseExited

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

     
    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_R_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Empleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Empleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private componentes.Button button2;
    private com.raven.datechooser.DateChooser dateChooser1;
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel8;
    private Vista.Clases.JpanelRound jpanelRound1;
    private rojerusan.RSLabelImage lblclose;
    private javax.swing.JLabel lblfechaNacimiento;
    private Vista.Clases.PanelRound panelRound1;
    private Vista.Clases.JpanelRound panelfecha;
    private necesario.RSScrollPane rSScrollPane1;
    private componentes.TextFieldShadown txtapeMaterno;
    private componentes.TextFieldShadown txtapeMaterno1;
    private componentes.TextFieldShadown txtapeMaterno2;
    private componentes.TextFieldShadown txtapeMaterno3;
    private componentes.TextFieldShadown txtapePaterno;
    private componentes.TextFieldShadown txtcodigo;
    private componentes.TextFieldShadown txtdniEstudiante;
    private componentes.TextFieldShadown txtnomEstudiante;
    // End of variables declaration//GEN-END:variables
}
