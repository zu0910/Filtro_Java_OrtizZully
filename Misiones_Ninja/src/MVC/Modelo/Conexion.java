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
    
    private String URL = "jdbc:mysql://bp2tsdrszqtecvanylaf-mysql.services.clever-cloud.com:3306/bp2tsdrszqtecvanylaf ";
    private String USER = "uvq0focmyet9szkh";
    private String PASS = "ZxcFNXlh9BHA7FtpWWjT";
    
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
