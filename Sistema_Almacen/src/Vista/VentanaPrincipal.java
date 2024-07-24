
package Vista;
import FiveCodMover.FiveCodMoverJFrame;
import Vista.Clases.MenuScrollBar;
import Vista.Clases.ModernScrollBarUI;
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
public class VentanaPrincipal extends javax.swing.JFrame {
    Vista.Clases.SimpleTitleBar barra2 = new Vista.Clases.SimpleTitleBar();
    Controlador.MetodosUtilidades metodos = new Controlador.MetodosUtilidades(this);
    int ancho = 244;
    private Animator animator;
    public VentanaPrincipal() {
        initComponents();
        
        jScrollPane1.getVerticalScrollBar().setUI(new MenuScrollBar());
        jScrollPane1.setBackground(new Color(0,0,0,0));
       
        this.setLocationRelativeTo(null);
        inicializarMouseListeners(); 
         close.setBackground(new Color(0,0,0,0));
          minimize.setBackground(new Color(255,255,255));
           maximize.setBackground(new Color(255,255,255));
           
        //Configurar dimenciones 
//        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
//        int minHeight = (int) (0.9 * screenHeight);
//        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
//        int minWidth = (int) (0.8 * screenWidth);
//        setSize(new Dimension(minWidth,minHeight));

        barra2.init(this);   
        collapseAllPanels();
    }
    private void inicializarMouseListeners() {  
        
        metodos.configurarMouseListener(btnRegistrarEstudiante, () -> {
            metodos.actualizarPanel(PanelPrincipal, new Frm_R_Estudiante().panel_r_3);
        }, Arrays.asList(new JComponent[]{lblEstudianteIC}));

        metodos.configurarMouseListener(btnLectorQR, () -> {
            
        }, Arrays.asList(new JComponent[]{lblLector}));


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
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new Vista.Clases.JpanelRound();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        btnInicio = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        btnLectorQR = new javax.swing.JPanel();
        lblLector = new javax.swing.JLabel();
        btnRegistrarEstudiante = new javax.swing.JPanel();
        lblEstudiantes = new javax.swing.JLabel();
        lblEstudianteIC = new javax.swing.JLabel();
        pRegistrarEstudiante = new javax.swing.JPanel();
        lbl_Agregar_Estudiante = new javax.swing.JLabel();
        lbl_Generar_Fotocheck = new javax.swing.JLabel();
        pAdministrarInformacion = new javax.swing.JPanel();
        lblAdm_Estudiante = new javax.swing.JLabel();
        lblAdm_Veiculos = new javax.swing.JLabel();
        lblAdm_tipoVeicuo = new javax.swing.JLabel();
        lblAdm_tipoEmpleado = new javax.swing.JLabel();
        lblAdm_Empleados = new javax.swing.JLabel();
        lblAdm_ProgramaEstudio = new javax.swing.JLabel();
        lblAdm_Turnos = new javax.swing.JLabel();
        lblAdm_R_parqueo = new javax.swing.JLabel();
        lblAdm_R_ingresos = new javax.swing.JLabel();
        lblDatosDeContacto = new javax.swing.JLabel();
        btnRegistrarVeiculo = new javax.swing.JPanel();
        lblVeiculo = new javax.swing.JLabel();
        lblVeiculoIC = new javax.swing.JLabel();
        btnRegistrarReportes = new javax.swing.JPanel();
        lblReportes = new javax.swing.JLabel();
        lblReportesIC = new javax.swing.JLabel();
        btnAdministrarInformacion = new javax.swing.JPanel();
        lblAdministracion = new javax.swing.JLabel();
        lblAdministracionIC = new javax.swing.JLabel();
        pReportes = new javax.swing.JPanel();
        lbl_reporte_parqueo = new javax.swing.JLabel();
        lbl_reporte_ingreso = new javax.swing.JLabel();
        pRegistrarVeiculos = new javax.swing.JPanel();
        lbl_agregar_veiculo = new javax.swing.JLabel();
        lbl_agregar_Tipo_veiculo = new javax.swing.JLabel();
        contendorRigt = new javax.swing.JPanel();
        panelMover = new javax.swing.JPanel();
        minimize = new javax.swing.JLabel();
        maximize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        contenedorLeftmenu.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesLogin/Scan.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(31, 31, 31))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalirLayout = new javax.swing.GroupLayout(btnSalir);
        btnSalir.setLayout(btnSalirLayout);
        btnSalirLayout.setHorizontalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        btnSalirLayout.setVerticalGroup(
            btnSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalirLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jScrollPane1.setBackground(new java.awt.Color(51, 255, 51));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setAutoscrolls(true);

        jpanelRound1.setBackground(new java.awt.Color(255, 255, 255));

        btnInicio.setBackground(new java.awt.Color(255, 255, 255));
        btnInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnInicioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnInicioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnInicioMouseExited(evt);
            }
        });

        lblInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/home-32_1.png"))); // NOI18N
        lblInicio.setText("Inicio");
        lblInicio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout btnInicioLayout = new javax.swing.GroupLayout(btnInicio);
        btnInicio.setLayout(btnInicioLayout);
        btnInicioLayout.setHorizontalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnInicioLayout.setVerticalGroup(
            btnInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnInicioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInicio)
                .addContainerGap())
        );

        btnLectorQR.setBackground(new java.awt.Color(255, 255, 255));
        btnLectorQR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLectorQRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLectorQRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLectorQRMouseExited(evt);
            }
        });

        lblLector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/icons8-scan-32.png"))); // NOI18N
        lblLector.setText("Lector QR");
        lblLector.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblLector.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLectorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLectorMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnLectorQRLayout = new javax.swing.GroupLayout(btnLectorQR);
        btnLectorQR.setLayout(btnLectorQRLayout);
        btnLectorQRLayout.setHorizontalGroup(
            btnLectorQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnLectorQRLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLector, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnLectorQRLayout.setVerticalGroup(
            btnLectorQRLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnLectorQRLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblLector)
                .addContainerGap())
        );

        btnRegistrarEstudiante.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudianteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarEstudianteMouseExited(evt);
            }
        });

        lblEstudiantes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/user-32.png"))); // NOI18N
        lblEstudiantes.setText("Estudiantes");
        lblEstudiantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEstudiantesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblEstudiantesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblEstudiantesMouseExited(evt);
            }
        });

        lblEstudianteIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEstudianteIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        lblEstudianteIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEstudianteICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarEstudianteLayout = new javax.swing.GroupLayout(btnRegistrarEstudiante);
        btnRegistrarEstudiante.setLayout(btnRegistrarEstudianteLayout);
        btnRegistrarEstudianteLayout.setHorizontalGroup(
            btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblEstudianteIC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        btnRegistrarEstudianteLayout.setVerticalGroup(
            btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstudianteIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblEstudiantes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pRegistrarEstudiante.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Agregar_Estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_Agregar_Estudiante.setText("Agregar Estudiante");

        lbl_Generar_Fotocheck.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_Generar_Fotocheck.setText("Generar Fotocheck");

        javax.swing.GroupLayout pRegistrarEstudianteLayout = new javax.swing.GroupLayout(pRegistrarEstudiante);
        pRegistrarEstudiante.setLayout(pRegistrarEstudianteLayout);
        pRegistrarEstudianteLayout.setHorizontalGroup(
            pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lbl_Generar_Fotocheck, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_Agregar_Estudiante, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap())
        );
        pRegistrarEstudianteLayout.setVerticalGroup(
            pRegistrarEstudianteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarEstudianteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Agregar_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_Generar_Fotocheck, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pAdministrarInformacion.setBackground(new java.awt.Color(255, 255, 255));

        lblAdm_Estudiante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_Estudiante.setText("Estudiantes");

        lblAdm_Veiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_Veiculos.setText("Vehículos");

        lblAdm_tipoVeicuo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_tipoVeicuo.setText("Tipo de Vehículos");

        lblAdm_tipoEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_tipoEmpleado.setText("Tipo Empleados");

        lblAdm_Empleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_Empleados.setText("Empleados");

        lblAdm_ProgramaEstudio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_ProgramaEstudio.setText("Programas de Estudio");
        lblAdm_ProgramaEstudio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdm_ProgramaEstudioMouseClicked(evt);
            }
        });

        lblAdm_Turnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_Turnos.setText("Turnos");

        lblAdm_R_parqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_R_parqueo.setText("Registros de Parqueo");

        lblAdm_R_ingresos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblAdm_R_ingresos.setText("Registros de Ingresos");

        lblDatosDeContacto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lblDatosDeContacto.setText("Datos de Contacto");

        javax.swing.GroupLayout pAdministrarInformacionLayout = new javax.swing.GroupLayout(pAdministrarInformacion);
        pAdministrarInformacion.setLayout(pAdministrarInformacionLayout);
        pAdministrarInformacionLayout.setHorizontalGroup(
            pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAdm_Estudiante, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAdm_ProgramaEstudio, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(lblAdm_tipoVeicuo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdm_Veiculos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblDatosDeContacto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblAdm_R_parqueo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addComponent(lblAdm_tipoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdm_Empleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblAdm_Turnos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblAdm_R_ingresos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pAdministrarInformacionLayout.setVerticalGroup(
            pAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdm_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDatosDeContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_Veiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_tipoVeicuo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_ProgramaEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_Empleados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_tipoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_Turnos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_R_parqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAdm_R_ingresos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnRegistrarVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarVeiculoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarVeiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarVeiculoMouseExited(evt);
            }
        });

        lblVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/auto-32.png"))); // NOI18N
        lblVeiculo.setText("Vehículos");
        lblVeiculo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVeiculoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVeiculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVeiculoMouseExited(evt);
            }
        });

        lblVeiculoIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVeiculoIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        lblVeiculoIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVeiculoICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarVeiculoLayout = new javax.swing.GroupLayout(btnRegistrarVeiculo);
        btnRegistrarVeiculo.setLayout(btnRegistrarVeiculoLayout);
        btnRegistrarVeiculoLayout.setHorizontalGroup(
            btnRegistrarVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVeiculoIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegistrarVeiculoLayout.setVerticalGroup(
            btnRegistrarVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarVeiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarVeiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVeiculoIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnRegistrarReportes.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegistrarReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegistrarReportesMouseExited(evt);
            }
        });

        lblReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/reportes-32.png"))); // NOI18N
        lblReportes.setText(" Reportes");
        lblReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblReportesMouseExited(evt);
            }
        });

        lblReportesIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReportesIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        lblReportesIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReportesICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnRegistrarReportesLayout = new javax.swing.GroupLayout(btnRegistrarReportes);
        btnRegistrarReportes.setLayout(btnRegistrarReportesLayout);
        btnRegistrarReportesLayout.setHorizontalGroup(
            btnRegistrarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnRegistrarReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblReportesIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnRegistrarReportesLayout.setVerticalGroup(
            btnRegistrarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnRegistrarReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblReportesIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblReportes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btnAdministrarInformacion.setBackground(new java.awt.Color(255, 255, 255));
        btnAdministrarInformacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAdministrarInformacionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAdministrarInformacionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAdministrarInformacionMouseExited(evt);
            }
        });

        lblAdministracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/data-protection-24.png"))); // NOI18N
        lblAdministracion.setText("Administrar Informacion");
        lblAdministracion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministracionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAdministracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAdministracionMouseExited(evt);
            }
        });

        lblAdministracionIC.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAdministracionIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png"))); // NOI18N
        lblAdministracionIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdministracionICMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btnAdministrarInformacionLayout = new javax.swing.GroupLayout(btnAdministrarInformacion);
        btnAdministrarInformacion.setLayout(btnAdministrarInformacionLayout);
        btnAdministrarInformacionLayout.setHorizontalGroup(
            btnAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAdministracion, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAdministracionIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        btnAdministrarInformacionLayout.setVerticalGroup(
            btnAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnAdministrarInformacionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnAdministrarInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblAdministracionIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblAdministracion, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap())
        );

        pReportes.setBackground(new java.awt.Color(255, 255, 255));

        lbl_reporte_parqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_reporte_parqueo.setText("Reportes de Parqueo");

        lbl_reporte_ingreso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_reporte_ingreso.setText("Reportes de Ingresos");

        javax.swing.GroupLayout pReportesLayout = new javax.swing.GroupLayout(pReportes);
        pReportes.setLayout(pReportesLayout);
        pReportesLayout.setHorizontalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_reporte_parqueo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(lbl_reporte_ingreso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pReportesLayout.setVerticalGroup(
            pReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pReportesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_reporte_parqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_reporte_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pRegistrarVeiculos.setBackground(new java.awt.Color(255, 255, 255));

        lbl_agregar_veiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_agregar_veiculo.setText("Agregar Vehículo");

        lbl_agregar_Tipo_veiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/arrow-descent-24.png"))); // NOI18N
        lbl_agregar_Tipo_veiculo.setText("Registrar Tipo de Vehículo");

        javax.swing.GroupLayout pRegistrarVeiculosLayout = new javax.swing.GroupLayout(pRegistrarVeiculos);
        pRegistrarVeiculos.setLayout(pRegistrarVeiculosLayout);
        pRegistrarVeiculosLayout.setHorizontalGroup(
            pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegistrarVeiculosLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_agregar_veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_agregar_Tipo_veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pRegistrarVeiculosLayout.setVerticalGroup(
            pRegistrarVeiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegistrarVeiculosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_agregar_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_agregar_Tipo_veiculo, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
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
                    .addComponent(pReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLectorQR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarReportes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdministrarInformacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pAdministrarInformacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pRegistrarEstudiante, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrarVeiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLectorQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRegistrarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pRegistrarVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegistrarReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdministrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pAdministrarInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jpanelRound1);

        javax.swing.GroupLayout contenedorLeftmenuLayout = new javax.swing.GroupLayout(contenedorLeftmenu);
        contenedorLeftmenu.setLayout(contenedorLeftmenuLayout);
        contenedorLeftmenuLayout.setHorizontalGroup(
            contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLeftmenuLayout.createSequentialGroup()
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        contenedorLeftmenuLayout.setVerticalGroup(
            contenedorLeftmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLeftmenuLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        contendorRigt.setBackground(new java.awt.Color(204, 255, 153));

        panelMover.setBackground(new java.awt.Color(255, 255, 255));
        panelMover.setMaximumSize(new java.awt.Dimension(32767, 60));
        panelMover.setMinimumSize(new java.awt.Dimension(0, 60));
        panelMover.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelMoverMouseDragged(evt);
            }
        });
        panelMover.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelMoverMousePressed(evt);
            }
        });

        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/icons8-minus-16.png"))); // NOI18N
        minimize.setOpaque(true);
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeMouseExited(evt);
            }
        });

        maximize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/maximize-button-16.png"))); // NOI18N
        maximize.setOpaque(true);
        maximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maximizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                maximizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                maximizeMouseExited(evt);
            }
        });

        close.setBackground(new java.awt.Color(255, 51, 51));
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/closeBlack16.png"))); // NOI18N
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout panelMoverLayout = new javax.swing.GroupLayout(panelMover);
        panelMover.setLayout(panelMoverLayout);
        panelMoverLayout.setHorizontalGroup(
            panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMoverLayout.createSequentialGroup()
                .addContainerGap(895, Short.MAX_VALUE)
                .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelMoverLayout.setVerticalGroup(
            panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMoverLayout.createSequentialGroup()
                .addGroup(panelMoverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        PanelPrincipal.setBackground(new java.awt.Color(153, 204, 255));
        PanelPrincipal.setAutoscrolls(true);

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout contendorRigtLayout = new javax.swing.GroupLayout(contendorRigt);
        contendorRigt.setLayout(contendorRigtLayout);
        contendorRigtLayout.setHorizontalGroup(
            contendorRigtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(contendorRigtLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contendorRigtLayout.setVerticalGroup(
            contendorRigtLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contendorRigtLayout.createSequentialGroup()
                .addComponent(panelMover, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(contenedorLeftmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(contendorRigt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorLeftmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(contendorRigt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void lblEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstudiantesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblEstudiantesMouseClicked

    private void btnRegistrarEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteMouseClicked

    }//GEN-LAST:event_btnRegistrarEstudianteMouseClicked

    private void btnLectorQRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLectorQRMouseClicked
     
    }//GEN-LAST:event_btnLectorQRMouseClicked

    private void lblEstudianteICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstudianteICMouseClicked
        metodos.LogicaPanel(pRegistrarEstudiante, ancho, 80);    
        boolean isVisible = pRegistrarEstudiante.isVisible();
        if (!isVisible) {
            collapseAllPanels();
        }
         if (isVisible) {
             lblEstudianteIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));   
        } else{
             lblEstudianteIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        pRegistrarEstudiante.setVisible(!isVisible);  
    }//GEN-LAST:event_lblEstudianteICMouseClicked

    private void panelMoverMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverMouseDragged
    FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        int currentY = evt.getY();
        int frameX = this.getLocation().x;
        int frameY = this.getLocation().y;
        //top
        int distanceY = this.getY();
    }//GEN-LAST:event_panelMoverMouseDragged

    private void panelMoverMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelMoverMousePressed
        FiveCodMoverJFrame.MousePressed(evt);
       int initialY = evt.getY();
    }//GEN-LAST:event_panelMoverMousePressed

    private void lblVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeiculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblVeiculoMouseClicked

    private void lblVeiculoICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeiculoICMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pRegistrarVeiculos, ancho, 84);
        boolean isVisible = pRegistrarVeiculos.isVisible();
        if (!isVisible) {
            collapseAllPanels(); // Añade todos los paneles que deseas colapsar
        }
        if (isVisible) {
             lblVeiculoIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));     
        } else{
             lblVeiculoIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        pRegistrarVeiculos.setVisible(!isVisible);
    }//GEN-LAST:event_lblVeiculoICMouseClicked

    private void btnRegistrarVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVeiculoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarVeiculoMouseClicked

    private void lblReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblReportesMouseClicked

    private void lblReportesICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesICMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pReportes, ancho, 82);
           boolean isVisible = pReportes.isVisible();     
        if (!isVisible) {
            collapseAllPanels();        
        }
         if (isVisible) {
             lblReportesIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));     
        } else{
             lblReportesIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }
        pReportes.setVisible(!isVisible);   
    }//GEN-LAST:event_lblReportesICMouseClicked

    private void btnRegistrarReportesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarReportesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegistrarReportesMouseClicked

    private void lblAdministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministracionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblAdministracionMouseClicked

    private void lblAdministracionICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministracionICMouseClicked
        // TODO add your handling code here:
        metodos.LogicaPanel(pAdministrarInformacion, ancho, 386);
        boolean isVisible = pAdministrarInformacion.isVisible();
        if (!isVisible) {
            collapseAllPanels();
        }
         if (isVisible) {
             lblAdministracionIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
            
        } else{
             lblAdministracionIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/upp-16.png")));
        }     
        pAdministrarInformacion.setVisible(!isVisible);   
    }//GEN-LAST:event_lblAdministracionICMouseClicked

    private void btnAdministrarInformacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarInformacionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdministrarInformacionMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:    
    }//GEN-LAST:event_jLabel2MouseClicked

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked

    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        // TODO add your handling code here:
       hoverBtnSalir();
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        // TODO add your handling code here:
       noHoverBtnSalir();
    }//GEN-LAST:event_btnSalirMouseExited

    private void lblAdm_ProgramaEstudioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdm_ProgramaEstudioMouseClicked
        // TODO add your handling code here:   
        metodos.actualizarPanel(PanelPrincipal,new Frm_R_Prog_Estudio().PanelProgramas);      
    }//GEN-LAST:event_lblAdm_ProgramaEstudioMouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        hoverBtnSalir();
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        noHoverBtnSalir();
    }//GEN-LAST:event_jLabel2MouseExited

    private void btnInicioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnInicio);
    }//GEN-LAST:event_btnInicioMouseEntered

    private void btnInicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnInicioMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnInicio);
    }//GEN-LAST:event_btnInicioMouseExited

    private void btnLectorQRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLectorQRMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnLectorQR);
    }//GEN-LAST:event_btnLectorQRMouseEntered

    private void btnLectorQRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLectorQRMouseExited
        // TODO add your handling code here:
        
        noHoverBtnmenu(btnLectorQR);
    }//GEN-LAST:event_btnLectorQRMouseExited

    private void btnRegistrarEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnRegistrarEstudiante);
    }//GEN-LAST:event_btnRegistrarEstudianteMouseEntered

    private void btnRegistrarEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarEstudianteMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnRegistrarEstudiante);
    }//GEN-LAST:event_btnRegistrarEstudianteMouseExited

    private void btnRegistrarVeiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVeiculoMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnRegistrarVeiculo);
    }//GEN-LAST:event_btnRegistrarVeiculoMouseEntered

    private void btnAdministrarInformacionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarInformacionMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnAdministrarInformacion);
    }//GEN-LAST:event_btnAdministrarInformacionMouseEntered

    private void btnAdministrarInformacionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAdministrarInformacionMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnAdministrarInformacion);
    }//GEN-LAST:event_btnAdministrarInformacionMouseExited

    private void btnRegistrarVeiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarVeiculoMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnRegistrarVeiculo);
    }//GEN-LAST:event_btnRegistrarVeiculoMouseExited

    private void btnRegistrarReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarReportesMouseEntered
        // TODO add your handling code here:
        
        hoverBtnMenu(btnRegistrarReportes);
    }//GEN-LAST:event_btnRegistrarReportesMouseEntered

    private void btnRegistrarReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarReportesMouseExited
        // TODO add your handling code here:
        
        noHoverBtnmenu(btnRegistrarReportes);
    }//GEN-LAST:event_btnRegistrarReportesMouseExited

    private void lblLectorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLectorMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnLectorQR);
    }//GEN-LAST:event_lblLectorMouseEntered

    private void lblLectorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLectorMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnLectorQR);
    }//GEN-LAST:event_lblLectorMouseExited

    private void lblEstudiantesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstudiantesMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnRegistrarEstudiante);
    }//GEN-LAST:event_lblEstudiantesMouseEntered

    private void lblEstudiantesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEstudiantesMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnRegistrarEstudiante);
    }//GEN-LAST:event_lblEstudiantesMouseExited

    private void lblVeiculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeiculoMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnRegistrarVeiculo);
    }//GEN-LAST:event_lblVeiculoMouseEntered

    private void lblVeiculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVeiculoMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnRegistrarVeiculo);
    }//GEN-LAST:event_lblVeiculoMouseExited

    private void lblReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnRegistrarReportes);
        
    }//GEN-LAST:event_lblReportesMouseEntered

    private void lblReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReportesMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnRegistrarReportes);
    }//GEN-LAST:event_lblReportesMouseExited

    private void lblAdministracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministracionMouseEntered
        // TODO add your handling code here:
        hoverBtnMenu(btnAdministrarInformacion);
    }//GEN-LAST:event_lblAdministracionMouseEntered

    private void lblAdministracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdministracionMouseExited
        // TODO add your handling code here:
        noHoverBtnmenu(btnAdministrarInformacion);
    }//GEN-LAST:event_lblAdministracionMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        // TODO add your handling code here:
        close.setBackground(new Color(255,51,51));
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/closeWhite.png")));
        
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        // TODO add your handling code here:
      
        close.setBackground(new Color(255,255,255));
       
         close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/closeBlack16.png")));
        
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        // TODO add your handling code here:
        dispose();
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        // TODO add your handling code here:
       
        setState(ICONIFIED);
        
    }//GEN-LAST:event_minimizeMouseClicked

    private void maximizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseClicked
        // TODO add your handling code here:
         if (getExtendedState() == MAXIMIZED_BOTH) {
                    setExtendedState(NORMAL);
                } else {
                    setExtendedState(MAXIMIZED_BOTH);
                }
    }//GEN-LAST:event_maximizeMouseClicked

    private void minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseEntered
        // TODO add your handling code here:
        
        minimize.setBackground(new Color(242,242,242));
        
    }//GEN-LAST:event_minimizeMouseEntered

    private void maximizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseEntered
        // TODO add your handling code here:
        
        maximize.setBackground(new Color(242,242,242));
    }//GEN-LAST:event_maximizeMouseEntered

    private void maximizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maximizeMouseExited
        // TODO add your handling code here:
        maximize.setBackground(new Color(255,255,255));
        
    }//GEN-LAST:event_maximizeMouseExited

    private void minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseExited
        // TODO add your handling code here:
        minimize.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_minimizeMouseExited

    private void hoverBtnSalir(){
        btnSalir.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        btnSalir.setBackground(new Color(45, 83, 138));
    }
    
    private void noHoverBtnSalir(){
        btnSalir.setCursor(Cursor.getDefaultCursor());
        btnSalir.setBackground(new Color(2, 29, 48));
    
    }
    
    private void hoverBtnMenu(JPanel panel){
        panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        panel.setBackground(new Color(153,204,255));
    }
    
    private void noHoverBtnmenu(JPanel panel){
        panel.setCursor(Cursor.getDefaultCursor());
        panel.setBackground(new Color(255,255,255));
    
    }
     
  
    private void collapseAllPanels() {
        metodos.ocultarComponentes(pRegistrarEstudiante,pRegistrarVeiculos,pReportes,pAdministrarInformacion);
        lblAdministracionIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        lblReportesIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        lblVeiculoIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
        lblEstudianteIC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconsHome/down-16.png")));
}
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel btnAdministrarInformacion;
    private javax.swing.JPanel btnInicio;
    private javax.swing.JPanel btnLectorQR;
    private javax.swing.JPanel btnRegistrarEstudiante;
    private javax.swing.JPanel btnRegistrarReportes;
    private javax.swing.JPanel btnRegistrarVeiculo;
    private Vista.Clases.JpanelRound btnSalir;
    private javax.swing.JLabel close;
    private javax.swing.JPanel contendorRigt;
    private javax.swing.JPanel contenedorLeftmenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private Vista.Clases.JpanelRound jpanelRound1;
    private javax.swing.JLabel lblAdm_Empleados;
    private javax.swing.JLabel lblAdm_Estudiante;
    private javax.swing.JLabel lblAdm_ProgramaEstudio;
    private javax.swing.JLabel lblAdm_R_ingresos;
    private javax.swing.JLabel lblAdm_R_parqueo;
    private javax.swing.JLabel lblAdm_Turnos;
    private javax.swing.JLabel lblAdm_Veiculos;
    private javax.swing.JLabel lblAdm_tipoEmpleado;
    private javax.swing.JLabel lblAdm_tipoVeicuo;
    private javax.swing.JLabel lblAdministracion;
    private javax.swing.JLabel lblAdministracionIC;
    private javax.swing.JLabel lblDatosDeContacto;
    private javax.swing.JLabel lblEstudianteIC;
    private javax.swing.JLabel lblEstudiantes;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblLector;
    private javax.swing.JLabel lblReportes;
    private javax.swing.JLabel lblReportesIC;
    private javax.swing.JLabel lblVeiculo;
    private javax.swing.JLabel lblVeiculoIC;
    private javax.swing.JLabel lbl_Agregar_Estudiante;
    private javax.swing.JLabel lbl_Generar_Fotocheck;
    private javax.swing.JLabel lbl_agregar_Tipo_veiculo;
    private javax.swing.JLabel lbl_agregar_veiculo;
    private javax.swing.JLabel lbl_reporte_ingreso;
    private javax.swing.JLabel lbl_reporte_parqueo;
    private javax.swing.JLabel maximize;
    private javax.swing.JLabel minimize;
    private javax.swing.JPanel pAdministrarInformacion;
    private javax.swing.JPanel pRegistrarEstudiante;
    private javax.swing.JPanel pRegistrarVeiculos;
    private javax.swing.JPanel pReportes;
    private javax.swing.JPanel panelMover;
    // End of variables declaration//GEN-END:variables

    
}
