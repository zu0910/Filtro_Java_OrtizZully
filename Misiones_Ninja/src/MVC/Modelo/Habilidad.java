/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

public class Habilidad {
    private int id_habilidad;
    private int id_ninja;
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    
    public Habilidad(int id_habilidad, int id_ninja, String nombre, String descripcion) {
        this.id_habilidad = id_habilidad;
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_habilidad() {
        return id_habilidad;
    }

    public void setId_habilidad(int id_habilidad) {
        this.id_habilidad = id_habilidad;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
