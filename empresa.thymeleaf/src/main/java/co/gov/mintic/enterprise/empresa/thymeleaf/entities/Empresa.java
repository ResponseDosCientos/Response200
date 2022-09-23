package co.gov.mintic.enterprise.empresa.thymeleaf.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Empresas")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_empresa", nullable = false)
    private long idEmpresa;
    @Column(name = "nit_empresa", nullable = false)
    private long nitEmpresa;
    @Column(name = "nombre_empresa", nullable = false)
    private String nomEmpresa;
    @Column(name = "direccion_empresa", nullable = false)
    private String dirEmpresa;
    @Column(name = "telefono_empresa", nullable = false)
    private int telEmpresa;

    @OneToMany(mappedBy = "empresa")
    private List<Empleado> listaEmpleados;

    @Column(name = "balance")
    private double balance;

    //Constructor
    /*
    public Empresa(long nitEmpresa, String nomEmpresa, String dirEmpresa, int telEmpresa, double balance) {
        this.nitEmpresa = nitEmpresa;
        this.nomEmpresa = nomEmpresa;
        this.dirEmpresa = dirEmpresa;
        this.telEmpresa = telEmpresa;
        this.balance = balance;
    }
*/
    //setters and getters

    public long getIdEmpresa() { return idEmpresa; }

    public void setIdEmpresa(long idEmpresa) { this.idEmpresa = idEmpresa; }

    public long getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(long nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }

    public String getNomEmpresa() {
        return nomEmpresa;
    }

    public void setNomEmpresa(String nomEmpresa) {
        this.nomEmpresa = nomEmpresa;
    }

    public String getDirEmpresa() {
        return dirEmpresa;
    }

    public void setDirEmpresa(String dirEmpresa) {
        this.dirEmpresa = dirEmpresa;
    }

    public int getTelEmpresa() {
        return telEmpresa;
    }

    public void setTelEmpresa(int telEmpresa) {
        this.telEmpresa = telEmpresa;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void addEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);
    }

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }


    //toString

    @Override
    public String toString() {
        return "Empresa{" +
                "idEmpresa=" + idEmpresa +
                ", nitEmpresa=" + nitEmpresa +
                ", nomEmpresa='" + nomEmpresa + '\'' +
                ", dirEmpresa='" + dirEmpresa + '\'' +
                ", telEmpresa=" + telEmpresa +
                ", balance=" + balance +
                '}';
    }
}

