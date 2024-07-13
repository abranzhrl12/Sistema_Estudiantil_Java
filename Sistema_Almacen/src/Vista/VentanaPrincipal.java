
package Vista;

import FiveCodMover.FiveCodMoverJFrame;
import Vista.Frm_R_Estudiante;
import Vista.ReadQrcode;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.JComponent;
import javax.swing.JPanel;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

/**
 *
 * @author Abraham
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    Vista.Clases.SimpleTitleBar barra2 = new Vista.Clases.SimpleTitleBar();
    Controlador.MetodosUtilidades metodos = new Controlador.MetodosUtilidades(this);
    int ancho = 244;
    private Animator animator;

    public VentanaPrincipal() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        this.setLocationRelativeTo(null);
        inicializarMouseListeners();
        
        //Configurar dimenciones 
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int minHeight = (int) (0.9 * screenHeight);
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int minWidth = (int) (0.8 * screenWidth);
        
        setSize(new Dimension(minWidth,minHeight));
        
        
        barra2.init(this);
        
        collapseAllPanels();
    }


    private void inicializarMouseListeners() {
        
          metodos.configurarMouseListener(btnRegistrarEstudiante, () -> {
            
            metodos.actualizarPanel(PanelPrincipal,new Frm_R_Estudiante().panel_r_3);
        }, Arrays.asList(new JComponent[]{ dsp_estudiantes}));

        metodos.configurarMouseListener(btnLectorQR, () -> {
            ReadQrcode readQR = new ReadQrcode();
            metodos.actualizarPanel(PanelPrincipal, readQR.lectorQRPanel);
        }, Arrays.asList(new JComponent[]{ /* Agregar aquí los componentes a ignorar */ }));
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        contenedorLeftmenu = new javax.swing.JPanel();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        btnInicio = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnLectorQR = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        btnRegistrarEstudiante = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        dsp_estudiantes = new javax.swing.JLabel();
        pRegistrarEstudiante = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        pAdministrarInformacion = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblProgramaEstudio = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnRegistrarEstudiante1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        dsp_Veiculos = new javax.swing.JLabel();
        btnRegistrarEstudiante10 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        dsp_Reportes = new javax.swing.JLabel();
        btnRegistrarEstudiante11 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        dsp_adm_informacion = new javax.swing.JLabel();
        pReportes = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        pRegistrarVeiculos = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new Vista.Clases.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        contendorRigt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        contenedorLeftmenu.setBackground(new java.awt.Color(153, 255, 153));

        jpanelRound1.setBackground(new java.awt.Color(204, 255, 255));
        jpanelRound1.setRoundBottomLeft(15);
        jpanelRound1.setRoundTopLeft(15);

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/home-32_1.png"))); // NOI18N
        jLabel13.setText("Inicio");

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        btnLectorQR.setBackground(new java.awt.Color(255, 255, 255));
        btnLectorQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLectorQRMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/icons8-scan-32.png"))); // NOI18N
        jLabel5.setText("Lector QR");

        javax.swing.GroupLayout btnLectorQRLayout = new javax.swing.GroupLayout(btnLectorQR);
        btnLectorQR.setLayout(btnLectorQRLayout);
        btnLectorQRLayout.setHorizontalGroup(
            btnLectorQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLectorQRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLectorQRLayout.setVerticalGroup(
            btnLectorQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLectorQRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        btnRegistrarEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudianteMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/user-32.png"))); // NOI18N
        jLabel4.setText("Estudiantes");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        dsp_estudiantes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dsp_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        dsp_estudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsp_estudiantesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarEstudianteLayout = new javax.swing.GroupLayout(btnRegistrarEstudiante);
        btnRegistrarEstudiante.setLayout(btnRegistrarEstudianteLayout);
        btnRegistrarEstudianteLayout.setHorizontalGroup(
            btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsp_estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnRegistrarEstudianteLayout.setVerticalGroup(
            btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dsp_estudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pRegistrarEstudiante.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel14.setText("Agregar Estudiante");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel15.setText("Generar Fotocheck");

        javax.swing.GroupLayout pRegistrarEstudianteLayout = new javax.swing.GroupLayout(pRegistrarEstudiante);
        pRegistrarEstudiante.setLayout(pRegistrarEstudianteLayout);
        pRegistrarEstudianteLayout.setHorizontalGroup(
            pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );
        pRegistrarEstudianteLayout.setVerticalGroup(
            pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pAdministrarInformacion.setBackground(new java.awt.Color(255, 255, 255));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel26.setText("Estudiantes");

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel27.setText("Veiculos");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel29.setText("Tipo de Veiculos");

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel30.setText("Tipo Empleados");

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel31.setText("Empleados");

        lblProgramaEstudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblProgramaEstudio.setText("Programas de Estudio");
        lblProgramaEstudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblProgramaEstudioMouseClicked(evt);
            }
        });

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel33.setText("Turnos");

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel34.setText("Veiculos");

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel35.setText("Registros de Parqueo");

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel36.setText("Registros de Ingresos");

        javax.swing.GroupLayout pAdministrarInformacionLayout = new javax.swing.GroupLayout(pAdministrarInformacion);
        pAdministrarInformacion.setLayout(pAdministrarInformacionLayout);
        pAdministrarInformacionLayout.setHorizontalGroup(
            pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblProgramaEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel35, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pAdministrarInformacionLayout.setVerticalGroup(
            pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProgramaEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegistrarEstudiante1.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudiante1MouseClicked(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/auto-32.png"))); // NOI18N
        jLabel6.setText("Veiculos");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        dsp_Veiculos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dsp_Veiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        dsp_Veiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsp_VeiculosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarEstudiante1Layout = new javax.swing.GroupLayout(btnRegistrarEstudiante1);
        btnRegistrarEstudiante1.setLayout(btnRegistrarEstudiante1Layout);
        btnRegistrarEstudiante1Layout.setHorizontalGroup(
            btnRegistrarEstudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudiante1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsp_Veiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegistrarEstudiante1Layout.setVerticalGroup(
            btnRegistrarEstudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarEstudiante1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarEstudiante1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dsp_Veiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRegistrarEstudiante10.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudiante10MouseClicked(evt);
            }
        });

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/auto-32.png"))); // NOI18N
        jLabel20.setText(" Reportes");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });

        dsp_Reportes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dsp_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        dsp_Reportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsp_ReportesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarEstudiante10Layout = new javax.swing.GroupLayout(btnRegistrarEstudiante10);
        btnRegistrarEstudiante10.setLayout(btnRegistrarEstudiante10Layout);
        btnRegistrarEstudiante10Layout.setHorizontalGroup(
            btnRegistrarEstudiante10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudiante10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsp_Reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegistrarEstudiante10Layout.setVerticalGroup(
            btnRegistrarEstudiante10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarEstudiante10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarEstudiante10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dsp_Reportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRegistrarEstudiante11.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudiante11MouseClicked(evt);
            }
        });

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/data-protection-24.png"))); // NOI18N
        jLabel44.setText("Administrar Informacion");
        jLabel44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel44MouseClicked(evt);
            }
        });

        dsp_adm_informacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dsp_adm_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        dsp_adm_informacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dsp_adm_informacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarEstudiante11Layout = new javax.swing.GroupLayout(btnRegistrarEstudiante11);
        btnRegistrarEstudiante11.setLayout(btnRegistrarEstudiante11Layout);
        btnRegistrarEstudiante11Layout.setHorizontalGroup(
            btnRegistrarEstudiante11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudiante11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dsp_adm_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegistrarEstudiante11Layout.setVerticalGroup(
            btnRegistrarEstudiante11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarEstudiante11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarEstudiante11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dsp_adm_informacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        pReportes.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel23.setText("Reportes de Parqueo");

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel24.setText("Reportes de Ingresos");

        javax.swing.GroupLayout pReportesLayout = new javax.swing.GroupLayout(pReportes);
        pReportes.setLayout(pReportesLayout);
        pReportesLayout.setHorizontalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pReportesLayout.setVerticalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrarVeiculos.setBackground(new java.awt.Color(255, 255, 255));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel18.setText("Agregar Veículo");

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        jLabel21.setText("Registrar Tipo de Veiculo");

        javax.swing.GroupLayout pRegistrarVeiculosLayout = new javax.swing.GroupLayout(pRegistrarVeiculos);
        pRegistrarVeiculos.setLayout(pRegistrarVeiculosLayout);
        pRegistrarVeiculosLayout.setHorizontalGroup(
            pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistrarVeiculosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRegistrarVeiculosLayout.setVerticalGroup(
            pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pRegistrarVeiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(pReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLectorQR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEstudiante10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarEstudiante11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pAdministrarInformacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pRegistrarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnRegistrarEstudiante1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLectorQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEstudiante1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRegistrarVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEstudiante10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEstudiante11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAdministrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/Scan.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        btnSalir.setBackground(new java.awt.Color(2, 29, 48));
        btnSalir.setRoundBottomRight(30);
        btnSalir.setRoundTopRight(30);
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/white-logout-32.png"))); // NOI18N
        jLabel2.setText("Cerrar secion");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contenedorLeftmenuLayout = new javax.swing.GroupLayout(contenedorLeftmenu);
        contenedorLeftmenu.setLayout(contenedorLeftmenuLayout);
        contenedorLeftmenuLayout.setHorizontalGroup(
            contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLeftmenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jpanelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        contenedorLeftmenuLayout.setVerticalGroup(
            contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLeftmenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        jPanel1.add(contenedorLeftmenu);

        contendorRigt.setLayout(new javax.swing.BoxLayout(contendorRigt, javax.swing.BoxLayout.Y_AXIS));

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 60));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 60));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1237, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        contendorRigt.add(jPanel2);

        PanelPrincipal.setBackground(new java.awt.Color(204, 102, 0));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1143, Short.MAX_VALUE)
        );

        contendorRigt.add(PanelPrincipal);

        jPanel1.add(contendorRigt);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseClicked
     
    }//GEN-LAST:event_btnInicioMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void btnRegistrarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteMouseClicked

    }//GEN-LAST:event_btnRegistrarEstudianteMouseClicked

    private void btnLectorQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLectorQRMouseClicked
     
    }//GEN-LAST:event_btnLectorQRMouseClicked

    private void dsp_estudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsp_estudiantesMouseClicked
        metodos.LogicaPanel(pRegistrarEstudiante, ancho, 80);

        
        boolean isVisible = pRegistrarEstudiante.isVisible();
        if (!isVisible) {
            collapseAllPanels();
        }
         if (isVisible) {
             dsp_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
            
        } else{
             dsp_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        
        pRegistrarEstudiante.setVisible(!isVisible);
        
    }//GEN-LAST:event_dsp_estudiantesMouseClicked

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
    FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        int currentY = evt.getY();

        int frameX = this.getLocation().x;
        int frameY = this.getLocation().y;
        //top
        int distanceY = this.getY();
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
       int initialY = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void dsp_VeiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsp_VeiculosMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pRegistrarVeiculos, ancho, 84);
        boolean isVisible = pRegistrarVeiculos.isVisible();
        if (!isVisible) {
            collapseAllPanels(); // Añade todos los paneles que deseas colapsar
        }
        
        if (isVisible) {
             dsp_Veiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
            
        } else{
             dsp_Veiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        pRegistrarVeiculos.setVisible(!isVisible);

    }//GEN-LAST:event_dsp_VeiculosMouseClicked

    private void btnRegistrarEstudiante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudiante1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEstudiante1MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void dsp_ReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsp_ReportesMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pReportes, ancho, 82);
           boolean isVisible = pReportes.isVisible();
           
        if (!isVisible) {
            collapseAllPanels();
            
        }
         if (isVisible) {
             dsp_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
            
        } else{
             dsp_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        pReportes.setVisible(!isVisible);
        
        
    }//GEN-LAST:event_dsp_ReportesMouseClicked

    private void btnRegistrarEstudiante10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudiante10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEstudiante10MouseClicked

    private void jLabel44MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel44MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel44MouseClicked

    private void dsp_adm_informacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dsp_adm_informacionMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pAdministrarInformacion, ancho, 386);
        boolean isVisible = pAdministrarInformacion.isVisible();
        if (!isVisible) {
            collapseAllPanels();
        }
        
         if (isVisible) {
             dsp_adm_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
            
        } else{
             dsp_adm_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        
        pAdministrarInformacion.setVisible(!isVisible);
        
        
    }//GEN-LAST:event_dsp_adm_informacionMouseClicked

    private void btnRegistrarEstudiante11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudiante11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarEstudiante11MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalir.setBackground(new Color(4, 83, 138));

    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:

        btnSalir.setCursor(Cursor.getDefaultCursor());
        btnSalir.setBackground(new Color(2, 29, 48));
    }//GEN-LAST:event_btnSalirMouseExited

    private void lblProgramaEstudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblProgramaEstudioMouseClicked
        // TODO add your handling code here:
        
        metodos.actualizarPanel(PanelPrincipal, new Frm_R_Prog_Estudio().panelProgramaEstudio);
        
    }//GEN-LAST:event_lblProgramaEstudioMouseClicked

    private void collapseAllPanels() {
        metodos.ocultarComponentes(pRegistrarEstudiante,pRegistrarVeiculos,pReportes,pAdministrarInformacion);
        dsp_adm_informacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        dsp_Reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        dsp_Veiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        dsp_estudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
    
 
}
    
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLectorQR;
    private javax.swing.JPanel btnRegistrarEstudiante;
    private javax.swing.JPanel btnRegistrarEstudiante1;
    private javax.swing.JPanel btnRegistrarEstudiante10;
    private javax.swing.JPanel btnRegistrarEstudiante11;
    private Vista.Clases.JpanelRound btnSalir;
    private javax.swing.JPanel contendorRigt;
    private javax.swing.JPanel contenedorLeftmenu;
    private javax.swing.JLabel dsp_Reportes;
    private javax.swing.JLabel dsp_Veiculos;
    private javax.swing.JLabel dsp_adm_informacion;
    private javax.swing.JLabel dsp_estudiantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private Vista.Clases.JpanelRound jpanelRound1;
    private javax.swing.JLabel lblProgramaEstudio;
    private javax.swing.JPanel pAdministrarInformacion;
    private javax.swing.JPanel pRegistrarEstudiante;
    private javax.swing.JPanel pRegistrarVeiculos;
    private javax.swing.JPanel pReportes;
    // End of variables declaration//GEN-END:variables
}
