/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC;

import MVC.Controlador.HabilidadControlador;
import MVC.Modelo.Conexion;
import MVC.Modelo.ConsultasDAO;
import MVC.Vista.HabilidadVista;



public class main {
    public static void main(String[] args) {
        ConsultasDAO dao = new ConsultasDAO();
        HabilidadVista vista = new HabilidadVista();
        HabilidadControlador ctrlHa = new HabilidadControlador(dao,vista);

        ctrlHa.iniciar();
        Conexion con = new Conexion();
        con.getConexion();
    }
    
}
