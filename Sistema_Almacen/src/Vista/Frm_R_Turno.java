/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

/**
 *
 * @author dfigu
 */
public class Frm_R_Turno extends javax.swing.JFrame {

    /**
     * Creates new form Frm_R_Turno
     */
    public Frm_R_Turno() {
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

        jpanelRound1 = new Vista.Clases.JpanelRound();
        txtcodigo = new componentes.TextFieldShadown();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcodigo1 = new componentes.TextFieldShadown();
        panelRound1 = new Vista.Clases.PanelRound();
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();
        jLabel8 = new javax.swing.JLabel();
        lblclose = new rojerusan.RSLabelImage();
        txtcodigo2 = new componentes.TextFieldShadown();
        jLabel13 = new javax.swing.JLabel();
        txtcodigo3 = new componentes.TextFieldShadown();
        button2 = new componentes.Button();
        button1 = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jpanelRound1.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 420, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        jpanelRound1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Hora_Inicial:");
        jpanelRound1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));
        jpanelRound1.add(txtcodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, -1));

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

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Hora_Final: ");
        jpanelRound1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        lblclose.setBackground(new java.awt.Color(255, 153, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        jpanelRound1.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 48, 30));
        jpanelRound1.add(txtcodigo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 420, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel13.setText("Turno:");
        jpanelRound1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        jpanelRound1.add(txtcodigo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, -1));

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
        jpanelRound1.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 240, 50));

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
        jpanelRound1.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, 240, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked

    }//GEN-LAST:event_lblcloseMouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

    }//GEN-LAST:event_button1ActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_R_Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Turno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Turno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private componentes.Button button2;
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private Vista.Clases.JpanelRound jpanelRound1;
    private rojerusan.RSLabelImage lblclose;
    private Vista.Clases.PanelRound panelRound1;
    private necesario.RSScrollPane rSScrollPane1;
    private componentes.TextFieldShadown txtcodigo;
    private componentes.TextFieldShadown txtcodigo1;
    private componentes.TextFieldShadown txtcodigo2;
    private componentes.TextFieldShadown txtcodigo3;
    // End of variables declaration//GEN-END:variables
}
