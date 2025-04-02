/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MVC.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

public class HabilidadDAO extends Conexion{
    public boolean InsertHabilidad(Habilidad h){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        
        String sql = "INSERT INTO Habilidad (id_ninja,nombre,descripcion) VALUES (?,?,?)";
        
        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, h.getId_ninja());
            ps.setString(1, h.getNombre());
            ps.setString(1, h.getDescripcion());
            ps.executeUpdate();
            System.out.println("Habilidad del ninja ingresado de manera exitosa");
            return true;
        } catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }
    
    public List<Habilidad> MostrarNinjaConHabili(){
        List<Habilidad> list = new ArrayList<>();
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();
        
        String sql = "SELECT n.nombre as nombre_Ninja, h.nombre as Habilidad from Ninja n " +
        "join Habilidad h on h.id_habilidad = n.id_ninja";
        
        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while (rs.next()){
                Habilidad habi = new Habilidad();
                habi.setId_habilidad(rs.getInt("id_habilidad"));
                habi.setId_ninja(rs.getInt("id_ninja"));
                habi.setNombre(rs.getString("nombre"));
                habi.setDescripcion(rs.getString("descripcion"));
            }
        }catch(SQLException e){
            System.err.println(e);
        }
        return list;
        
    }
    
    
}
