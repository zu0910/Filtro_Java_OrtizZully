/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;


public class Asignacion_mision {
    private int id_asignacion;
    private int id_ninja;
    private int id_mision;
    private String fecha_inicio;

    public Asignacion_mision() {
    }

    public Asignacion_mision(int id_asignacion, int id_ninja, int id_mision, String fecha_inicio) {
        this.id_asignacion = id_asignacion;
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.fecha_inicio = fecha_inicio;
    }

    public int getId_asignacion() {
        return id_asignacion;
    }

    public void setId_asignacion(int id_asignacion) {
        this.id_asignacion = id_asignacion;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    
    
}
