/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo.conexion;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author jhoyb
 */
public class frmDasboard extends javax.swing.JFrame {

    /**
     * Creates new form frmDasboard
     */
     DefaultTableModel EmpleadosModel = new DefaultTableModel();
     
      String titulos[] = {"Codigo","DNI","Nombres y Apellidos", "Programa de Estudio","Hora de Ingreso","Fecha Ingreso"};
      String fecha;
       String[] PorcentagesIngresos;
      
    
    public frmDasboard() {
        initComponents();
        
        EmpleadosModel.setColumnIdentifiers(titulos);
        tablaEstudiantes.setModel(EmpleadosModel);
        
        
        tablaEstudiantes.getColumnModel().getColumn(0).setPreferredWidth(10);
        tablaEstudiantes.getColumnModel().getColumn(1).setPreferredWidth(10);
        tablaEstudiantes.getColumnModel().getColumn(2).setPreferredWidth(100);
        tablaEstudiantes.getColumnModel().getColumn(3).setPreferredWidth(200);
        tablaEstudiantes.getColumnModel().getColumn(4).setPreferredWidth(10);
        tablaEstudiantes.getColumnModel().getColumn(5).setPreferredWidth(10);
        
        
        //Obtener fecha Actual
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        fecha = fechaActual.format(formatter);
       
        ConsultaTabla();
        
        
      PorcentagesIngresos = new String[8];
      consultarPorcentagesIngresos();
      
      consultarCantidadDeIngresos();
        
         
        
    }
    
    private void consultarCantidadDeIngresos(){
    
        String cosulta = "SELECT COUNT(*) AS Total_Registros FROM registro_ingreso WHERE Fecha = '"+fecha+"';";

        conexion cn = new conexion();
        cn.conectar();

        try {
            ResultSet rs = cn.getConsulta(cosulta);
            int contador = 0;
            if (rs != null) {
                while (rs.next()) {
                    
                    lbl_totalDelDia.setText(rs.getString(1));
                    
                } 
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Error en la consultaoo" + e.getMessage());

        } finally {
            cn.cerrarConexion();
            System.out.println(cosulta);
        }


    }
    
   
    private void consultarPorcentagesIngresos() {

        String consulta = "SELECT p.Nombre AS Programa, "
                + "CONCAT(ROUND((COUNT(e.cod_Estudiante) * 100.0) / "
                + "(SELECT COUNT(cod_Estudiante) FROM registro_ingreso WHERE Fecha = '"+fecha+"'), 0), '%') "
                + "AS Porcentaje_Ingresos FROM estudiante e "
                + "INNER JOIN programa_estudio p ON e.cod_Programa = p.cod_Programa "
                + "LEFT JOIN registro_ingreso r ON e.cod_Estudiante = r.cod_Estudiante "
                + "WHERE r.Fecha = '"+fecha+"' GROUP BY p.Nombre ORDER BY p.Nombre ASC";

        conexion cn = new conexion();
        cn.conectar();

        try {

            ResultSet rs = cn.getConsulta(consulta);
            int contador = 0;

            if (rs!=null) {
                
                while (rs.next()) {

                PorcentagesIngresos[contador] = rs.getString(2);
                contador++;

            }

            for (int i = 0; i < PorcentagesIngresos.length; i++) {

                switch (i) {

                    case 0:
                        lbl_porc_Contabilidad.setText(PorcentagesIngresos[i]);
                        break;
                    case 1:
                        lbl_poc_DSI.setText(PorcentagesIngresos[i]);
                        break;
                    case 2:
                        lbl_porc_electricidad_ind.setText(PorcentagesIngresos[i]);
                        break;
                    case 3:
                        lbl_porc_electronica_ind.setText(PorcentagesIngresos[i]);
                        break;
                    case 4:
                        lbl_Porc_Enf_tec.setText(PorcentagesIngresos[i]);
                        break;
                    case 5:
                        lbl_porc_mecanica_produccion.setText(PorcentagesIngresos[i]);
                        break;
                    case 6:
                        lbl_porc_mecatronica_automotris.setText(PorcentagesIngresos[i]);
                        break;
                    case 7:
                        lbl_porc_quimica.setText(PorcentagesIngresos[i]);
                        break;
                    default:
                        throw new AssertionError();
                }
            }  
            }
        } catch (Exception e) {

            JOptionPane.showMessageDialog(rootPane, "Error en la consultaoo" + e.getMessage());

        } finally {
            cn.cerrarConexion();
            System.out.println(consulta);
        }
    }


    
    private void ConsultaTabla() {
        
       
        
        
        conexion cn = new conexion();
        cn.conectar();
        
        String  consultaFinal = "select e.cod_Estudiante,e.DNI,concat(e.Nombre,e.Ape_Paterno,e.Ape_Materno),p_e.Nombre,r_i.Hora,r_i.Fecha FROM registro_ingreso r_i INNER JOIN estudiante e ON e.cod_Estudiante = r_i.cod_Estudiante INNER JOIN programa_estudio p_e on p_e.cod_Programa = e.cod_Programa where r_i.Fecha = '"+fecha+"' order by r_i.Hora desc ";
        
        try {
               
            ResultSet rs = cn.getConsulta(consultaFinal);
            
            limpiarTabla();
            
           
            
            while (rs.next()) {
                
                String[] datos = new String[titulos.length];

                for (int i = 0; i < titulos.length; i++) {

                    datos[i] = rs.getString(i + 1);
                }
                
                EmpleadosModel.addRow(datos);

            }
            
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(rootPane, "Error en la consulta" + e.getMessage() );
            
        } finally {
            cn.cerrarConexion();
            System.out.println(consultaFinal);
        }
    }
 
    private void limpiarTabla() {
        int x = EmpleadosModel.getRowCount();
        for (int i = 0; i < x; i++) {
            EmpleadosModel.removeRow(0);
        }

        
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        PanelPrincipalDSh = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresosdelDia = new Vista.Clases.JpanelRound();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lbl_porc_quimica = new javax.swing.JLabel();
        lbl_Porc_Enf_tec = new javax.swing.JLabel();
        lbl_poc_DSI = new javax.swing.JLabel();
        lbl_porc_Contabilidad = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_porc_electricidad_ind = new javax.swing.JLabel();
        lbl_porc_electronica_ind = new javax.swing.JLabel();
        lbl_porc_mecatronica_automotris = new javax.swing.JLabel();
        lbl_porc_mecanica_produccion = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        btnSalir1 = new Vista.Clases.JpanelRound();
        jLabel3 = new javax.swing.JLabel();
        panelRound1 = new Vista.Clases.PanelRound();
        rSScrollPane1 = new necesario.RSScrollPane();
        tablaEstudiantes = new rojerusan.RSTableMetro();
        jLabel4 = new javax.swing.JLabel();
        btnIngresosdelDia1 = new Vista.Clases.JpanelRound();
        jLabel7 = new javax.swing.JLabel();
        lbl_totalDelDia = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelPrincipalDSh.setBackground(new java.awt.Color(243, 243, 249));
        PanelPrincipalDSh.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Dashboard");

        btnIngresosdelDia.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresosdelDia.setRoundBottomLeft(40);
        btnIngresosdelDia.setRoundBottomRight(40);
        btnIngresosdelDia.setRoundTopLeft(40);
        btnIngresosdelDia.setRoundTopRight(40);
        btnIngresosdelDia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresosdelDiaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresosdelDiaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresosdelDiaMouseExited(evt);
            }
        });
        btnIngresosdelDia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 255));
        jLabel5.setText("Porcentage Ingresos por Programa de Estudio");
        btnIngresosdelDia.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel9.setText("Química Industrial");
        btnIngresosdelDia.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 250, -1));

        jLabel10.setText("Contabilidad");
        btnIngresosdelDia.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 250, -1));

        jLabel11.setText("Desarrollo de Sistemas de Informacion");
        btnIngresosdelDia.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 250, -1));

        jLabel12.setText("Enfermería Técnica");
        btnIngresosdelDia.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 240, -1));

        jLabel13.setText("Electricidad Industrial");
        btnIngresosdelDia.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 250, -1));

        jLabel14.setText("Electrónica Industrial");
        btnIngresosdelDia.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, -1));

        jLabel15.setText("Mecatrónica Automotriz");
        btnIngresosdelDia.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 250, -1));

        jLabel16.setText("Mecánica de Producción Industrial");
        btnIngresosdelDia.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 250, -1));

        lbl_porc_quimica.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_quimica.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_quimica.setText("0%");
        btnIngresosdelDia.add(lbl_porc_quimica, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 50, -1));

        lbl_Porc_Enf_tec.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_Porc_Enf_tec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Porc_Enf_tec.setText("0%");
        btnIngresosdelDia.add(lbl_Porc_Enf_tec, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 60, 50, -1));

        lbl_poc_DSI.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_poc_DSI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_poc_DSI.setText("0%");
        btnIngresosdelDia.add(lbl_poc_DSI, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 50, -1));

        lbl_porc_Contabilidad.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_Contabilidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_Contabilidad.setText("0%");
        btnIngresosdelDia.add(lbl_porc_Contabilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 50, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        btnIngresosdelDia.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 10, 110));

        lbl_porc_electricidad_ind.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_electricidad_ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_electricidad_ind.setText("0%");
        btnIngresosdelDia.add(lbl_porc_electricidad_ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 50, -1));

        lbl_porc_electronica_ind.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_electronica_ind.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_electronica_ind.setText("0%");
        btnIngresosdelDia.add(lbl_porc_electronica_ind, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, 50, -1));

        lbl_porc_mecatronica_automotris.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_mecatronica_automotris.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_mecatronica_automotris.setText("0%");
        btnIngresosdelDia.add(lbl_porc_mecatronica_automotris, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 50, -1));

        lbl_porc_mecanica_produccion.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        lbl_porc_mecanica_produccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_porc_mecanica_produccion.setText("0%");
        btnIngresosdelDia.add(lbl_porc_mecanica_produccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 50, -1));
        btnIngresosdelDia.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 310, 10));
        btnIngresosdelDia.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 310, 10));
        btnIngresosdelDia.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 310, 10));
        btnIngresosdelDia.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 310, 10));
        btnIngresosdelDia.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 310, 10));
        btnIngresosdelDia.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 310, 10));

        btnSalir1.setBackground(new java.awt.Color(0, 153, 153));
        btnSalir1.setRoundBottomLeft(50);
        btnSalir1.setRoundBottomRight(50);
        btnSalir1.setRoundTopLeft(50);
        btnSalir1.setRoundTopRight(50);
        btnSalir1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalir1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalir1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalir1MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ir al Scanner");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnSalir1Layout = new javax.swing.GroupLayout(btnSalir1);
        btnSalir1.setLayout(btnSalir1Layout);
        btnSalir1Layout.setHorizontalGroup(
            btnSalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalir1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18))
        );
        btnSalir1Layout.setVerticalGroup(
            btnSalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnSalir1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorderColor(new java.awt.Color(204, 204, 204));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setForeground(new java.awt.Color(255, 255, 255));
        rSScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        rSScrollPane1.setColorBackground(new java.awt.Color(255, 255, 255));

        tablaEstudiantes.setBackground(new java.awt.Color(204, 204, 204));
        tablaEstudiantes.setForeground(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"12321", "fdsfsd", null, null, null},
                {"121", "fdsfsd", null, null, null},
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
                "CODIGO", "NOMBRES Y APELLIDOS", "PROGRAMA ESTUDIO", "HORA INGRESO", "SEMESTRE"
            }
        ));
        tablaEstudiantes.setAltoHead(40);
        tablaEstudiantes.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tablaEstudiantes.setColorBackgoundHead(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setColorBordeFilas(new java.awt.Color(0, 0, 204));
        tablaEstudiantes.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setColorFilasBackgound2(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setColorFilasForeground1(new java.awt.Color(153, 153, 153));
        tablaEstudiantes.setColorFilasForeground2(new java.awt.Color(153, 153, 153));
        tablaEstudiantes.setColorForegroundHead(new java.awt.Color(102, 102, 102));
        tablaEstudiantes.setColorSelBackgound(new java.awt.Color(102, 102, 102));
        tablaEstudiantes.setColorSelForeground(new java.awt.Color(102, 102, 102));
        tablaEstudiantes.setDoubleBuffered(true);
        tablaEstudiantes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaEstudiantes.setGridColor(new java.awt.Color(255, 255, 255));
        tablaEstudiantes.setGrosorBordeFilas(0);
        tablaEstudiantes.setRowHeight(39);
        tablaEstudiantes.setRowMargin(2);
        tablaEstudiantes.setRowSelectionAllowed(false);
        tablaEstudiantes.setSelectionForeground(new java.awt.Color(153, 153, 153));
        tablaEstudiantes.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaEstudiantes.setShowGrid(false);
        rSScrollPane1.setViewportView(tablaEstudiantes);

        panelRound1.add(rSScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 850, 260));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Ultimos Estudiantes que Ingresaron");

        btnIngresosdelDia1.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresosdelDia1.setRoundBottomLeft(40);
        btnIngresosdelDia1.setRoundBottomRight(40);
        btnIngresosdelDia1.setRoundTopLeft(40);
        btnIngresosdelDia1.setRoundTopRight(40);
        btnIngresosdelDia1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresosdelDia1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresosdelDia1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresosdelDia1MouseExited(evt);
            }
        });
        btnIngresosdelDia1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Ingresos del Dia");
        btnIngresosdelDia1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl_totalDelDia.setFont(new java.awt.Font("Segoe UI Semibold", 0, 80)); // NOI18N
        lbl_totalDelDia.setText("50");
        btnIngresosdelDia1.add(lbl_totalDelDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 93));

        javax.swing.GroupLayout PanelPrincipalDShLayout = new javax.swing.GroupLayout(PanelPrincipalDSh);
        PanelPrincipalDSh.setLayout(PanelPrincipalDShLayout);
        PanelPrincipalDShLayout.setHorizontalGroup(
            PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalDShLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
                    .addGroup(PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalDShLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(413, 413, 413)
                            .addComponent(btnSalir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalDShLayout.createSequentialGroup()
                            .addComponent(btnIngresosdelDia1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btnIngresosdelDia, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(65, 65, 65))
        );
        PanelPrincipalDShLayout.setVerticalGroup(
            PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalDShLayout.createSequentialGroup()
                .addGroup(PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalDShLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPrincipalDShLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
                .addGroup(PanelPrincipalDShLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnIngresosdelDia1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresosdelDia, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalDSh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipalDSh, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresosdelDiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDiaMouseClicked

    }//GEN-LAST:event_btnIngresosdelDiaMouseClicked

    private void btnIngresosdelDiaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDiaMouseEntered
        // TODO add your handling code here:
      
    }//GEN-LAST:event_btnIngresosdelDiaMouseEntered

    private void btnIngresosdelDiaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDiaMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnIngresosdelDiaMouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3MouseExited

    private void btnSalir1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1MouseClicked

    private void btnSalir1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1MouseEntered

    private void btnSalir1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalir1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalir1MouseExited

    private void btnIngresosdelDia1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDia1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosdelDia1MouseClicked

    private void btnIngresosdelDia1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDia1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosdelDia1MouseEntered

    private void btnIngresosdelDia1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresosdelDia1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnIngresosdelDia1MouseExited

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
            java.util.logging.Logger.getLogger(frmDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelPrincipalDSh;
    private Vista.Clases.JpanelRound btnIngresosdelDia;
    private Vista.Clases.JpanelRound btnIngresosdelDia1;
    private Vista.Clases.JpanelRound btnSalir1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lbl_Porc_Enf_tec;
    private javax.swing.JLabel lbl_poc_DSI;
    private javax.swing.JLabel lbl_porc_Contabilidad;
    private javax.swing.JLabel lbl_porc_electricidad_ind;
    private javax.swing.JLabel lbl_porc_electronica_ind;
    private javax.swing.JLabel lbl_porc_mecanica_produccion;
    private javax.swing.JLabel lbl_porc_mecatronica_automotris;
    private javax.swing.JLabel lbl_porc_quimica;
    private javax.swing.JLabel lbl_totalDelDia;
    private Vista.Clases.PanelRound panelRound1;
    private necesario.RSScrollPane rSScrollPane1;
    private rojerusan.RSTableMetro tablaEstudiantes;
    // End of variables declaration//GEN-END:variables
}
