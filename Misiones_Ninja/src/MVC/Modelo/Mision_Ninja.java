/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

public class Mision_Ninja {
    private int id_mision_ninja;
    private int id_ninja;
    private int id_mision;
    private String fecha_inicio;
    private String fecha_fin;

    public Mision_Ninja() {
    }
    
    
    public Mision_Ninja(int id_mision_ninja, int id_ninja, int id_mision, String fecha_inicio, String fecha_fin) {
        this.id_mision_ninja = id_mision_ninja;
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public int getId_mision_ninja() {
        return id_mision_ninja;
    }

    public void setId_mision_ninja(int id_mision_ninja) {
        this.id_mision_ninja = id_mision_ninja;
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

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
    
    
}
