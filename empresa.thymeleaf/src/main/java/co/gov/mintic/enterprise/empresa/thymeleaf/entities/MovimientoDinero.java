package co.gov.mintic.enterprise.empresa.thymeleaf.entities;

import javax.persistence.*;

@Entity
@Table(name="Movimientos_Dinero")
public class MovimientoDinero {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_movimiento", nullable = false)
    private int idMovimiento;

    @Column(name = "monto_movimiento", nullable = false)
    private double montoMovimiento;

    @Column(name = "concepto_movimiento", nullable = false)
    private String conceptoMovimiento;

    //Variable utilizada para representar el usuario que realiza el movimiento
    @ManyToOne
    @JoinColumn(name = "id_empleado", nullable = false)
    private Empleado nombreEmpleado;
    //private String nombreEmpleado;

    @ManyToOne
    @JoinColumn(name = "id_empresa", nullable = false)
    private Empresa idEmpresa;


    //Constructor
//    public MovimientoDinero(int idMovimiento, double montoMovimiento, String conceptoMovimiento, Empresa empresa, Empleado empleado) {
//        this.idMovimiento = idMovimiento;
//        this.montoMovimiento = montoMovimiento;
//        this.conceptoMovimiento = conceptoMovimiento;
//        empresa.setBalance((empresa.getBalance()) + montoMovimiento);
//        this.monto = empresa.getBalance();
//        this.nombreEmpleado = empleado.getNombreEmpleado();
//    }


    //Getter and Setter


    public int getIdMovimiento() { return idMovimiento; }

    public void setIdMovimiento(int idMovimiento) { this.idMovimiento = idMovimiento; }

    public double getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(long montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public Empleado getNombreEmpleado() { return nombreEmpleado; }

    public void setNombreEmpleado(Empleado nombreEmpleado) {this.nombreEmpleado = nombreEmpleado;}

    public Empresa getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresa idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    //toString

    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", nombreEmpleado=" + nombreEmpleado +
                ", idEmpresa=" + idEmpresa +
                '}';
    }
}
