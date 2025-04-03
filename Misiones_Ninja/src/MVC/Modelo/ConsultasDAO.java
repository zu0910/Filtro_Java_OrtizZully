package MVC.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConsultasDAO extends Conexion {

    public boolean InsertHabilidad(Habilidad h) {
        PreparedStatement ps = null;
        Connection conec = getConexion();

        String sql = "INSERT INTO Habilidad (id_ninja,nombre,descripcion) VALUES (?,?,?)";

        try {
            ps = conec.prepareStatement(sql);
            ps.setInt(1, h.getId_ninja());
            ps.setString(2, h.getNombre());
            ps.setString(3, h.getDescripcion());
            ps.executeUpdate();
            System.out.println("Habilidad del ninja ingresado de manera exitosa");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<Habilidad> MostrarNinjaConHabili() {
        List<Habilidad> listNinja = new ArrayList<>();

        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();

        String sql = "SELECT n.nombre as nombre_Ninja, h.nombre as Habilidad from Ninja n " +
                "join Habilidad h on h.id_habilidad= n.id_ninja";

        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habilidad habi = new Habilidad();
                habi.setId_habilidad(rs.getInt("id_habilidad"));
                habi.setId_ninja(rs.getInt("id_ninja"));
                habi.setNombre(rs.getString("nombre"));
                habi.setDescripcion(rs.getString("descripcion"));

            }
        } catch (SQLException e) {
            System.err.println(e);
        }
        return listNinja;

    }

    public boolean AsignarMision(AsignarMision am){
        PreparedStatement ps = null;
        Connection con = getConexion();

        String sql = "INSERT INTO Mision_Ninja (id_ninja, id_mision, fecha_inicio) VALUES (?,?,?)";

        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1,am.getId_ninja());
            ps.setInt(2,am.getId_mision());
            ps.setString(3, am.getFecha_inicio());
            ps.executeQuery();
            System.out.println("Mision ingresada con exito.");
            return true;
        }catch (SQLException e) {
            System.err.println(e);
            return false;
        }
    }
}
