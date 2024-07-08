
package Vista;
import Controlador.MetodosUtilidades;

import java.awt.Dimension;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;

public class Frm_R_Estudiante extends javax.swing.JPanel {
    int x1;
   int x2;
   int x3;
    String filePaths = "";
  MetodosUtilidades qr = new MetodosUtilidades(this);
   private Timer timer;
    public Frm_R_Estudiante() {   
        initComponents();
        qr.initTimer(dateChooser1);
//         ScrollPanelPersonalizado customScrollPane = new ScrollPanelPersonalizado(dttabla);
//   rSScrollPane1.setViewportView(customScrollPane);
//    rSScrollPane1.getVerticalScrollBar().setUI(new ModernScrollBarUI());
    dateChooser1.setVisible(false);
    lblclose.setPreferredSize(new Dimension(0, 0));
    lblclose.setVisible(false);
panelRound1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSEstiloTablaHeader1 = new necesario.RSEstiloTablaHeader();
        panel_r_3 = new LIB.JPanelRound();
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
        panelRoundshadow1 = new Vista.Clases.PanelRoundshadow();
        rComboBox2 = new ComboxPerzonalizado.RComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtapeMaterno = new componentes.TextFieldShadown();
        jPanel1 = new javax.swing.JPanel();
        panelRoundshadow2 = new Vista.Clases.PanelRoundshadow();
        lblfechaNacimiento = new javax.swing.JLabel();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        rSLabelImage2 = new rojerusan.RSLabelImage();
        jLabel8 = new javax.swing.JLabel();
        panelRoundshadow3 = new Vista.Clases.PanelRoundshadow();
        lblqr = new javax.swing.JLabel();
        panelfecha = new Vista.Clases.JpanelRound();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        lblclose = new rojerusan.RSLabelImage();
        button1 = new componentes.Button();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(235, 238, 245));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_r_3.setBackground(new java.awt.Color(255, 255, 255));
        panel_r_3.setForeground(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel_r_3.setOpaque(true);
        panel_r_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        panel_r_3.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 10, 10));
        panel_r_3.add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 420, -1));

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel17.setText("Nombres:");
        panel_r_3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));
        panel_r_3.add(txtdniEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 410, -1));
        panel_r_3.add(txtnomEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 410, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paterno:");
        panel_r_3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));
        panel_r_3.add(txtapePaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 410, -1));

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel20.setText("Apellido Materno");
        panel_r_3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        panelRoundshadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow1.setRoundBottomLeft(20);
        panelRoundshadow1.setRoundBottomRight(20);
        panelRoundshadow1.setRoundTopLeft(20);
        panelRoundshadow1.setRoundTopRight(20);
        panelRoundshadow1.setShadowOpacity(15);
        panelRoundshadow1.setShadowSize(3);

        rComboBox2.setBackground(new java.awt.Color(255, 102, 0));
        rComboBox2.setBorder(null);
        rComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        rComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));

        javax.swing.GroupLayout panelRoundshadow1Layout = new javax.swing.GroupLayout(panelRoundshadow1);
        panelRoundshadow1.setLayout(panelRoundshadow1Layout);
        panelRoundshadow1Layout.setHorizontalGroup(
            panelRoundshadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rComboBox2, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow1Layout.setVerticalGroup(
            panelRoundshadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow1Layout.createSequentialGroup()
                .addComponent(rComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        panel_r_3.add(panelRoundshadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 410, 40));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel9.setText("Sexo");
        panel_r_3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, -1, -1));
        panel_r_3.add(txtapeMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 410, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panelRoundshadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow2.setRoundBottomLeft(20);
        panelRoundshadow2.setRoundBottomRight(20);
        panelRoundshadow2.setRoundTopLeft(20);
        panelRoundshadow2.setRoundTopRight(20);
        panelRoundshadow2.setShadowOpacity(15);
        panelRoundshadow2.setShadowSize(3);
        panelRoundshadow2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblfechaNacimiento.setForeground(new java.awt.Color(140, 140, 140));
        lblfechaNacimiento.setText("Selecionar Fecha");
        lblfechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfechaNacimientoMouseClicked(evt);
            }
        });
        panelRoundshadow2.add(lblfechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 270, 40));

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopRight(20);

        rSLabelImage2.setBackground(new java.awt.Color(255, 153, 0));
        rSLabelImage2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelImage2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rSLabelImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        panelRoundshadow2.add(jpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 0, -1, 37));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Fecha");

        panelRoundshadow3.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow3.setRoundBottomLeft(15);
        panelRoundshadow3.setRoundBottomRight(15);
        panelRoundshadow3.setRoundTopLeft(15);
        panelRoundshadow3.setRoundTopRight(15);
        panelRoundshadow3.setShadowOpacity(20);
        panelRoundshadow3.setShadowSize(3);

        lblqr.setBackground(new java.awt.Color(51, 255, 51));

        javax.swing.GroupLayout panelRoundshadow3Layout = new javax.swing.GroupLayout(panelRoundshadow3);
        panelRoundshadow3.setLayout(panelRoundshadow3Layout);
        panelRoundshadow3Layout.setHorizontalGroup(
            panelRoundshadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(lblqr, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelRoundshadow3Layout.setVerticalGroup(
            panelRoundshadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblqr, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

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

        lblclose.setBackground(new java.awt.Color(255, 153, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelfechaLayout = new javax.swing.GroupLayout(panelfecha);
        panelfecha.setLayout(panelfechaLayout);
        panelfechaLayout.setHorizontalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        button1.setText("Registrar");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel10.setText("Generar QR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRoundshadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(panelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(panelRoundshadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(panelRoundshadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_r_3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, 370, 630));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        panel_r_3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel18.setText("DNI:");
        panel_r_3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        add(panel_r_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 880, 640));
    }// </editor-fold>//GEN-END:initComponents

    private void lblfechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfechaNacimientoMouseClicked
      
        qr.LogicaPanel(dateChooser1,264,500 );
    
 lblclose.setPreferredSize(new Dimension(20, 20));
    lblclose.setVisible(true);
    }//GEN-LAST:event_lblfechaNacimientoMouseClicked

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
     
    try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
}
    JFileChooser rutas = new JFileChooser();
    rutas.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    if (rutas.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
        filePaths = rutas.getSelectedFile().getAbsolutePath();
    }
   qr.generarQR(getCodigo(), filePaths);
    
    }//GEN-LAST:event_button1ActionPerformed

    private void dateChooser1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseClicked
  
    }//GEN-LAST:event_dateChooser1MouseClicked

    private void dateChooser1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateChooser1FocusGained
     
    }//GEN-LAST:event_dateChooser1FocusGained

    private void dateChooser1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseMoved
     
    }//GEN-LAST:event_dateChooser1MouseMoved

    private void dateChooser1MouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_dateChooser1MouseWheelMoved
      
    }//GEN-LAST:event_dateChooser1MouseWheelMoved

    private void panelfechaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseMoved
   
    }//GEN-LAST:event_panelfechaMouseMoved

    private void dateChooser1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_dateChooser1ComponentAdded
    
    }//GEN-LAST:event_dateChooser1ComponentAdded

    private void dateChooser1AncestorMoved(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_dateChooser1AncestorMoved
    
    }//GEN-LAST:event_dateChooser1AncestorMoved

    private void dateChooser1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dateChooser1FocusLost
      
  
    }//GEN-LAST:event_dateChooser1FocusLost

    private void dateChooser1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateChooser1MouseExited
     
    
    }//GEN-LAST:event_dateChooser1MouseExited

    private void panelfechaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseExited
   
    }//GEN-LAST:event_panelfechaMouseExited

    private void panelfechaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfechaMouseEntered
      
    }//GEN-LAST:event_panelfechaMouseEntered

    private void lblcloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblcloseMouseClicked
        dateChooser1.setVisible(false);
          lblclose.setPreferredSize(new Dimension(0, 0));
          lblclose.setVisible(false);
    }//GEN-LAST:event_lblcloseMouseClicked

 public String getCodigo() {
    return txtcodigo.getText().trim();
}
 public String getDni(){
return txtdniEstudiante.getText().trim();
}
 public String getNomEstudiante(){
return txtnomEstudiante.getText().trim();
}
 
 public String getapePaterno(){
 return txtapePaterno.getText().trim();
 }
 
 public String getapeMaterno(){
 return txtapeMaterno.getText().trim();
 }
// public String getcbSexo(){
// return cbSexo.getSelectedItem().toString(); 
// }
public JLabel getfechaNacimiento() {
    return lblfechaNacimiento;
}
 public JLabel getLblqr() {
    return lblqr;
}
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private com.raven.datechooser.DateChooser dateChooser1;
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private Vista.Clases.JpanelRound jpanelRound1;
    private rojerusan.RSLabelImage lblclose;
    private javax.swing.JLabel lblfechaNacimiento;
    private javax.swing.JLabel lblqr;
    private Vista.Clases.PanelRound panelRound1;
    private Vista.Clases.PanelRoundshadow panelRoundshadow1;
    private Vista.Clases.PanelRoundshadow panelRoundshadow2;
    private Vista.Clases.PanelRoundshadow panelRoundshadow3;
    private LIB.JPanelRound panel_r_3;
    private Vista.Clases.JpanelRound panelfecha;
    private ComboxPerzonalizado.RComboBox rComboBox2;
    private necesario.RSEstiloTablaHeader rSEstiloTablaHeader1;
    private rojerusan.RSLabelImage rSLabelImage2;
    private necesario.RSScrollPane rSScrollPane1;
    private componentes.TextFieldShadown txtapeMaterno;
    private componentes.TextFieldShadown txtapePaterno;
    private componentes.TextFieldShadown txtcodigo;
    private componentes.TextFieldShadown txtdniEstudiante;
    private componentes.TextFieldShadown txtnomEstudiante;
    // End of variables declaration//GEN-END:variables
}
