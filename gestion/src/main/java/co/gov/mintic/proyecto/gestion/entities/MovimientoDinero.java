package co.gov.mintic.proyecto.gestion.entities;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="movimientos")
public class MovimientoDinero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento", nullable = false)
    private long idMovimientoDinero;

    @Column(name = "monto", nullable = false)
    private float montoMovimiento;
    //     @javax.validation.constraints.NotEmpty
    @Column(name = "concepto", nullable = false)
    private String conceptoMovimiento;
    @ManyToOne
    @JoinColumn(name = "nombreEmpleado")
    private Empleado empleado;

    @ManyToOne
    @JoinColumn(name = "nombreEmpresa")
    private Empresa empresa;

    //@ManyToOne
    //@JoinColumn (name= "id_profile")
    //private Profile profile;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name= "fecha",nullable = false)
    private Date fecha;

    public MovimientoDinero(long idMovimientoDinero, float montoMovimiento, String conceptoMovimiento, Empleado empleado, Empresa empresa,  Date fecha) {
        this.idMovimientoDinero = idMovimientoDinero;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        this.empleado = empleado;
        this.empresa = empresa;
        this.fecha = fecha;
    }

    public MovimientoDinero() {

    }

    public long getIdMovimientoDinero() {
        return idMovimientoDinero;
    }

    public void setIdMovimientoDinero(long idMovimientoDinero) {
        this.idMovimientoDinero = idMovimientoDinero;
    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimientoDinero=" + idMovimientoDinero +
                ", montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", empleado=" + empleado +
                ", empresa=" + empresa +
                ", fecha=" + fecha +
                '}';
    }
}
