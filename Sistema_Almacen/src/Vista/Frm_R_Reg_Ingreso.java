/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author dfigu
 */
public class Frm_R_Reg_Ingreso extends javax.swing.JFrame {

    /**
     * Creates new form Frm_R_Reg_Ingreso
     */
    public Frm_R_Reg_Ingreso() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelR_ingreso = new Vista.Clases.JpanelRound();
        txtcodigo = new componentes.TextFieldShadown();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcodigo1 = new componentes.TextFieldShadown();
        panelRound1 = new Vista.Clases.PanelRound();
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();
        jLabel8 = new javax.swing.JLabel();
        button2 = new componentes.Button();
        button1 = new componentes.Button();
        txtcodigo2 = new componentes.TextFieldShadown();
        jLabel2 = new javax.swing.JLabel();
        button5 = new componentes.Button();
        button6 = new componentes.Button();
        jCheckBox1 = new javax.swing.JCheckBox();
        button4 = new componentes.Button();
        rSScrollPane2 = new necesario.RSScrollPane();
        dttabla1 = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelR_ingreso.setBackground(new java.awt.Color(255, 255, 255));
        panelR_ingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelR_ingreso.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 420, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        panelR_ingreso.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Hora:");
        panelR_ingreso.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));
        panelR_ingreso.add(txtcodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 420, -1));

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

        panelR_ingreso.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Fecha: ");
        panelR_ingreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

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
        panelR_ingreso.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 190, 50));

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
        panelR_ingreso.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 190, 50));
        panelR_ingreso.add(txtcodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 420, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Registro de Ingreso del Estudiante");
        panelR_ingreso.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        button5.setBackground(new java.awt.Color(255, 255, 51));
        button5.setBorder(null);
        button5.setForeground(new java.awt.Color(0, 0, 0));
        button5.setText("Guardar");
        button5.setEnabled(false);
        button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelR_ingreso.add(button5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 510, 90, 50));

        button6.setBackground(new java.awt.Color(255, 255, 51));
        button6.setBorder(null);
        button6.setForeground(new java.awt.Color(0, 0, 0));
        button6.setText("Eliminar");
        button6.setEnabled(false);
        button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelR_ingreso.add(button6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 100, 50));

        jCheckBox1.setText("Abilitar Mantenimiento");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panelR_ingreso.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 450, -1, -1));

        button4.setBackground(new java.awt.Color(255, 255, 51));
        button4.setBorder(null);
        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setText("Modificar");
        button4.setEnabled(false);
        button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        panelR_ingreso.add(button4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 100, 50));

        rSScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane2.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla1.setBackground(new java.awt.Color(204, 204, 204));
        dttabla1.setForeground(new java.awt.Color(255, 255, 255));
        dttabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0242", "12:00", " 1251"},
                {"1365", "11:00", "1425"},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "CÓDIGO", "HORA", "FECHA"
            }
        ));
        dttabla1.setAltoHead(40);
        dttabla1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        dttabla1.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        dttabla1.setColorBordeFilas(new java.awt.Color(0, 0, 204));
        dttabla1.setColorBordeHead(new java.awt.Color(255, 255, 255));
        dttabla1.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        dttabla1.setColorFilasForeground1(new java.awt.Color(153, 153, 153));
        dttabla1.setColorFilasForeground2(new java.awt.Color(153, 153, 153));
        dttabla1.setColorForegroundHead(new java.awt.Color(102, 102, 102));
        dttabla1.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        dttabla1.setColorSelForeground(new java.awt.Color(102, 102, 102));
        dttabla1.setDoubleBuffered(true);
        dttabla1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dttabla1.setGridColor(new java.awt.Color(255, 255, 255));
        dttabla1.setGrosorBordeFilas(0);
        dttabla1.setRowHeight(39);
        dttabla1.setRowMargin(2);
        dttabla1.setRowSelectionAllowed(false);
        dttabla1.setSelectionForeground(new java.awt.Color(153, 153, 153));
        dttabla1.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        dttabla1.setShowGrid(false);
        rSScrollPane2.setViewportView(dttabla1);

        panelR_ingreso.add(rSScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 130, 480, 260));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelR_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 982, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelR_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

    }//GEN-LAST:event_button1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_R_Reg_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reg_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reg_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reg_Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Reg_Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private componentes.Button button2;
    private componentes.Button button4;
    private componentes.Button button5;
    private componentes.Button button6;
    private rojerusan.RSTableMetro dttabla;
    private rojerusan.RSTableMetro dttabla1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    public Vista.Clases.JpanelRound panelR_ingreso;
    private Vista.Clases.PanelRound panelRound1;
    private necesario.RSScrollPane rSScrollPane1;
    private necesario.RSScrollPane rSScrollPane2;
    private componentes.TextFieldShadown txtcodigo;
    private componentes.TextFieldShadown txtcodigo1;
    private componentes.TextFieldShadown txtcodigo2;
    // End of variables declaration//GEN-END:variables
}
