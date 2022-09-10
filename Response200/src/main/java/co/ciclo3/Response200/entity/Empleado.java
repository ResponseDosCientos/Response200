package co.ciclo3.Response200.entity;

public class Empleado {

    private long idEmpleado;
    private String nombreEmpleado;
    private String emailEmpleado;
    private Empresa empresa;
    private Profile profile;

    private Rol rol;
/*
    //constructor
    public Empleado(long idEmpleado, String nombreEmpleado, String emailEmpleado, String empresa, Rol rol) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.empresa = empresa;
        this.rol = rol;
    }
*/
    //setter and getter
    public long getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(long idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getEmailEmpleado() {
        return emailEmpleado;
    }

    public void setEmailEmpleado(String emailEmpleado) {
        this.emailEmpleado = emailEmpleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Profile getRol() {
        return profile;
    }


    public void setRol(Profile profile) {
        this.profile = profile;
    }



    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", emailEmpleado='" + emailEmpleado + '\'' +
                ", empresa=" + empresa +
                ", rol=" + profile +
                '}';
    }
}
