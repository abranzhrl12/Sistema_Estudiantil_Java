
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
        ScrollPanelPersonalizado customScrollPane = new ScrollPanelPersonalizado(dttabla);
        rSScrollPane1.setViewportView(customScrollPane);
        rSScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
        tableModel = new DefaultTableModel(new String[]{"Código", "Nombre"}, 0);
        dttabla.setModel(tableModel);
        cargarProgramas();
        
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
        rSScrollPane1 = new necesario.RSScrollPane();
        dttabla = new rojerusan.RSTableMetro();
        button2 = new componentes.Button();
        button1 = new componentes.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelProgramas.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Programa de Estudio:");

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setForeground(new java.awt.Color(255, 102, 102));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane1.setColorBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setOpaque(false);
        rSScrollPane1.setPreferredSize(new java.awt.Dimension(450, 200));
        rSScrollPane1.setRequestFocusEnabled(false);

        dttabla.setBackground(new java.awt.Color(204, 204, 204));
        dttabla.setForeground(new java.awt.Color(255, 255, 255));
        dttabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        dttabla.setPreferredScrollableViewportSize(new java.awt.Dimension(450, 300));
        dttabla.setRowHeight(39);
        dttabla.setRowMargin(2);
        dttabla.setRowSelectionAllowed(false);
        dttabla.setSelectionForeground(new java.awt.Color(153, 153, 153));
        dttabla.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        dttabla.setShowGrid(false);
        rSScrollPane1.setViewportView(dttabla);

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

        javax.swing.GroupLayout PanelProgramasLayout = new javax.swing.GroupLayout(PanelProgramas);
        PanelProgramas.setLayout(PanelProgramasLayout);
        PanelProgramasLayout.setHorizontalGroup(
            PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelProgramasLayout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelProgramasLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(txtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcodigoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProgramasLayout.setVerticalGroup(
            PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProgramasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtcodigoPrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtNombrePrograma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(rSScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(PanelProgramasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89))
        );

        getContentPane().add(PanelProgramas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String a=  programa.registrarPrograma();
        System.out.println(a);
    }//GEN-LAST:event_button1ActionPerformed

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
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private necesario.RSScrollPane rSScrollPane1;
    private componentes.TextFieldShadown txtNombrePrograma;
    private componentes.TextFieldShadown txtcodigoPrograma;
    // End of variables declaration//GEN-END:variables
}
