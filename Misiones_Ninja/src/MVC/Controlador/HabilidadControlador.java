/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import MVC.Modelo.AsignarMision;
import MVC.Modelo.ConsultasDAO;
import MVC.Modelo.Habilidad;
import MVC.Vista.HabilidadVista;
import java.util.Scanner;


public class HabilidadControlador {
    private Habilidad habi;
    private HabilidadVista vista;
    private ConsultasDAO dao;
    private Scanner scanner;

    public HabilidadControlador(Habilidad habi,HabilidadVista vista, ConsultasDAO dao, Scanner scanner) {
        this.habi = habi;
        this.vista = vista;
        this.dao = dao;
        this.scanner = new Scanner(System.in);
    }

    public HabilidadControlador(ConsultasDAO dao, HabilidadVista vista) {
        this.dao = dao;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }
    
    public void iniciar(){
        boolean salir = true;
        while(salir == true){
            System.out.println("------------ ALDEA KANOHA -----------------------");
            System.out.println("1). Ver Ninjas con habilidad");
            System.out.println("2). Mostrar las misiones diponibles de un ninja en especifico.");
            System.out.println("3). Mostrar misiones completadas por un ninja en especifico.");
            System.out.println("4). Asignar mision a un ninja registrando su fecha de inicio");
            System.out.println("5). Marcar una mision completada con su fecha fin");
            System.out.println("6). Mostrar todas la misiones completadas");
            System.out.println("7). Salir");
            int opc = scanner.nextInt();

            switch(opc){
                case 1:
                    vista.mostrarNinjaConHabi(dao.MostrarNinjaConHabili());
                    break;

                case 4:
                    AsignarMision am = vista.asignarMisi();
                    dao.AsignarMision(am);
                    System.out.println("Misión Asignada.");
                    break;
                case 7:
                    salir = false;
                    break;
            }
        }
    }
    
    
}
