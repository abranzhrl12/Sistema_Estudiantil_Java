
package Vista;
import Vista.Clases.SimpleTitleBar;
import java.awt.Color;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.UIManager;
public class prueba extends javax.swing.JFrame {
    SimpleTitleBar o = new SimpleTitleBar();
    int ancho;
    int alto;
    public prueba() {     
        initComponents();
      
//         o.init(this);
        setBackground(new Color(0,0,0,0));
       
      desplegable1.setVisible(false);   
    }
//    public void LogicaPanel(JPanel jo,int tamaño){
//        if (jo.isVisible()) {
//            jo.setVisible(false);
//            jo.setPreferredSize(new Dimension(300, 0)); // Establece altura cero
//        } else {
//            jo.setVisible(true);
//            jo.setPreferredSize(new Dimension(300, tamaño)); // Establece altura deseada
//        }
//        // Revalidar el diseño para reflejar los cambios
//        jo.revalidate();
//        jo.repaint();
//    } 
     JPanel glo;
//    public void InitContent(JPanel x) {
//        try {
//            x.show();
//        x.setSize(contenedorPrincipal.getSize());
//        x.setLocation(0, 0);
//        contenedorPrincipal.removeAll();
//        contenedorPrincipal.add(x, BorderLayout.CENTER);
//        contenedorPrincipal.revalidate();
//        contenedorPrincipal.repaint(); 
//        } catch (Exception e) {
//        }
//    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fiveCodMoverJFrame1 = new FiveCodMover.FiveCodMoverJFrame();
        panelRound1 = new Vista.Clases.PanelRound();
        jpanelRound1 = new Vista.Clases.JpanelRound();
        desplegable1 = new javax.swing.JPanel();
        jpanelRound4 = new Vista.Clases.JpanelRound();
        btnconectar = new rojerusan.RSButtonRound();
        jpanelRound6 = new Vista.Clases.JpanelRound();
        btn_equipo4 = new rojerusan.RSButtonIconI();
        jpanelRound3 = new Vista.Clases.JpanelRound();
        rSLabelImage1 = new rojerusan.RSLabelImage();
        btn_equipo1 = new rojerusan.RSButtonIconI();
        jpanelRound7 = new Vista.Clases.JpanelRound();
        btn_equipo5 = new rojerusan.RSButtonIconI();
        jpanelRound8 = new Vista.Clases.JpanelRound();
        btn_equipo6 = new rojerusan.RSButtonIconI();
        desplegable2 = new javax.swing.JPanel();
        jpanelRound9 = new Vista.Clases.JpanelRound();
        btn_equipo7 = new rojerusan.RSButtonIconI();
        jpanelRound2 = new Vista.Clases.JpanelRound();
        btn_equipo8 = new rojerusan.RSButtonIconI();
        jpanelRound10 = new Vista.Clases.JpanelRound();
        btn_equipo9 = new rojerusan.RSButtonIconI();
        jpanelRound5 = new Vista.Clases.JpanelRound();
        btn_equipo3 = new rojerusan.RSButtonIconI();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 897));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });

        panelRound1.setBackground(new java.awt.Color(204, 102, 0));
        panelRound1.setBorderColor(new java.awt.Color(226, 226, 226));
        panelRound1.setCornerRadius(20);

        jpanelRound1.setBackground(new java.awt.Color(204, 0, 51));
        jpanelRound1.setRoundBottomLeft(25);

        desplegable1.setBackground(new java.awt.Color(51, 51, 0));

        jpanelRound4.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound4.setRoundBottomLeft(15);
        jpanelRound4.setRoundBottomRight(15);
        jpanelRound4.setRoundTopLeft(15);
        jpanelRound4.setRoundTopRight(15);

        btnconectar.setBackground(new java.awt.Color(255, 255, 255));
        btnconectar.setText("Ingresar");
        btnconectar.setColorText(new java.awt.Color(95, 95, 112));
        btnconectar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconectarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound4Layout = new javax.swing.GroupLayout(jpanelRound4);
        jpanelRound4.setLayout(jpanelRound4Layout);
        jpanelRound4Layout.setHorizontalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jpanelRound4Layout.setVerticalGroup(
            jpanelRound4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnconectar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desplegable1Layout = new javax.swing.GroupLayout(desplegable1);
        desplegable1.setLayout(desplegable1Layout);
        desplegable1Layout.setHorizontalGroup(
            desplegable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        desplegable1Layout.setVerticalGroup(
            desplegable1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jpanelRound6.setBackground(new java.awt.Color(204, 102, 0));
        jpanelRound6.setRoundBottomLeft(15);
        jpanelRound6.setRoundBottomRight(15);
        jpanelRound6.setRoundTopLeft(15);
        jpanelRound6.setRoundTopRight(15);
        jpanelRound6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_equipo4.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo4.setText("Reportes");
        btn_equipo4.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo4.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo4.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo4.setName(""); // NOI18N
        btn_equipo4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo4ActionPerformed(evt);
            }
        });
        jpanelRound6.add(btn_equipo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 156, 32));

        jpanelRound3.setBackground(new java.awt.Color(255, 51, 51));
        jpanelRound3.setRoundBottomLeft(15);
        jpanelRound3.setRoundBottomRight(15);
        jpanelRound3.setRoundTopLeft(15);
        jpanelRound3.setRoundTopRight(15);
        jpanelRound3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSLabelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arrowdowm.png"))); // NOI18N
        jpanelRound3.add(rSLabelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 12, 20, 20));

        btn_equipo1.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/student2.png"))); // NOI18N
        btn_equipo1.setText("Estudiantes");
        btn_equipo1.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo1.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo1.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo1.setName(""); // NOI18N
        btn_equipo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo1ActionPerformed(evt);
            }
        });
        jpanelRound3.add(btn_equipo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 180, 32));

        jpanelRound7.setBackground(new java.awt.Color(0, 0, 255));
        jpanelRound7.setRoundBottomLeft(15);
        jpanelRound7.setRoundBottomRight(15);
        jpanelRound7.setRoundTopLeft(15);
        jpanelRound7.setRoundTopRight(15);

        btn_equipo5.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo5.setText("Inicio");
        btn_equipo5.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo5.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo5.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo5.setName(""); // NOI18N
        btn_equipo5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound7Layout = new javax.swing.GroupLayout(jpanelRound7);
        jpanelRound7.setLayout(jpanelRound7Layout);
        jpanelRound7Layout.setHorizontalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound7Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jpanelRound7Layout.setVerticalGroup(
            jpanelRound7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound7Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btn_equipo5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jpanelRound8.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound8.setRoundBottomLeft(15);
        jpanelRound8.setRoundBottomRight(15);
        jpanelRound8.setRoundTopLeft(15);
        jpanelRound8.setRoundTopRight(15);

        btn_equipo6.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo6.setText("Vehiculos");
        btn_equipo6.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo6.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo6.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo6.setName(""); // NOI18N
        btn_equipo6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound8Layout = new javax.swing.GroupLayout(jpanelRound8);
        jpanelRound8.setLayout(jpanelRound8Layout);
        jpanelRound8Layout.setHorizontalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound8Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jpanelRound8Layout.setVerticalGroup(
            jpanelRound8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound8Layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(btn_equipo6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        desplegable2.setBackground(new java.awt.Color(255, 51, 51));

        jpanelRound9.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound9.setRoundBottomLeft(15);
        jpanelRound9.setRoundBottomRight(15);
        jpanelRound9.setRoundTopLeft(15);
        jpanelRound9.setRoundTopRight(15);

        btn_equipo7.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo7.setText("Agregar");
        btn_equipo7.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo7.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo7.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo7.setName(""); // NOI18N
        btn_equipo7.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound9Layout = new javax.swing.GroupLayout(jpanelRound9);
        jpanelRound9.setLayout(jpanelRound9Layout);
        jpanelRound9Layout.setHorizontalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound9Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_equipo7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        jpanelRound9Layout.setVerticalGroup(
            jpanelRound9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_equipo7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout desplegable2Layout = new javax.swing.GroupLayout(desplegable2);
        desplegable2.setLayout(desplegable2Layout);
        desplegable2Layout.setHorizontalGroup(
            desplegable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        desplegable2Layout.setVerticalGroup(
            desplegable2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desplegable2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpanelRound9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jpanelRound2.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound2.setDoubleBuffered(false);
        jpanelRound2.setRoundBottomLeft(15);
        jpanelRound2.setRoundBottomRight(15);
        jpanelRound2.setRoundTopLeft(15);
        jpanelRound2.setRoundTopRight(15);

        btn_equipo8.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo8.setText("Generar QR");
        btn_equipo8.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo8.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo8.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo8.setName(""); // NOI18N
        btn_equipo8.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound2Layout = new javax.swing.GroupLayout(jpanelRound2);
        jpanelRound2.setLayout(jpanelRound2Layout);
        jpanelRound2Layout.setHorizontalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_equipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jpanelRound2Layout.setVerticalGroup(
            jpanelRound2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound2Layout.createSequentialGroup()
                .addComponent(btn_equipo8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        jpanelRound10.setBackground(new java.awt.Color(204, 102, 0));
        jpanelRound10.setRoundBottomLeft(15);
        jpanelRound10.setRoundBottomRight(15);
        jpanelRound10.setRoundTopLeft(15);
        jpanelRound10.setRoundTopRight(15);
        jpanelRound10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_equipo9.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo9.setText("Reportes");
        btn_equipo9.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo9.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo9.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo9.setName(""); // NOI18N
        btn_equipo9.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo9ActionPerformed(evt);
            }
        });
        jpanelRound10.add(btn_equipo9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 156, 32));

        jpanelRound5.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRound5.setRoundBottomLeft(15);
        jpanelRound5.setRoundBottomRight(15);
        jpanelRound5.setRoundTopLeft(15);
        jpanelRound5.setRoundTopRight(15);

        btn_equipo3.setBackground(new java.awt.Color(255, 255, 255));
        btn_equipo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        btn_equipo3.setText("Generar QR");
        btn_equipo3.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo3.setColorText(new java.awt.Color(95, 95, 112));
        btn_equipo3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_equipo3.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo3.setName(""); // NOI18N
        btn_equipo3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipo3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelRound5Layout = new javax.swing.GroupLayout(jpanelRound5);
        jpanelRound5.setLayout(jpanelRound5Layout);
        jpanelRound5Layout.setHorizontalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound5Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btn_equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jpanelRound5Layout.setVerticalGroup(
            jpanelRound5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRound5Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(btn_equipo3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpanelRound1Layout = new javax.swing.GroupLayout(jpanelRound1);
        jpanelRound1.setLayout(jpanelRound1Layout);
        jpanelRound1Layout.setHorizontalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(desplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(desplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jpanelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jpanelRound1Layout.setVerticalGroup(
            jpanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRound1Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jpanelRound6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpanelRound7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpanelRound3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(desplegable1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpanelRound5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jpanelRound8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(desplegable2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jpanelRound10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jpanelRound2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(725, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jpanelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Frm_R_Estudiante p = new Frm_R_Estudiante();

//    public void btn2_equipo() {
//      
//     
//        p.show();
//        p.setSize(contenedorPrincipal.getSize());
//     
//        p.setLocation(0, 0);
//        contenedorPrincipal.removeAll();
//        
//        contenedorPrincipal.add(p, BorderLayout.CENTER);
//        contenedorPrincipal.revalidate();
//       contenedorPrincipal.repaint();
//       
//    glo = p;
//    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
     ancho =   this.getHeight();
        alto =   this.getWidth();
//        InitContent(glo);
    }//GEN-LAST:event_formMouseDragged

    private void btn_equipo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo3ActionPerformed

    private void btn_equipo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo9ActionPerformed

    private void btn_equipo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo8ActionPerformed

    private void btn_equipo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo7ActionPerformed

    private void btn_equipo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo6ActionPerformed

    private void btn_equipo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_equipo5ActionPerformed

    private void btn_equipo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo1ActionPerformed
        //        LogicaPanel(desplegable1,114);
    }//GEN-LAST:event_btn_equipo1ActionPerformed

    private void btn_equipo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipo4ActionPerformed
//        btn2_equipo();
    }//GEN-LAST:event_btn_equipo4ActionPerformed

    private void btnconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconectarActionPerformed
        //        ValidarC_Vacios val=new ValidarC_Vacios();
        //        boolean a= val.camposTextoVacios(txtusuario,txtpass);
        //        if(a){
            //            log.validarCredenciales();
            //        }
    }//GEN-LAST:event_btnconectarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
  try {
    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
} catch (Exception ex) {
    ex.printStackTrace();
}
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new prueba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btn_equipo1;
    private rojerusan.RSButtonIconI btn_equipo3;
    private rojerusan.RSButtonIconI btn_equipo4;
    private rojerusan.RSButtonIconI btn_equipo5;
    private rojerusan.RSButtonIconI btn_equipo6;
    private rojerusan.RSButtonIconI btn_equipo7;
    private rojerusan.RSButtonIconI btn_equipo8;
    private rojerusan.RSButtonIconI btn_equipo9;
    private rojerusan.RSButtonRound btnconectar;
    private javax.swing.JPanel desplegable1;
    private javax.swing.JPanel desplegable2;
    private FiveCodMover.FiveCodMoverJFrame fiveCodMoverJFrame1;
    private Vista.Clases.JpanelRound jpanelRound1;
    private Vista.Clases.JpanelRound jpanelRound10;
    private Vista.Clases.JpanelRound jpanelRound2;
    private Vista.Clases.JpanelRound jpanelRound3;
    private Vista.Clases.JpanelRound jpanelRound4;
    private Vista.Clases.JpanelRound jpanelRound5;
    private Vista.Clases.JpanelRound jpanelRound6;
    private Vista.Clases.JpanelRound jpanelRound7;
    private Vista.Clases.JpanelRound jpanelRound8;
    private Vista.Clases.JpanelRound jpanelRound9;
    private Vista.Clases.PanelRound panelRound1;
    private rojerusan.RSLabelImage rSLabelImage1;
    // End of variables declaration//GEN-END:variables
}
