
package Vista;

import Controlador.ControladorPrograma;
import Modelo.ProgramaEstudio;
import Vista.Clases.ModernScrollBarUI;
import Vista.Clases.RoundedBorder;
import Vista.Clases.ScrollPanelPersonalizado;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.table.DefaultTableModel;

public class Frm_R_Prog_Estudio extends javax.swing.JFrame {

    Controlador.ControladorPrograma programa = new ControladorPrograma(this);
    private DefaultTableModel tableModel;

    public Frm_R_Prog_Estudio() {
        initComponents();
        
//          jScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
   

          
       
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

        PanelProgramas = new Vista.Clases.JpanelRound();
        jLabel11 = new javax.swing.JLabel();
        txtcodigoPrograma = new componentes.TextFieldShadown();
        jLabel12 = new javax.swing.JLabel();
        txtNombrePrograma = new componentes.TextFieldShadown();
        button2 = new componentes.Button();
        button1 = new componentes.Button();
        jLabel2 = new javax.swing.JLabel();
        rSScrollPane2 = new necesario.RSScrollPane();
        dttabla1 = new rojerusan.RSTableMetro();
        button5 = new componentes.Button();
        button6 = new componentes.Button();
        jCheckBox1 = new javax.swing.JCheckBox();
        button4 = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelProgramas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Programa de Estudio:");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Registro de Programa de Estudio");

        rSScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane2.setColorBackground(new java.awt.Color(255, 255, 255));

        dttabla1.setBackground(new java.awt.Color(204, 204, 204));
        dttabla1.setForeground(new java.awt.Color(255, 255, 255));
        dttabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"0242", " 1251"},
                {"1365", "1425"},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "CÓDIGO", "PROG. DE ESTUDIO"
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

        button5.setBackground(new java.awt.Color(255, 255, 51));
        button5.setBorder(null);
        button5.setForeground(new java.awt.Color(0, 0, 0));
        button5.setText("Guardar");
        button5.setEnabled(false);
        button5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        button6.setBackground(new java.awt.Color(255, 255, 51));
        button6.setBorder(null);
        button6.setForeground(new java.awt.Color(0, 0, 0));
        button6.setText("Eliminar");
        button6.setEnabled(false);
        button6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jCheckBox1.setText("Abilitar Mantenimiento");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        button4.setBackground(new java.awt.Color(255, 255, 51));
        button4.setBorder(null);
        button4.setForeground(new java.awt.Color(0, 0, 0));
        button4.setText("Modificar");
        button4.setEnabled(false);
        button4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        javax.swing.GroupLayout PanelProgramasLayout = new javax.swing.GroupLayout(PanelProgramas);
        PanelProgramas.setLayout(PanelProgramasLayout);
        PanelProgramasLayout.setHorizontalGroup(
            PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProgramasLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PanelProgramasLayout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProgramasLayout.createSequentialGroup()
                        .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(PanelProgramasLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel11))
                            .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombrePrograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                .addComponent(txtcodigoPrograma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(67, 67, 67)
                        .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox1)
                            .addComponent(rSScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43))))
        );
        PanelProgramasLayout.setVerticalGroup(
            PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(87, 87, 87)
                .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rSScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addGroup(PanelProgramasLayout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(jCheckBox1)
                .addGap(36, 36, 36)
                .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProgramasLayout.createSequentialGroup()
                        .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(121, 121, 121))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProgramasLayout.createSequentialGroup()
                        .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(127, 127, 127))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelProgramas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelProgramas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String a=  programa.registrarPrograma();
        System.out.println(a);
    }//GEN-LAST:event_button1ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
    public Vista.Clases.JpanelRound PanelProgramas;
    private componentes.Button button1;
    private componentes.Button button2;
    private componentes.Button button4;
    private componentes.Button button5;
    private componentes.Button button6;
    private rojerusan.RSTableMetro dttabla1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private necesario.RSScrollPane rSScrollPane2;
    private componentes.TextFieldShadown txtNombrePrograma;
    private componentes.TextFieldShadown txtcodigoPrograma;
    // End of variables declaration//GEN-END:variables
}
