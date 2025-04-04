/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import  MVC.Modelo.*;
import MVC.Vista.HabilidadVista;
import java.util.Scanner;


public class HabilidadControlador {
    private HabilidadVista vista;
    private ConsultasDAO dao;
    private Scanner scanner;

    public HabilidadControlador(HabilidadVista vista, ConsultasDAO dao, Scanner scanner) {
        this.vista = vista;
        this.dao = dao;
        this.scanner = new Scanner(System.in);
    }


    
    public void iniciar(){
        boolean salir = true;
        while(salir == true){
            System.out.println("------------ ALDEA KANOHA -----------------------");
            System.out.println("1). Listar todos los  Ninjas con su habilidad");
            System.out.println("2). Mostrar las misiones diponibles de un ninja.");
            System.out.println("3). Mostrar misiones completadas para un ninja.");
            System.out.println("4). Asignar mision a un ninja.");
            System.out.println("5). Marcar una mision completada.");
            System.out.println("6). Mostrar todas la misiones completadas");
            System.out.println("7). Salir");
            System.out.println("Seleccione una de las opciones del menu: ");
            int opc = scanner.nextInt();

            switch(opc){
                case 1:
                    vista.mostrarNinjaConHabi(dao.MostrarNinjaConHabili());
                    break;

                case 2:
                    System.out.println("ID del ninja: ");
                    int idN = scanner.nextInt();
                    vista.mostrarMisionesDisponibles(dao.MotrarMisionesDisponibles(idN));
                    break;

                case 3:
                    System.out.println("ID del ninja: ");
                    idN = scanner.nextInt();
                    vista.mostrarMisionesCompletadas(dao.MostrarMisionesCompletadasNinja(idN));
                    break;
                case 4:
                    AsignarMision am = vista.asignarMisi();
                    dao.AsignarMision(am);
                    System.out.println("Misión Asignada.");
                    break;

                case 5:
                    System.out.println("ID del ninja: ");
                    int IDn = scanner.nextInt();
                    System.out.println("ID de la mision: ");
                    int IDm = scanner.nextInt();
                    dao.CompletarMision(IDn, IDm);
                    break;

                case 6:
                    vista.mostrarMisionesCompletadas(dao.MostrarTodosMisionesCompletas());
                    break;
                case 7:
                    salir = false;
                    System.out.println("Byw!!!");
                    break;
            }
        }
    }
    
    
}
