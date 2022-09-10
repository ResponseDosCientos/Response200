package co.ciclo3.Response200.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "profiles")
public class Profile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_profile", nullable = false)
    private long idProfile;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "estado")
    private boolean estado;

    @Column(name = "create_At")
    private Date createAt;

    @Column(name = "update_At")
    private Date updateAt;

//    public Profile(long idProfile, String phone, boolean estado) {
//        this.idProfile = idProfile;
//        this.phone = phone;
//        this.estado = estado;
//    }

    public long getIdProfile() {
        return idProfile;
    }

    public void setIdProfile(long idProfile) {
        this.idProfile = idProfile;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    //ToString

    @Override
    public String toString() {
        return "Profile{" +
                "idProfile=" + idProfile +
                ", phone='" + phone + '\'' +
                ", estado=" + estado +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
