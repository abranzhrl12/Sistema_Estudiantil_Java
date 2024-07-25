/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import java.awt.Color;

/**
 *
 * @author Abraham
 */
public class Color_Noche {
   
    
Color rgbColor3;//variable del jpanel

int  r=18;
int g=18;
int b=18;
     
    public void rgb_ventas_noche() {

        rgbColor3 = new Color(r, g, b);

    }
    //este metodo se usa para mostrar el color y pueda ser usado para otros panel o boton del jframe (color panel lateral)

    public Color pruebe(){
    return rgbColor3;
    }
    
  public int red(){
  return r;
  }
   public int green(){
  return g;
  }
    public int blue(){
  return b;
  }
}
