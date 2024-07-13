
package Vista;

import Controlador.ControladorPrograma;
import Modelo.ProgramaEstudio;
import Vista.Clases.ModernScrollBarUI;
import Vista.Clases.ScrollPanelPersonalizado;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Frm_R_Prog_Estudio extends javax.swing.JFrame {

    Controlador.ControladorPrograma programa = new ControladorPrograma(this);
    private DefaultTableModel tableModel;

    public Frm_R_Prog_Estudio() {
        initComponents();
        ScrollPanelPersonalizado customScrollPane = new ScrollPanelPersonalizado(dttabla);
        rSScrollPane1.setViewportView(customScrollPane);
        rSScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        tableModel = new DefaultTableModel(new String[]{"Código", "Nombre"}, 0);
        dttabla.setModel(tableModel);
        cargarProgramas();
    }

    private void cargarProgramas() {
        List<ProgramaEstudio> programas = programa.obtenerTodosLosProgramas();
        tableModel.setRowCount(0); // Limpiar la tabla
        for (ProgramaEstudio prog : programas) {
            tableModel.addRow(new Object[]{prog.getCod_Programa(), prog.getNombre()});
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelProgramaEstudio = new Vista.Clases.JpanelRound();
        txtNombrePrograma = new componentes.TextFieldShadown();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtcodigoPrograma = new componentes.TextFieldShadown();
        button2 = new componentes.Button();
        button1 = new componentes.Button();
        panelRound2 = new Vista.Clases.PanelRound();
        rSScrollPane2 = new necesario.RSScrollPane();
        dttabla1 = new rojerusan.RSTableMetro();
        lblclose = new rojerusan.RSLabelImage();
        lblclose1 = new rojerusan.RSLabelImage();
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelProgramaEstudio.setBackground(new java.awt.Color(255, 255, 255));
        panelProgramaEstudio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 0), 0));
        panelProgramaEstudio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelProgramaEstudio.add(txtNombrePrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 420, -1));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        panelProgramaEstudio.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Programa de Estudio:");
        panelProgramaEstudio.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        panelProgramaEstudio.add(txtcodigoPrograma, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, -1));

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
        panelProgramaEstudio.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 240, 50));

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
        panelProgramaEstudio.add(button1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 500, 240, 50));

        panelRound2.setBackground(new java.awt.Color(255, 255, 255));
        panelRound2.setBorderColor(new java.awt.Color(204, 204, 204));
        panelRound2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane2.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla1.setBackground(new java.awt.Color(204, 204, 204));
        dttabla1.setForeground(new java.awt.Color(255, 255, 255));
        dttabla1.setModel(new javax.swing.table.DefaultTableModel(
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

        panelRound2.add(rSScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 790, 230));

        lblclose.setBackground(new java.awt.Color(255, 153, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });
        panelRound2.add(lblclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 48, 30));

        panelProgramaEstudio.add(panelRound2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));

        lblclose1.setBackground(new java.awt.Color(255, 153, 0));
        lblclose1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        lblclose1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblclose1MouseClicked(evt);
            }
        });
        panelProgramaEstudio.add(lblclose1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 48, 30));

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane1.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla.setBackground(new java.awt.Color(204, 204, 204));
        dttabla.setForeground(new java.awt.Color(255, 255, 255));
        dttabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE"
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

        panelProgramaEstudio.add(rSScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 710, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProgramaEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelProgramaEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

      
    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
      String a=  programa.registrarPrograma();
        System.out.println(a);
    }//GEN-LAST:event_button1ActionPerformed

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked

    }//GEN-LAST:event_lblcloseMouseClicked

    private void lblclose1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblclose1MouseClicked
       
    }//GEN-LAST:event_lblclose1MouseClicked

    public String getCodigoPrograma(){
    return txtcodigoPrograma.getText().trim();
    }
      public String getNombrePrograma(){
    return txtNombrePrograma.getText().trim();
    }
    
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
            java.util.logging.Logger.getLogger(Frm_R_Prog_Estudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Prog_Estudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Prog_Estudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Prog_Estudio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Prog_Estudio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private componentes.Button button2;
    private rojerusan.RSTableMetro dttabla;
    private rojerusan.RSTableMetro dttabla1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private rojerusan.RSLabelImage lblclose;
    private rojerusan.RSLabelImage lblclose1;
    public Vista.Clases.JpanelRound panelProgramaEstudio;
    private Vista.Clases.PanelRound panelRound2;
    private necesario.RSScrollPane rSScrollPane1;
    private necesario.RSScrollPane rSScrollPane2;
    private componentes.TextFieldShadown txtNombrePrograma;
    private componentes.TextFieldShadown txtcodigoPrograma;
    // End of variables declaration//GEN-END:variables
}
