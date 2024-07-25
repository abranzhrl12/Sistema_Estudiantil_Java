
package Modelo;


public class ProgramaEstudio {
    private String cod_Programa;
    private String nombre;

    public ProgramaEstudio(String cod_Programa, String nombre) {
        this.cod_Programa = cod_Programa;
        this.nombre = nombre;
    }

    public String getCod_Programa() {
        return cod_Programa;
    }

    public void setCod_Programa(String cod_Programa) {
        this.cod_Programa = cod_Programa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
