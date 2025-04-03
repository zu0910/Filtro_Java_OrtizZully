/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Vista;

import MVC.Modelo.AsignarMision;
import MVC.Modelo.Habilidad;
import java.util.List;
import java.util.Scanner;

public class HabilidadVista {

    Scanner teclado = new Scanner(System.in);

    public void mostrarNinjaConHabi(List<Habilidad> habi){
        System.out.println("Lista de Ninjas con sus habilidades");
        for(Habilidad h: habi){
            System.out.println(h);
        }
    }

    public AsignarMision asignarMisi(){
        System.out.println("Ingresa los datos para asignar la mision: ");
        System.out.println("Id del ninja: ");
        int IdN = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Id de la mision: ");
        int IdM = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Fecha de inicio: ");
        teclado.nextLine();
        String fechaI = teclado.nextLine();
        return new AsignarMision(fechaI, IdN, IdM);

    }
}
