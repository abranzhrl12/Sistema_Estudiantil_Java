
package Modelo;


public class Turno {
     private String cod_Turno;
    private String nombre;
    private String hora_Inicio;
    private String hora_Fin;

    public Turno(String cod_Turno, String nombre, String hora_Inicio, String hora_Fin) {
        this.cod_Turno = cod_Turno;
        this.nombre = nombre;
        this.hora_Inicio = hora_Inicio;
        this.hora_Fin = hora_Fin;
    }

    public String getCod_Turno() {
        return cod_Turno;
    }

    public void setCod_Turno(String cod_Turno) {
        this.cod_Turno = cod_Turno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora_Inicio() {
        return hora_Inicio;
    }

    public void setHora_Inicio(String hora_Inicio) {
        this.hora_Inicio = hora_Inicio;
    }

    public String getHora_Fin() {
        return hora_Fin;
    }

    public void setHora_Fin(String hora_Fin) {
        this.hora_Fin = hora_Fin;
    }
}
