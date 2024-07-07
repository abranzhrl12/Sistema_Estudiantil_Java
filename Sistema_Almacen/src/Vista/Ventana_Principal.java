/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import FiveCodMover.FiveCodMoverJFrame;

import Vista.Clases.SimpleTitleBar;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GraphicsEnvironment;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class Ventana_Principal extends javax.swing.JFrame {
    
    
    
   Colores_DIA color_ventana = new Colores_DIA();
   Color_Noche nochee=new Color_Noche();
    SimpleTitleBar o = new SimpleTitleBar();
  
   LocalTime horaEspecifica = LocalTime.of(17, 51,15);
    boolean agrandar = false;
    boolean agrandar2 = false;
    int screenWidth;
    int screenHeight;
    int red = 255;
    int green = 255;
    int blue = 255;
    int initialY = 0;
    int threshold = 5;
    int  r=18;
    int g=18;
    int b=18;
    int ancho;
    int alto;

 private Login ventanaLogin; // Mantener una referencia a la ventana de inicio de sesión

    public Ventana_Principal() {
        //fecha actual
        fecha_hora_actual();
        //para cambiar el jframe
        Color rgbColor = new Color(red, green, blue);
        getContentPane().setBackground(rgbColor);
        initComponents();       //esto es lo del constructor no tocar 
        this.setLocationRelativeTo(this); //para centrar la ventana
        capturar_tamaño_jframe();
        o.init(this);
        //color panel lateral
        capturar_color_panel();
        //color panel_boton
        capturar_color_panel_buton();
        colores_botones();
        Ventana_Principal();
        label_logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        updateProgressBar();
        
        progress();
         ventanaLogin = new Login();
        
    }
 private void mostrarVentanaLogin() {
        ventanaLogin.setVisible(true); // Mostrar la ventana de inicio de sesión existente
        this.dispose(); // Cierra la ventana principal actual
    }

     
    private void updateProgressBar() {
        Runtime runtime = Runtime.getRuntime();
        long totalMemory = runtime.totalMemory();
        long freeMemory = runtime.freeMemory();
        long usedMemory = totalMemory - freeMemory;
        long usedMemoryMB = usedMemory / (1024 * 1024);
        // Calcula el porcentaje de memoria utilizada
        int percentage = (int) (usedMemory*10  / totalMemory);
        progresbard.setMinimum(0);
        progresbard.setMaximum(100);
        // Actualiza el valor del JProgressBar
        progresbard.setValue(percentage);
        progresbard.setString(percentage + "%");
        //progresbard.setString(usedMemoryMB + " MB / " + totalMemory + " MB");
        megas.setText(usedMemoryMB + " MB");

    }
   public  int progressValue;
    public void progress(){
     Timer   timer2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateProgressBar();
            }
        });
        timer2.start();

        setVisible(true); 
    
    }
    
    
    
    public void capturar_color_panel() {
        Color color = panel_lateral.getBackground();
        color_ventana.rgb_panel_lateral(color.getRed(), color.getGreen(), color.getBlue());
    }

    public void capturar_color_panel_buton() {
        Color color2 = btn_panel1.getBackground();
        color_ventana.rgb_panel_boton(color2.getRed(), color2.getGreen(), color2.getBlue());
    }
String otra;
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
          String horaEspecificaFormateada = horaEspecifica.format(formatter);
    //metodo para capturar fecha
    public void fecha_hora_actual() {
        Timer timer = new Timer(1000, e -> {
            SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            String horaActual = dateFormat.format(new Date());
            hora.setText("Hora actual: " + horaActual);
            otra=horaActual;
            System.out.println("gf   "+otra);
            System.out.println("nose");
      
            if (otra.equals(horaEspecificaFormateada)) {
                // Realizar la acción deseada cuando la hora actual es igual a las 5:25 PM
                System.out.println("Son las 5:25 PM. Realizar acción 1.");
                Agrandar_formulario();
            } else{
                System.out.println("falta");
            }
       
        });
        timer.start();
         
    }
    
     

    //metodo para saber que color se preciono y cambiar de color panel alado del boton
    public void cambiar_color_panel_precionar_boton(ActionEvent e) {
        if (e.getSource() == btn_equipo) {
            btn_panel1.setBackground(color_ventana.colores_panel_boton());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());
        } else if (e.getSource() == btn_marca) {

            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.colores_panel_boton());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());
        } else if (e.getSource() == btn_modelo) {
            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.colores_panel_boton());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());
        } else if (e.getSource() == btn_pedido) {
            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.colores_panel_boton());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());

        } else if (e.getSource() == btn_proveedor) {
            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.colores_panel_boton());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());

        } else if (e.getSource() == btn_recepcion) {

            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.colores_panel_boton());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.getDefaultColor());

        } else if (e.getSource() == btn_ubicacion) {
            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.colores_panel_boton());
            btn_panel8.setBackground(color_ventana.getDefaultColor());

        } else if (e.getSource() == btn_salida) {
            btn_panel1.setBackground(color_ventana.getDefaultColor());
            btn_panel2.setBackground(color_ventana.getDefaultColor());
            btn_panel3.setBackground(color_ventana.getDefaultColor());
            btn_panel4.setBackground(color_ventana.getDefaultColor());
            btn_panel5.setBackground(color_ventana.getDefaultColor());
            btn_panel6.setBackground(color_ventana.getDefaultColor());
            btn_panel7.setBackground(color_ventana.getDefaultColor());
            btn_panel8.setBackground(color_ventana.colores_panel_boton());

        }
    }

    JPanel glo;

    public void InitContent(JPanel x) {
        x.show();
        x.setSize(contenedor.getSize());
        x.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(x, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

    }

    public void InitContent2(JPanel x, int alto, int ancho) {
        x.show();
        x.setSize(alto, ancho);
        x.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(x, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    //Metodo Colores de los botones menu lateral
    public void colores_botones() {
        //colores de botones
        btn_equipo.setBackground(color_ventana.getDefaultColor());
        btn_marca.setBackground(color_ventana.getDefaultColor());
        btn_modelo.setBackground(color_ventana.getDefaultColor());
        btn_pedido.setBackground(color_ventana.getDefaultColor());
        btn_proveedor.setBackground(color_ventana.getDefaultColor());
        btn_recepcion.setBackground(color_ventana.getDefaultColor());
        btn_ubicacion.setBackground(color_ventana.getDefaultColor());
        btn_salida.setBackground(color_ventana.getDefaultColor());
        //color jpanel alado del boton sin ser selecionado el boton
        btn_panel1.setBackground(color_ventana.getDefaultColor());
        btn_panel2.setBackground(color_ventana.getDefaultColor());
        btn_panel3.setBackground(color_ventana.getDefaultColor());
        btn_panel4.setBackground(color_ventana.getDefaultColor());
        btn_panel5.setBackground(color_ventana.getDefaultColor());
        btn_panel6.setBackground(color_ventana.getDefaultColor());
        btn_panel7.setBackground(color_ventana.getDefaultColor());
        btn_panel8.setBackground(color_ventana.getDefaultColor());
    }
    //colores noche

   /* public void colores_botones2() {
        btn_equipo.setBackground(new Color(red4, green4, blue4));
        btn_marca.setBackground(new Color(red4, green4, blue4));
        btn_modelo.setBackground(new Color(red4, green4, blue4));
        btn_pedido.setBackground(new Color(red4, green4, blue4));
        btn_proveedor.setBackground(new Color(red4, green4, blue4));
        btn_recepcion.setBackground(new Color(red4, green4, blue4));
        btn_ubicacion.setBackground(new Color(red4, green4, blue4));
        btn_salida.setBackground(new Color(red4, green4, blue4));
    }*/

    public void Ventana_Principal() {
        contenedor.removeAll();
        INICIO ve = new INICIO();
        ve.show();
        ve.setSize(contenedor.getSize());
        ve.setLocation(0, 0);
        contenedor.add(ve, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = ve;
        
    }
//Agranada el formulario respetando la barra de tareas

    public void Agrandar_formulario() {
        Rectangle screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        int newWidth = screenBounds.width;
        int newHeight = screenBounds.height;
        this.setSize(new Dimension(newWidth, newHeight));
        agrandar = true;

    }
    public void Agrandar_formulario2() {
        Rectangle screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        int newWidth = screenBounds.width;
        int newHeight = screenBounds.height;
        this.setSize(new Dimension(newWidth, newHeight));
        System.out.println(newWidth);
         System.out.println(   newHeight );
           InitContent2(glo,(newWidth -216), newHeight-90);
        agrandar = true;

    }
          

    public void capturar_tamaño_jframe() {
        Rectangle bounds = this.getBounds();
        screenWidth = bounds.width;
        screenHeight = bounds.height;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fiveCodMoverJDialog1 = new FiveCodMover.FiveCodMoverJDialog();
        fiveCodMoverJFrame1 = new FiveCodMover.FiveCodMoverJFrame();
        jPanel5 = new javax.swing.JPanel();
        lblClose = new javax.swing.JLabel();
        lblMaximize = new javax.swing.JLabel();
        lblMinimize = new javax.swing.JLabel();
        contenedor = new javax.swing.JPanel();
        panel_superior = new javax.swing.JPanel();
        rSPanelCircleImage1 = new rojerusan.RSPanelCircleImage();
        hora = new javax.swing.JLabel();
        dashboard = new javax.swing.JLabel();
        rSButtonCircle1 = new rojerusan.RSButtonCircle();
        progresbard = new rojerusan.RSProgressBarSinText();
        megas = new javax.swing.JLabel();
        megas1 = new javax.swing.JLabel();
        panel_lateral = new javax.swing.JPanel();
        btn_salida = new rojerusan.RSButtonIconI();
        btn_ubicacion = new rojerusan.RSButtonIconI();
        btn_recepcion = new rojerusan.RSButtonIconI();
        btn_proveedor = new rojerusan.RSButtonIconI();
        btn_pedido = new rojerusan.RSButtonIconI();
        btn_modelo = new rojerusan.RSButtonIconI();
        btn_marca = new rojerusan.RSButtonIconI();
        btn_equipo = new rojerusan.RSButtonIconI();
        btn_panel1 = new javax.swing.JPanel();
        btn_panel2 = new javax.swing.JPanel();
        btn_panel3 = new javax.swing.JPanel();
        btn_panel4 = new javax.swing.JPanel();
        btn_panel5 = new javax.swing.JPanel();
        btn_panel6 = new javax.swing.JPanel();
        btn_panel7 = new javax.swing.JPanel();
        btn_panel8 = new javax.swing.JPanel();
        label_logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_salida1 = new rojerusan.RSButtonIconI();
        btn_panel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentMoved(java.awt.event.ComponentEvent evt) {
                formComponentMoved(evt);
            }
        });
        addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                formPropertyChange(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setForeground(new java.awt.Color(16, 0, 43));
        jPanel5.setPreferredSize(new java.awt.Dimension(60, 30));
        jPanel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel5MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jPanel5MouseMoved(evt);
            }
        });
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel5MouseReleased(evt);
            }
        });
        jPanel5.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                jPanel5ComponentHidden(evt);
            }
        });

        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBarra/icons8_multiply_18px_1.png"))); // NOI18N
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblCloseMousePressed(evt);
            }
        });

        lblMaximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBarra/icons8_rectangle_stroked_18px.png"))); // NOI18N
        lblMaximize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMaximizeMousePressed(evt);
            }
        });

        lblMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconosBarra/icons8_minus_18px_1.png"))); // NOI18N
        lblMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblMinimizeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(988, Short.MAX_VALUE)
                .addComponent(lblMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMaximize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClose)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMinimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMaximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(16, 16, 16))
        );

        contenedor.setBackground(new java.awt.Color(235, 238, 245));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 835, Short.MAX_VALUE)
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_superior.setBackground(new java.awt.Color(255, 255, 255));
        panel_superior.setForeground(new java.awt.Color(255, 255, 255));

        rSPanelCircleImage1.setColorBorde(new java.awt.Color(17, 26, 32));
        rSPanelCircleImage1.setColorFondo(new java.awt.Color(17, 26, 32));
        rSPanelCircleImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/348661011_2014891542181807_3082257511315489872_n.jpg"))); // NOI18N
        rSPanelCircleImage1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rSPanelCircleImage1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout rSPanelCircleImage1Layout = new javax.swing.GroupLayout(rSPanelCircleImage1);
        rSPanelCircleImage1.setLayout(rSPanelCircleImage1Layout);
        rSPanelCircleImage1Layout.setHorizontalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        rSPanelCircleImage1Layout.setVerticalGroup(
            rSPanelCircleImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        hora.setBackground(new java.awt.Color(102, 102, 255));
        hora.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        hora.setForeground(new java.awt.Color(51, 51, 255));
        hora.setText("Interface guidelines");

        dashboard.setBackground(new java.awt.Color(102, 102, 255));
        dashboard.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        dashboard.setForeground(new java.awt.Color(51, 51, 255));
        dashboard.setText("Dashboard");

        rSButtonCircle1.setBackground(new java.awt.Color(255, 255, 255));
        rSButtonCircle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/noche (1).png"))); // NOI18N
        rSButtonCircle1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonCircle1ActionPerformed(evt);
            }
        });

        progresbard.setBackground(new java.awt.Color(235, 238, 245));
        progresbard.setValue(1);
        progresbard.setColorBackground(new java.awt.Color(235, 238, 245));
        progresbard.setColorBorde(new java.awt.Color(255, 255, 255));

        megas.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        megas.setForeground(new java.awt.Color(204, 204, 204));
        megas.setText("V1.0");

        megas1.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        megas1.setForeground(new java.awt.Color(204, 204, 204));
        megas1.setText("Memoria");

        javax.swing.GroupLayout panel_superiorLayout = new javax.swing.GroupLayout(panel_superior);
        panel_superior.setLayout(panel_superiorLayout);
        panel_superiorLayout.setHorizontalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_superiorLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(dashboard)
                .addGap(57, 57, 57)
                .addComponent(megas1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(megas)
                    .addComponent(progresbard, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 277, Short.MAX_VALUE)
                .addComponent(rSButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(hora)
                .addGap(6, 6, 6)
                .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        panel_superiorLayout.setVerticalGroup(
            panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(rSPanelCircleImage1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
            .addGroup(panel_superiorLayout.createSequentialGroup()
                .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_superiorLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(rSButtonCircle1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_superiorLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(hora))
                    .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panel_superiorLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(megas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(progresbard, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_superiorLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addGroup(panel_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(dashboard)
                                .addComponent(megas1)))))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        panel_lateral.setBackground(new java.awt.Color(21, 31, 43));

        btn_salida.setBackground(new java.awt.Color(255, 0, 51));
        btn_salida.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 17.png"))); // NOI18N
        btn_salida.setText("Salida");
        btn_salida.setColorHover(new java.awt.Color(17, 27, 33));
        btn_salida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_salida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salidaActionPerformed(evt);
            }
        });

        btn_ubicacion.setBackground(new java.awt.Color(255, 0, 51));
        btn_ubicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 16.png"))); // NOI18N
        btn_ubicacion.setText("Ubicacion");
        btn_ubicacion.setColorHover(new java.awt.Color(17, 27, 33));
        btn_ubicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ubicacionActionPerformed(evt);
            }
        });

        btn_recepcion.setBackground(new java.awt.Color(255, 0, 0));
        btn_recepcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 15.png"))); // NOI18N
        btn_recepcion.setText("Recepccion");
        btn_recepcion.setColorHover(new java.awt.Color(17, 27, 33));
        btn_recepcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_recepcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_recepcionActionPerformed(evt);
            }
        });

        btn_proveedor.setBackground(new java.awt.Color(255, 0, 0));
        btn_proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 14.png"))); // NOI18N
        btn_proveedor.setText("Proveedor");
        btn_proveedor.setColorHover(new java.awt.Color(17, 27, 33));
        btn_proveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proveedorActionPerformed(evt);
            }
        });

        btn_pedido.setBackground(new java.awt.Color(255, 0, 51));
        btn_pedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 13.png"))); // NOI18N
        btn_pedido.setText("Pedido");
        btn_pedido.setColorHover(new java.awt.Color(17, 27, 33));
        btn_pedido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pedidoActionPerformed(evt);
            }
        });

        btn_modelo.setBackground(new java.awt.Color(255, 0, 0));
        btn_modelo.setBorder(null);
        btn_modelo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 12.png"))); // NOI18N
        btn_modelo.setText("Modelo");
        btn_modelo.setColorHover(new java.awt.Color(17, 27, 33));
        btn_modelo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_modelo.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-engranajes-128.png"))); // NOI18N
        btn_modelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_modeloActionPerformed(evt);
            }
        });

        btn_marca.setBackground(new java.awt.Color(255, 0, 51));
        btn_marca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 11.png"))); // NOI18N
        btn_marca.setText("Marca");
        btn_marca.setColorHover(new java.awt.Color(17, 27, 33));
        btn_marca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_marca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_marcaActionPerformed(evt);
            }
        });

        btn_equipo.setBackground(new java.awt.Color(255, 0, 51));
        btn_equipo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Recurso 10.png"))); // NOI18N
        btn_equipo.setText("Estudiantes");
        btn_equipo.setColorHover(new java.awt.Color(17, 27, 33));
        btn_equipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_equipo.setMargin(new java.awt.Insets(2, 0, 3, 0));
        btn_equipo.setName(""); // NOI18N
        btn_equipo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        btn_equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_equipoActionPerformed(evt);
            }
        });

        btn_panel1.setBackground(new java.awt.Color(20, 53, 87));

        javax.swing.GroupLayout btn_panel1Layout = new javax.swing.GroupLayout(btn_panel1);
        btn_panel1.setLayout(btn_panel1Layout);
        btn_panel1Layout.setHorizontalGroup(
            btn_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel1Layout.setVerticalGroup(
            btn_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel2Layout = new javax.swing.GroupLayout(btn_panel2);
        btn_panel2.setLayout(btn_panel2Layout);
        btn_panel2Layout.setHorizontalGroup(
            btn_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel2Layout.setVerticalGroup(
            btn_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel3Layout = new javax.swing.GroupLayout(btn_panel3);
        btn_panel3.setLayout(btn_panel3Layout);
        btn_panel3Layout.setHorizontalGroup(
            btn_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel3Layout.setVerticalGroup(
            btn_panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel4Layout = new javax.swing.GroupLayout(btn_panel4);
        btn_panel4.setLayout(btn_panel4Layout);
        btn_panel4Layout.setHorizontalGroup(
            btn_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel4Layout.setVerticalGroup(
            btn_panel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel5.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel5Layout = new javax.swing.GroupLayout(btn_panel5);
        btn_panel5.setLayout(btn_panel5Layout);
        btn_panel5Layout.setHorizontalGroup(
            btn_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel5Layout.setVerticalGroup(
            btn_panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel6Layout = new javax.swing.GroupLayout(btn_panel6);
        btn_panel6.setLayout(btn_panel6Layout);
        btn_panel6Layout.setHorizontalGroup(
            btn_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel6Layout.setVerticalGroup(
            btn_panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel7.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel7Layout = new javax.swing.GroupLayout(btn_panel7);
        btn_panel7.setLayout(btn_panel7Layout);
        btn_panel7Layout.setHorizontalGroup(
            btn_panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel7Layout.setVerticalGroup(
            btn_panel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btn_panel8.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel8Layout = new javax.swing.GroupLayout(btn_panel8);
        btn_panel8.setLayout(btn_panel8Layout);
        btn_panel8Layout.setHorizontalGroup(
            btn_panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        btn_panel8Layout.setVerticalGroup(
            btn_panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        label_logo.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        label_logo.setForeground(new java.awt.Color(204, 204, 204));
        label_logo.setText("ALMACEN");
        label_logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                label_logoMousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Interface guidelines");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("V1.0");

        btn_salida1.setBackground(new java.awt.Color(255, 0, 51));
        btn_salida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logout.png"))); // NOI18N
        btn_salida1.setColorHover(new java.awt.Color(17, 27, 33));
        btn_salida1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_salida1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_salida1.setInheritsPopupMenu(true);
        btn_salida1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salida1ActionPerformed(evt);
            }
        });

        btn_panel9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout btn_panel9Layout = new javax.swing.GroupLayout(btn_panel9);
        btn_panel9.setLayout(btn_panel9Layout);
        btn_panel9Layout.setHorizontalGroup(
            btn_panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        btn_panel9Layout.setVerticalGroup(
            btn_panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panel_lateralLayout = new javax.swing.GroupLayout(panel_lateral);
        panel_lateral.setLayout(panel_lateralLayout);
        panel_lateralLayout.setHorizontalGroup(
            panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_lateralLayout.createSequentialGroup()
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lateralLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_panel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_lateralLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_salida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panel_lateralLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btn_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panel_lateralLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_lateralLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel2))
                            .addGroup(panel_lateralLayout.createSequentialGroup()
                                .addComponent(label_logo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_lateralLayout.setVerticalGroup(
            panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_lateralLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_logo)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_lateralLayout.createSequentialGroup()
                        .addComponent(btn_panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_panel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_lateralLayout.createSequentialGroup()
                        .addComponent(btn_equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_proveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_recepcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btn_salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panel_lateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salida1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_panel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_lateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_superior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(panel_superior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(panel_lateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed

    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        ancho = contenedor.getHeight();
        alto = contenedor.getWidth();
        InitContent(glo);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseExited

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved

    }//GEN-LAST:event_formMouseMoved

    private void formComponentMoved(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentMoved

    }//GEN-LAST:event_formComponentMoved

    private void jPanel5ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel5ComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5ComponentHidden

    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        FiveCodMoverJFrame.MousePressed(evt);
        initialY = evt.getY();
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseDragged
 FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
        int currentY = evt.getY();
       
        //optiene la resolucion de mi pantalla
        //   Rectangle screenBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
        //int newWidth = screenBounds.width;
        //      int newHeight = screenBounds.height;
        // Obtener posición del JFrame
        int frameX = this.getLocation().x;
        int frameY = this.getLocation().y;
        //top
        int distanceY = this.getY();
 
        // Calcular el tamaño del JFrame para ajustarlo a los límites de la pantalla
     InitContent(glo);
        if (distanceY < threshold) {
            agrandar = true;
            // Realizar acción cuando la distancia a la esquina superior derecha sea menor que el umbral  
            Agrandar_formulario();
       
            // InitContent(this);
            agrandar2 = true;
        }

        if (currentY > initialY && distanceY < 17 && distanceY > 5) {
            // El mouse se ha arrastrado hacia abajo
            this.setSize(screenWidth, screenHeight);
            InitContent2(glo, 836, 567);
            // Puedes realizar acciones adicionales aquí
            agrandar = false;
        }

    }//GEN-LAST:event_jPanel5MouseDragged
 
    private void jPanel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseMoved

    }//GEN-LAST:event_jPanel5MouseMoved
    
    
    Frm_R_Empleado p = new Frm_R_Empleado();

    public void btn_equipo() {
      
     
        p.show();
        p.setSize(contenedor.getSize());
       // p.coloraaa(ree,gee,bluee);
       // p.paneles(255, 255,255);
        p.setLocation(0, 0);
        contenedor.removeAll();
        
        contenedor.add(p, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        dashboard.setText("Equipos");
    glo = p;
    }

    private void btn_equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_equipoActionPerformed

        cambiar_color_panel_precionar_boton(evt);
   
        btn_equipo();

    }//GEN-LAST:event_btn_equipoActionPerformed

    private void btn_marcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_marcaActionPerformed
contenedor.removeAll();
        cambiar_color_panel_precionar_boton(evt);
        Frm_R_Marca marca = new Frm_R_Marca();
        marca.show();
       
        marca.setSize(contenedor.getSize());
       // marca.color(red_noche, green_noche, blue_noche);
        marca.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(marca, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
         glo = marca;
        dashboard.setText("Marca");
    }//GEN-LAST:event_btn_marcaActionPerformed

    private void btn_modeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_modeloActionPerformed
        cambiar_color_panel_precionar_boton(evt);
        Frm_R_Modelo modelo = new Frm_R_Modelo();
        modelo.show();
        glo = modelo;
        modelo.setSize(contenedor.getSize());
        modelo.setLocation(0, 0);
        contenedor.removeAll();
        contenedor.add(modelo, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();

    }//GEN-LAST:event_btn_modeloActionPerformed

    private void btn_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pedidoActionPerformed
        contenedor.removeAll();
        cambiar_color_panel_precionar_boton(evt);
        Frm_R_Pedido ped = new Frm_R_Pedido();
        ped.panel_pedido.show();
        ped.panel_pedido.setSize(contenedor.getSize());
        contenedor.add(ped.panel_pedido, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = ped.panel_pedido;

    }//GEN-LAST:event_btn_pedidoActionPerformed

    private void btn_recepcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_recepcionActionPerformed

        contenedor.removeAll();
        cambiar_color_panel_precionar_boton(evt);
        Frm_R_Recepcion recep = new Frm_R_Recepcion();
        recep.pre.show();
        recep.pre.setSize(contenedor.getSize());
        recep.setLocation(0, 0);
        contenedor.add(recep.pre, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = recep.pre;

    }//GEN-LAST:event_btn_recepcionActionPerformed

    private void btn_salidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salidaActionPerformed
        cambiar_color_panel_precionar_boton(evt);
    

    }//GEN-LAST:event_btn_salidaActionPerformed

    private void btn_proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proveedorActionPerformed
        contenedor.removeAll();
        cambiar_color_panel_precionar_boton(evt);
        Frm_R_Proveedor prove = new Frm_R_Proveedor();
        prove.copr.show();
        prove.copr.setSize(contenedor.getSize());
        prove.setLocation(0, 0);
        contenedor.add(prove.copr, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = prove.copr;
    }//GEN-LAST:event_btn_proveedorActionPerformed
int to=3;
    private void btn_ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ubicacionActionPerformed
        contenedor.removeAll();
        cambiar_color_panel_precionar_boton(evt);
        
        
        Frm_Distribucion distri = new Frm_Distribucion();
        distri.panel_diss.show();
        distri.panel_diss.setSize(contenedor.getSize());
        distri.setLocation(0, 0);
        contenedor.add(distri.panel_diss, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
        glo = distri.panel_diss;
    }//GEN-LAST:event_btn_ubicacionActionPerformed

    private void label_logoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label_logoMousePressed
        Ventana_Principal();
        updateProgressBar();
    }//GEN-LAST:event_label_logoMousePressed

    private void lblCloseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMousePressed
        mostrarVentanaLogin();
       
    }//GEN-LAST:event_lblCloseMousePressed

    private void lblMaximizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMaximizeMousePressed

        if (agrandar == false) {
            System.out.println(agrandar);
            Agrandar_formulario2();
            this.setLocationRelativeTo(o);
               contenedor.getSize();
        int x=contenedor.getWidth();
        int x2=contenedor.getHeight();
        System.out.println(x);
         System.out.println(x2);
 
                //    InitContent(glo);
            agrandar = true;

        } else {
            this.setSize(screenWidth, screenHeight);
        InitContent2(glo, 835, 560);
            this.setLocationRelativeTo(o);
            agrandar = false;
        }
    }//GEN-LAST:event_lblMaximizeMousePressed

    private void lblMinimizeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizeMousePressed
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_lblMinimizeMousePressed

    private void jPanel5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseReleased
        if (agrandar2 == true) {
            this.setLocationRelativeTo(o);
            agrandar2 = false;
        }


    }//GEN-LAST:event_jPanel5MouseReleased

    private void formPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_formPropertyChange

        if (agrandar == true) {
            this.setLocationRelativeTo(o);

            // La variable es igual a myVariable (true o false)
            // Realiza la acción deseada aquí
        } else {
            this.setLocationRelativeTo(o);

        }

    }//GEN-LAST:event_formPropertyChange

    private void rSPanelCircleImage1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSPanelCircleImage1MousePressed
  
       
    }//GEN-LAST:event_rSPanelCircleImage1MousePressed

    private void rSButtonCircle1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonCircle1ActionPerformed
        if(to %2==1){
           
//            p.coloraaa(18, 18, 18);
//            p.paneles(18, 27, 33);
//            p.paneles_segundarios(18, 27, 33);
     
            panel_superior.setBackground(new Color(0,30,54));
            InitContent(p);
            to++;
        }else{
//            p.coloraaa(235, 238, 245);
//            p.paneles(255, 255, 255);
            to++;
        }

    }//GEN-LAST:event_rSButtonCircle1ActionPerformed

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
 
            
    }//GEN-LAST:event_jPanel5MouseClicked

    private void btn_salida1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salida1ActionPerformed
    mostrarVentanaLogin();
    }//GEN-LAST:event_btn_salida1ActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSButtonIconI btn_equipo;
    private rojerusan.RSButtonIconI btn_marca;
    private rojerusan.RSButtonIconI btn_modelo;
    private javax.swing.JPanel btn_panel1;
    private javax.swing.JPanel btn_panel2;
    private javax.swing.JPanel btn_panel3;
    private javax.swing.JPanel btn_panel4;
    private javax.swing.JPanel btn_panel5;
    private javax.swing.JPanel btn_panel6;
    private javax.swing.JPanel btn_panel7;
    private javax.swing.JPanel btn_panel8;
    private javax.swing.JPanel btn_panel9;
    private rojerusan.RSButtonIconI btn_pedido;
    private rojerusan.RSButtonIconI btn_proveedor;
    private rojerusan.RSButtonIconI btn_recepcion;
    private rojerusan.RSButtonIconI btn_salida;
    private rojerusan.RSButtonIconI btn_salida1;
    private rojerusan.RSButtonIconI btn_ubicacion;
    private javax.swing.JPanel contenedor;
    private javax.swing.JLabel dashboard;
    private FiveCodMover.FiveCodMoverJDialog fiveCodMoverJDialog1;
    private FiveCodMover.FiveCodMoverJFrame fiveCodMoverJFrame1;
    private javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel label_logo;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblMaximize;
    private javax.swing.JLabel lblMinimize;
    private javax.swing.JLabel megas;
    private javax.swing.JLabel megas1;
    private javax.swing.JPanel panel_lateral;
    private javax.swing.JPanel panel_superior;
    private rojerusan.RSProgressBarSinText progresbard;
    private rojerusan.RSButtonCircle rSButtonCircle1;
    private rojerusan.RSPanelCircleImage rSPanelCircleImage1;
    // End of variables declaration//GEN-END:variables
}
