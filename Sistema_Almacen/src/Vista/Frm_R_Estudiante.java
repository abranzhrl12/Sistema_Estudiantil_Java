
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

    lblclose.setPreferredSize(new Dimension(20, 20));
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
        button1 = new componentes.Button();
        jLabel10 = new javax.swing.JLabel();
        panelRoundshadow3 = new Vista.Clases.PanelRoundshadow();
        lblqr = new javax.swing.JLabel();
        panelfecha = new Vista.Clases.JpanelRound();
        lblclose = new rojerusan.RSLabelImage();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        panelRoundshadow2 = new Vista.Clases.PanelRoundshadow();
        lblfechaNacimiento = new javax.swing.JLabel();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        jLabel8 = new javax.swing.JLabel();
        panelRoundshadow5 = new Vista.Clases.PanelRoundshadow();
        cbturno = new ComboxPerzonalizado.RComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        button2 = new componentes.Button();
        jLabel21 = new javax.swing.JLabel();
        panelRoundshadow4 = new Vista.Clases.PanelRoundshadow();
        cbSemestres = new ComboxPerzonalizado.RComboBox();
        jLabel13 = new javax.swing.JLabel();
        panelRoundshadow6 = new Vista.Clases.PanelRoundshadow();
        cbprograma = new ComboxPerzonalizado.RComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_r_3.setBackground(new java.awt.Color(255, 255, 255));
        panel_r_3.setForeground(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorPrimario(new java.awt.Color(255, 255, 255));
        panel_r_3.setColorSecundario(new java.awt.Color(255, 255, 255));
        panel_r_3.setOpaque(true);

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

        jLabel17.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel17.setText("Nombres:");

        txtdniEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdniEstudianteActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel19.setText("Apellido Paterno:");

        jLabel20.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel20.setText("Semestre");

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
                .addComponent(cbsexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow1Layout.setVerticalGroup(
            panelRoundshadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow1Layout.createSequentialGroup()
                .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel9.setText("Programa Estudio");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel10.setText("Generar QR");

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblqr, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelRoundshadow3Layout.setVerticalGroup(
            panelRoundshadow3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRoundshadow3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblqr, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

        lblclose.setBackground(new java.awt.Color(255, 153, 0));
        lblclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-calendar-27.png"))); // NOI18N
        lblclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblcloseMouseClicked(evt);
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

        javax.swing.GroupLayout panelfechaLayout = new javax.swing.GroupLayout(panelfecha);
        panelfecha.setLayout(panelfechaLayout);
        panelfechaLayout.setHorizontalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelfechaLayout.setVerticalGroup(
            panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfechaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelfechaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, Short.MAX_VALUE)
                    .addGroup(panelfechaLayout.createSequentialGroup()
                        .addComponent(lblclose, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        panelRoundshadow2.setBackground(new java.awt.Color(255, 255, 255));
        panelRoundshadow2.setRoundBottomLeft(20);
        panelRoundshadow2.setRoundBottomRight(20);
        panelRoundshadow2.setRoundTopLeft(20);
        panelRoundshadow2.setRoundTopRight(20);
        panelRoundshadow2.setShadowOpacity(15);
        panelRoundshadow2.setShadowSize(3);

        lblfechaNacimiento.setText("Selecionar Fecha");
        lblfechaNacimiento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblfechaNacimientoMouseClicked(evt);
            }
        });

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
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelRoundshadow2Layout = new javax.swing.GroupLayout(panelRoundshadow2);
        panelRoundshadow2.setLayout(panelRoundshadow2Layout);
        panelRoundshadow2Layout.setHorizontalGroup(
            panelRoundshadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow2Layout.createSequentialGroup()
                .addGap(290, 290, 290)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelRoundshadow2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblfechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        panelRoundshadow2Layout.setVerticalGroup(
            panelRoundshadow2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(lblfechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel8.setText("Fecha ");

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
                .addComponent(cbturno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow5Layout.setVerticalGroup(
            panelRoundshadow5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow5Layout.createSequentialGroup()
                .addComponent(cbturno, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel12.setText("Turno");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRoundshadow2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelRoundshadow5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10)
                            .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelRoundshadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(panelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel11.setText("Codigo:");

        jLabel18.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel18.setText("DNI:");

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

        jLabel21.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel21.setText("Apellido Materno");

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
                .addComponent(cbSemestres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelRoundshadow4Layout.setVerticalGroup(
            panelRoundshadow4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRoundshadow4Layout.createSequentialGroup()
                .addComponent(cbSemestres, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 1, 14)); // NOI18N
        jLabel13.setText("Sexo");

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

        javax.swing.GroupLayout panel_r_3Layout = new javax.swing.GroupLayout(panel_r_3);
        panel_r_3.setLayout(panel_r_3Layout);
        panel_r_3Layout.setHorizontalGroup(
            panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_r_3Layout.createSequentialGroup()
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel18)
                                .addComponent(jLabel17)
                                .addComponent(jLabel19)
                                .addComponent(jLabel21)
                                .addComponent(jLabel20)
                                .addComponent(jLabel13)
                                .addComponent(jLabel9)
                                .addComponent(panelRoundshadow6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRoundshadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(panelRoundshadow4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtdniEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtnomEstudiante, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtapePaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtapeMaterno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtcodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel11)))
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(87, 87, 87))
        );
        panel_r_3Layout.setVerticalGroup(
            panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_r_3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(33, 33, 33))
            .addGroup(panel_r_3Layout.createSequentialGroup()
                .addGroup(panel_r_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_r_3Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel11)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addGap(1, 1, 1)
                .addComponent(txtdniEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnomEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapePaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtapeMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel20)
                .addGap(1, 1, 1)
                .addComponent(panelRoundshadow4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRoundshadow6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_r_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_r_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblfechaNacimientoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblfechaNacimientoMouseClicked
        qr.LogicaPanel(dateChooser1,264,208 );
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

    private void txtdniEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdniEstudianteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdniEstudianteActionPerformed

   

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
