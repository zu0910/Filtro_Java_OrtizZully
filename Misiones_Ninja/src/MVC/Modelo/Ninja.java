/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

public class Ninja {
    private int id_ninja;
    private String nombre;
    private String rango;
    private String aldea;

    public Ninja() {
    }
    
    
    public Ninja(int id_ninja, String nombre, String rango, String aldea) {
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.rango = rango;
        this.aldea = aldea;
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

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getAldea() {
        return aldea;
    }

    public void setAldea(String aldea) {
        this.aldea = aldea;
    }
    
    
}
