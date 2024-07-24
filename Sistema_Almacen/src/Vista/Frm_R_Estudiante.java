
package Vista;

import Controlador.ControladorEstudiante;
import Controlador.MetodosUtilidades;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.Timer;
import javax.swing.UIManager;


/**
 *
 * @author Abraham
 */
public class Frm_R_Estudiante extends javax.swing.JFrame{
    String filePaths = "C:\\rutasqr";
    ControladorEstudiante cEstudiante=new ControladorEstudiante(this);
    
MetodosUtilidades qr = new MetodosUtilidades(this);
   private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Timer timer;
    public Frm_R_Estudiante() {
        initComponents();
        qr.initTimer(dateChooser1);
        qr.ocultarComponentes(dateChooser1,lblclose,panelRound1);

    lblclose.setPreferredSize(new Dimension(0, 0));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        cbsexo = new ComboxPerzonalizado.RComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtapeMaterno = new componentes.TextFieldShadown();
        jPanel1 = new javax.swing.JPanel();
        panelRoundshadow2 = new Vista.Clases.PanelRoundshadow();
        lblfechaNacimiento = new javax.swing.JLabel();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelRoundshadow3 = new Vista.Clases.PanelRoundshadow();
        lblqr = new javax.swing.JLabel();
        panelfecha = new Vista.Clases.JpanelRound();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        lblclose = new rojerusan.RSLabelImage();
        jLabel10 = new javax.swing.JLabel();
        button1 = new componentes.Button();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        button2 = new componentes.Button();
        jLabel21 = new javax.swing.JLabel();
        panelRoundshadow4 = new Vista.Clases.PanelRoundshadow();
        cbSemestres = new ComboxPerzonalizado.RComboBox();
        jLabel13 = new javax.swing.JLabel();
        panelRoundshadow6 = new Vista.Clases.PanelRoundshadow();
        cbprograma = new ComboxPerzonalizado.RComboBox();
        jLabel12 = new javax.swing.JLabel();
        panelRoundshadow5 = new Vista.Clases.PanelRoundshadow();
        cbturno = new ComboxPerzonalizado.RComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        panel_r_3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));
        panel_r_3.add(txtdniEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 420, -1));
        panel_r_3.add(txtnomEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 410, -1));

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paterno:");
        panel_r_3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));
        panel_r_3.add(txtapePaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 410, -1));

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel20.setText("Semestre");
        panel_r_3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        panelRoundshadow1.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow1.setRoundBottomLeft(20);
        panelRoundshadow1.setRoundBottomRight(20);
        panelRoundshadow1.setRoundTopLeft(20);
        panelRoundshadow1.setRoundTopRight(20);
        panelRoundshadow1.setShadowOpacity(15);
        panelRoundshadow1.setShadowSize(3);

        cbsexo.setBorder(null);
        cbsexo.setForeground(new java.awt.Color(51, 51, 51));
        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2" }));

        javax.swing.GroupLayout panelRoundshadow1Layout = new javax.swing.GroupLayout(panelRoundshadow1);
        panelRoundshadow1.setLayout(panelRoundshadow1Layout);
        panelRoundshadow1Layout.setHorizontalGroup(
            panelRoundshadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbsexo, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow1Layout.setVerticalGroup(
            panelRoundshadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow1Layout.createSequentialGroup()
                .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        panel_r_3.add(panelRoundshadow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 410, 40));

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel9.setText("Programa Estudio");
        panel_r_3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));
        panel_r_3.add(txtapeMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 410, -1));

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
        panelRoundshadow2.add(lblfechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 260, 40));

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound1.setRoundBottomRight(20);
        jpanelRound1.setRoundTopRight(20);

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        panelRoundshadow2.add(jpanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 0, -1, 37));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Fecha ");

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
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-calendar-27.png"))); // NOI18N
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
                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel10.setText("Generar QR");

        button1.setBackground(new java.awt.Color(255, 255, 51));
        button1.setBorder(null);
        button1.setForeground(new java.awt.Color(0, 0, 0));
        button1.setText("Generar QR");
        button1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelRoundshadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(panelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelRoundshadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel8)))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel_r_3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 350, 630));

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");
        panel_r_3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel18.setText("DNI:");
        panel_r_3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

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
        panel_r_3.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 640, 240, 50));

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel21.setText("Apellido Materno");
        panel_r_3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        panelRoundshadow4.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow4.setRoundBottomLeft(20);
        panelRoundshadow4.setRoundBottomRight(20);
        panelRoundshadow4.setRoundTopLeft(20);
        panelRoundshadow4.setRoundTopRight(20);
        panelRoundshadow4.setShadowOpacity(15);
        panelRoundshadow4.setShadowSize(3);

        cbSemestres.setBorder(null);
        cbSemestres.setForeground(new java.awt.Color(51, 51, 51));
        cbSemestres.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "I", "II", "III", "IV", "V", "VI" }));

        javax.swing.GroupLayout panelRoundshadow4Layout = new javax.swing.GroupLayout(panelRoundshadow4);
        panelRoundshadow4.setLayout(panelRoundshadow4Layout);
        panelRoundshadow4Layout.setHorizontalGroup(
            panelRoundshadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbSemestres, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow4Layout.setVerticalGroup(
            panelRoundshadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow4Layout.createSequentialGroup()
                .addComponent(cbSemestres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        panel_r_3.add(panelRoundshadow4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel13.setText("Sexo");
        panel_r_3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, -1, -1));

        panelRoundshadow6.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow6.setRoundBottomLeft(20);
        panelRoundshadow6.setRoundBottomRight(20);
        panelRoundshadow6.setRoundTopLeft(20);
        panelRoundshadow6.setRoundTopRight(20);
        panelRoundshadow6.setShadowOpacity(15);
        panelRoundshadow6.setShadowSize(3);

        cbprograma.setBorder(null);
        cbprograma.setForeground(new java.awt.Color(51, 51, 51));
        cbprograma.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "P001", "P002", "P003", "P004", "P005", "P006", "P007", "P008" }));
        cbprograma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbprogramaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelRoundshadow6Layout = new javax.swing.GroupLayout(panelRoundshadow6);
        panelRoundshadow6.setLayout(panelRoundshadow6Layout);
        panelRoundshadow6Layout.setHorizontalGroup(
            panelRoundshadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbprograma, javax.swing.GroupLayout.DEFAULT_SIZE, 398, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow6Layout.setVerticalGroup(
            panelRoundshadow6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow6Layout.createSequentialGroup()
                .addComponent(cbprograma, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        panel_r_3.add(panelRoundshadow6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Turno");
        panel_r_3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        panelRoundshadow5.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow5.setRoundBottomLeft(20);
        panelRoundshadow5.setRoundBottomRight(20);
        panelRoundshadow5.setRoundTopLeft(20);
        panelRoundshadow5.setRoundTopRight(20);
        panelRoundshadow5.setShadowOpacity(15);
        panelRoundshadow5.setShadowSize(3);

        cbturno.setBorder(null);
        cbturno.setForeground(new java.awt.Color(51, 51, 51));
        cbturno.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "T001", "T002", "T003", " " }));

        javax.swing.GroupLayout panelRoundshadow5Layout = new javax.swing.GroupLayout(panelRoundshadow5);
        panelRoundshadow5.setLayout(panelRoundshadow5Layout);
        panelRoundshadow5Layout.setHorizontalGroup(
            panelRoundshadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbturno, javax.swing.GroupLayout.DEFAULT_SIZE, 298, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow5Layout.setVerticalGroup(
            panelRoundshadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow5Layout.createSequentialGroup()
                .addComponent(cbturno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        panel_r_3.add(panelRoundshadow5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_r_3, javax.swing.GroupLayout.DEFAULT_SIZE, 923, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_r_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblfechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfechaNacimientoMouseClicked
        qr.LogicaPanel(dateChooser1,264,500 );
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

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        //        JFileChooser rutas = new JFileChooser();
        //        rutas.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        //        if (rutas.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            //            filePaths = rutas.getSelectedFile().getAbsolutePath();
            //        }
        qr.generarQR(getCodigo(), filePaths);

    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }       
        String a=  cEstudiante.registrarEstudiante();
        System.out.println(a);        
    }//GEN-LAST:event_button2ActionPerformed

    private void cbprogramaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbprogramaMouseClicked

    }//GEN-LAST:event_cbprogramaMouseClicked

   

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
 
  public String getFecha_Nacimiento() {
        // Asegúrate de que la fecha esté en el formato correcto
        String fechaTexto = lblfechaNacimiento.getText();
        try {
            Date fecha = dateFormat.parse(fechaTexto);
            return dateFormat.format(fecha);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

 public JLabel getLblqr() {
    return lblqr;
}
 
 public String getRuta(){
 return filePaths+ "\\" + getCodigo() + ".png";
 }
 
public String getSemestre(){
return cbSemestres.getSelectedItem().toString();
}
 public String getSexo(){
 return cbsexo.getSelectedItem().toString();
 }
 public String getPrograma(){
 return cbprograma.getSelectedItem().toString().trim();
 }
 
 public String getTurno(){
 return cbturno.getSelectedItem().toString();
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
            java.util.logging.Logger.getLogger(Frm_R_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_R_Estudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_R_Estudiante().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private componentes.Button button1;
    private componentes.Button button2;
    private ComboxPerzonalizado.RComboBox cbSemestres;
    private ComboxPerzonalizado.RComboBox cbprograma;
    private ComboxPerzonalizado.RComboBox cbsexo;
    private ComboxPerzonalizado.RComboBox cbturno;
    private com.raven.datechooser.DateChooser dateChooser1;
    private rojerusan.RSTableMetro dttabla;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private Vista.Clases.PanelRoundshadow panelRoundshadow4;
    private Vista.Clases.PanelRoundshadow panelRoundshadow5;
    private Vista.Clases.PanelRoundshadow panelRoundshadow6;
    public LIB.JPanelRound panel_r_3;
    private Vista.Clases.JpanelRound panelfecha;
    private necesario.RSScrollPane rSScrollPane1;
    private componentes.TextFieldShadown txtapeMaterno;
    private componentes.TextFieldShadown txtapePaterno;
    private componentes.TextFieldShadown txtcodigo;
    private componentes.TextFieldShadown txtdniEstudiante;
    private componentes.TextFieldShadown txtnomEstudiante;
    // End of variables declaration//GEN-END:variables
}
