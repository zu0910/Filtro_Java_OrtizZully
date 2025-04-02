/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class Conexion {
    Connection conec = null;
    
    private String URL = "jdbc:mysql://bbatmzfqkyi5r7qydwon-mysql.services.clever-cloud.com:3306/bbatmzfqkyi5r7qydwon";
    private String USER = "bbatmzfqkyi5r7qydwon";
    private String PASS = "oV1zkNSt7p9tawK7AHV0"; 
    
    public Connection getConexion(){
        try{
            conec = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("La conexion con la base de datos fue un exito");
        }catch(SQLException e){
            System.out.println("Error de conexion con la base de datos" + e.getMessage());
        }
        return conec;
    }
    
}
