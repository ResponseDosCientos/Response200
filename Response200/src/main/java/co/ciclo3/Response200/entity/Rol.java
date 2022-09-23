package co.ciclo3.Response200.entity;

<<<<<<< HEAD

public class Rol {

    private long idRol;
    private String descripcion;
    private boolean estado;

    public Rol(long idRol, String descripcion, boolean estado) {
        this.idRol = idRol;
        this.descripcion = descripcion;
        this.estado = estado;
    }

    public long getIdRol() {
        return idRol;
    }

    public void setIdRol(long idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "idRol=" + idRol +
                ", descripcion='" + descripcion + '\'' +
                ", estado=" + estado +
                '}';
    }
=======
public enum Rol {
    Administrador, Operario
>>>>>>> cd7278eebb3a1a9a2877b78b0985b7f7791e80f4
}
