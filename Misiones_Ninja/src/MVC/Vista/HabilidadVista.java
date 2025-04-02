/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Vista;

import MVC.Modelo.Habilidad;
import java.util.List;


public class HabilidadVista {
    public void mostrarNinjaConHabi(List<Habilidad> habi){
        System.out.println("Lista de Ninjas con sus habilidades");
        for(Habilidad h: habi){
            System.out.println(h);
        }
    }
}
