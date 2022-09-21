package co.gov.mintic.proyecto.gestion.entities;

import javax.persistence.*;

@Entity
@Table(name = "empleados")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private long idEmpleado;

    @javax.validation.constraints.NotEmpty
    @Column(name = "nombre_empleado")
    private String nombreEmpleado;
    @Column(name = "email_empleado", unique = true)
    private String emailEmpleado;

    @Enumerated(EnumType.STRING)
    @Column(name = "roleName")
    private Enum_RoleName roleName;
    @Column(name = "estado")
    private boolean estado;;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @OneToOne(mappedBy = "empleado", cascade = CascadeType.ALL)
    private Profile profile;

    @Column(name = "rol")
    private Rol rol;

    //constructor
    /*public Empleado(long idEmpleado, String nombreEmpleado, String emailEmpleado, Empresa empresa, Profile profile, Rol rol) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.emailEmpleado = emailEmpleado;
        this.empresa = empresa;
        this.profile = profile;
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

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }



    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", emailEmpleado='" + emailEmpleado + '\'' +
                ", estado=" + estado +
                ", empresa=" + empresa +
                ", profile=" + profile +
                ", rol=" + rol +
                '}';
    }
}

