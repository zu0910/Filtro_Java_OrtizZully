package MVC.Modelo;

public class AsignarMision {
    private int id_mision_ninja;
    private String fecha_inicio;
    private String fecha_fin;
    private int id_ninja;
    private int id_mision;

    public AsignarMision(String fecha_inicio, int id_ninja, int id_mision) {
        this.fecha_inicio = fecha_inicio;
        this.id_ninja = id_ninja;
        this.id_mision = id_mision;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public int getId_ninja() {
        return id_ninja;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public int getId_mision() {
        return id_mision;
    }

    public void setId_mision(int id_mision) {
        this.id_mision = id_mision;
    }

    public int getId_mision_ninja() {
        return id_mision_ninja;
    }

    public void setId_mision_ninja(int id_mision_ninja) {
        this.id_mision_ninja = id_mision_ninja;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
