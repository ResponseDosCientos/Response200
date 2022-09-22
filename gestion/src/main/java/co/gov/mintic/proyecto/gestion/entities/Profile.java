package co.gov.mintic.proyecto.gestion.entities;

import javax.persistence.*;

import java.util.List;

@Entity
@Table(name="perfiles")
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_profile",nullable = false)
    private long idProfile;
    @javax.validation.constraints.NotEmpty
    @Column(name="nombre",nullable = false)
    private String nombreProfile;

    @Column(name="estado",nullable = false)
    private boolean estadoProfile;

    public Profile(long idProfile, String nombreProfile, boolean estadoProfile) {
        this.idProfile = idProfile;
        this.nombreProfile = nombreProfile;
        this.estadoProfile = estadoProfile;
    }

    public Profile() {

    }

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getNombreProfile() {
        return nombreProfile;
    }

    public void setNombreProfile(String nombreProfile) {
        this.nombreProfile = nombreProfile;
    }

    public boolean isEstadoProfile() {
        return estadoProfile;
    }

    public void setEstadoProfile(boolean estadoProfile) {
        this.estadoProfile = estadoProfile;
    }


    @Override
    public String toString() {
        return "Profile{" +
                "idProfile=" + idProfile +
                ", nombreProfile='" + nombreProfile + '\'' +
                ", estadoProfile=" + estadoProfile +
                '}';
    }
}