/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import MVC.Controlador.HabilidadControlador;
import MVC.Modelo.HabilidadDAO;
import MVC.Vista.HabilidadVista;



public class main {
    public static void main(String[] args) {
        HabilidadDAO dao = new HabilidadDAO();
        HabilidadVista vista = new HabilidadVista();
        HabilidadControlador ctrlHa = new HabilidadControlador(dao,vista);
        
        ctrlHa.iniciar();
    }
    
}
