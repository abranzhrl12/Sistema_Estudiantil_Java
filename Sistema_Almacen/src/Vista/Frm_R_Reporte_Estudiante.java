/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author dfigu
 */
public class Frm_R_Reporte_Estudiante extends javax.swing.JFrame {

    /**
     * Creates new form Frm_R_Reporte_Estudiante
     */
    public Frm_R_Reporte_Estudiante() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_repot_estudiante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtcodigo = new componentes.TextFieldShadown();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        rSScrollPane2 = new necesario.RSScrollPane();
        dttabla1 = new rojerusan.RSTableMetro();
        button2 = new componentes.Button();
        button3 = new componentes.Button();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_repot_estudiante.setBackground(new java.awt.Color(255, 255, 255));
        panel_repot_estudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Generar Reporte de Estudiante");
        panel_repot_estudiante.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        jRadioButton1.setText("Reporte por Estudiante");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jRadioButton2.setSelected(true);
        jRadioButton2.setText("Reporte Global");
        panel_repot_estudiante.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        panel_repot_estudiante.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 390, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosUtilidades/search-24.png"))); // NOI18N
        jLabel4.setText("Buscar ");
        panel_repot_estudiante.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        jRadioButton3.setText("DNI");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, -1, -1));

        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Código");
        panel_repot_estudiante.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));

        jRadioButton5.setText("Nombre");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, -1, -1));

        rSScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane2.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla1.setBackground(new java.awt.Color(204, 204, 204));
        dttabla1.setForeground(new java.awt.Color(255, 255, 255));
        dttabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0242", "12:00", " 01-07-2024", null, null, null, null, null, null},
                {"1365", "11:00", " 02-07-2024", null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "CÓDIGO", "NOMBRE", "APELLIDOS", "DNI", "CARRERA", "CICLO", "TURNO", "FECHA DE INGRESO", "HORA DE INGRESO"
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

        panel_repot_estudiante.add(rSScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 930, 260));

        button2.setBackground(new java.awt.Color(255, 255, 51));
        button2.setBorder(null);
        button2.setForeground(new java.awt.Color(0, 0, 0));
        button2.setText("Guardar PDF");
        button2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 600, 180, 50));

        button3.setBackground(new java.awt.Color(255, 255, 51));
        button3.setBorder(null);
        button3.setForeground(new java.awt.Color(0, 0, 0));
        button3.setText("Nuevo");
        button3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(button3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 600, 180, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconosUtilidades/search-24.png"))); // NOI18N
        jLabel1.setText("Elegir rango de fecha");
        panel_repot_estudiante.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jRadioButton6.setText("Por Defecto");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        panel_repot_estudiante.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        jRadioButton7.setSelected(true);
        jRadioButton7.setText("Manualmente");
        panel_repot_estudiante.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccionar>", "Último Día", "Última Semana", "Último mes", "Último año", "Todo" }));
        panel_repot_estudiante.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, 120, 30));
        panel_repot_estudiante.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 240, 110, 30));
        panel_repot_estudiante.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 240, 110, 30));

        jLabel5.setText("Fecha Final");
        panel_repot_estudiante.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 250, -1, -1));

        jLabel6.setText("Fecha de Inicio");
        panel_repot_estudiante.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, -1));

        getContentPane().add(panel_repot_estudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_R_Reporte_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reporte_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reporte_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Reporte_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Reporte_Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button2;
    private componentes.Button button3;
    private rojerusan.RSTableMetro dttabla1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JPanel panel_repot_estudiante;
    private necesario.RSScrollPane rSScrollPane2;
    private componentes.TextFieldShadown txtcodigo;
    // End of variables declaration//GEN-END:variables
}
