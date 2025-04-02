/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.sql.*;

public class NinjaDAO extends Conexion{
    
    public boolean InsertNinja(Ninja n){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Ninja (nombre,rango,aldea) VALUES (?,?,?)";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setString(1, n.getNombre());
            ps.setString(1, n.getRango());
            ps.setString(1, n.getAldea());
            ps.executeUpdate();
            System.out.println("Ninja ingresado de manera exitosa");
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    
}
