/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Controlador;

import MVC.Modelo.Habilidad;
import MVC.Modelo.HabilidadDAO;
import MVC.Vista.HabilidadVista;
import java.util.Scanner;


public class HabilidadControlador {
    private Habilidad habi;
    private HabilidadVista vista;
    private HabilidadDAO dao;
    private Scanner scanner;

    public HabilidadControlador(Habilidad habi,HabilidadVista vista, HabilidadDAO dao, Scanner scanner) {
        this.habi = habi;
        this.vista = vista;
        this.dao = dao;
        this.scanner = new Scanner(System.in);
    }

    public HabilidadControlador(HabilidadDAO dao, HabilidadVista vista) {
        this.dao = dao;
        this.vista = vista;
        this.scanner = new Scanner(System.in);
    }
    
    public void iniciar(){
        boolean salir = true;
        while(salir == true){
            System.out.println("Menu");
            System.out.println("1.) Ver Ninjas con habilidad");
            System.out.println("2. Mostrar las misiones diponibles.");
            System.out.println("3. Asignar una mision completa de un ninja");
            System.out.println("4. Asignar mision a un ninja");
            System.out.println("5.). Salir");
            int opc = scanner.nextInt();
            
            switch(opc){
                case 1:
                    vista.mostrarNinjaConHabi(dao.MostrarNinjaConHabili());
                    break;
                case 5: 
                    salir = false;
                    break;
            }
        }
    }
    
    
}
