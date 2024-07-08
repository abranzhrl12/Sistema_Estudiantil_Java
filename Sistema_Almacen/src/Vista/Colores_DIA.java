/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;
import sun.jvm.hotspot.utilities.RBColor;

/**
 *
 * @author Abraham
 * 
 * colores: iconos #454444
 * 
 */

public class Colores_DIA {
    
 public static final int DAY_BACKGROUND_R = 255;
public static final int DAY_BACKGROUND_G = 255;
 public static final int DAY_BACKGROUND_B = 255;
    
    public static Color currentBackgroundColor = new Color(DAY_BACKGROUND_R, DAY_BACKGROUND_G, DAY_BACKGROUND_B);
     
    
    public static void setDayMode() {
        currentBackgroundColor = new Color(DAY_BACKGROUND_R, DAY_BACKGROUND_G, DAY_BACKGROUND_B);
     
    }

    
   public static  Color rgbColor;//variable del jpanel
   
   
 
   public static  Color rgbColor_p_boton;
     // Este metodo trae el color del Panel lateral y lo alamcena en una variable color para usarlo
   
   
   public static void rgb_panel_lateral(int a, int b, int c) {

        rgbColor = new Color(a, b, c);

    }
    //este metodo se usa para mostrar el color y pueda ser usado para otros panel o boton del jframe (color panel lateral)

    public Color getDefaultColor() {
        return rgbColor;
    }
    //Este metodo es para color paneles alado del boton como efecto de selecionado

    public void rgb_panel_boton(int ap, int bp, int cp) {

        rgbColor_p_boton = new Color(ap, bp, cp);

    }
     public Color colores_panel_boton() {
        return rgbColor_p_boton ;
    }
     
     
}
