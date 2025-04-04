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

        String sql = "SELECT n.id_ninja, n.nombre as nombre_ninja, h.nombre as habilidad, h.descripcion \n" +
                " FROM Ninja n LEFT JOIN Habilidad h ON h.id_ninja = n.id_ninja";

        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Habilidad habi = new Habilidad();
                habi.setId_ninja(rs.getInt("id_ninja"));
                habi.setNombre(rs.getString("nombre"));
                habi.setDescripcion(rs.getString("descripcion"));
                listNinja.add(habi);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return listNinja;

    }



    public List<Mision> MotrarMisionesDisponibles(int idNinja){
        List<Mision> misiones = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();

        String sql = "SELECT * FROM Mision m" +
                "WHERE NOT EXIST (SELECT 1 FROM Mision_Ninja mn WHERE mn.id_mision = m.id_mision)";

        try{
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
              Mision m = new Mision(
                      rs.getInt("id_mision"),
                      rs.getString("descripcion"),
                      rs.getString("rango"),
                      rs.getString("recompensa")
              );
              misiones.add(m);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return misiones;
    }

    public List<AsignarMision> MostrarMisionesCompletadasNinja (int idNinja){
        List<AsignarMision> misiones = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection conec = getConexion();

        String sql = "SELECT * FROM Mision_Ninja WHERE id_ninja = ? AND fecha_fin IS NOT NULL";

        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, idNinja);
            rs = ps.executeQuery();
            while(rs.next()){
                AsignarMision am = new AsignarMision(
                        rs.getString("fecha_inicio"),
                        rs.getInt("id_ninja"),
                        rs.getInt("id_mision")
                );
                am.setFecha_fin(rs.getString("fecha_fin"));
                misiones.add(am);
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return misiones;
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
            System.err.println(e.getMessage());
            return false;
        }
    }

    public boolean CompletarMision (int idNinja, int idMision){
        PreparedStatement ps = null;
        Connection conec = getConexion();
        String sql = "UPDATE Mision_Ninja SET fecha fin = ? WHERE id_ninja = ? AND id_mision = ?";

        try{
            ps = conec.prepareStatement(sql);
            ps.setInt(1, idNinja);
            ps.setInt(2, idMision);
            int rows = ps.executeUpdate();
            if (rows > 0 ){
                System.out.println("Mision marcada como completada.");
                return true;
            }
        }catch (SQLException e){
            System.err.println(e.getMessage());
        }
        return false;
    }

    public List<AsignarMision> MostrarTodosMisionesCompletas() {
        List<AsignarMision> misiones = new ArrayList<>();
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM Mision_Ninja WHERE fecha_fin IS NOT NULL";

        try {
            ps = conec.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AsignarMision am = new AsignarMision(
                        rs.getString("fecha_inicio"),
                        rs.getInt("id_ninja"),
                        rs.getInt("id_mision")
                );
                am.setFecha_fin(rs.getString("fecha_fin"));
                misiones.add(am);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return misiones;
    }
}
