package co.ciclo3.Response200.entity;

public class MovimientoDinero {

    private int idMovimiento;

    private double montoMovimiento;

    private String conceptoMovimiento;

    //Variable utilizada para representar el balance general de la empresa
    private double monto;

    //Variable utilizada para representar el usuario que realiza el movimiento
    private String nombreEmpleado;


    //Constructor
    public MovimientoDinero(int idMovimiento, double montoMovimiento, String conceptoMovimiento, Empresa empresa, Empleado empleado) {
        this.idMovimiento = idMovimiento;
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        empresa.setBalance((empresa.getBalance()) + montoMovimiento);
        this.monto = empresa.getBalance();
        this.nombreEmpleado = empleado.getNombreEmpleado();
    }


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

    public double getMonto() { return monto; }

    public String getNombreEmpleado() { return nombreEmpleado; }

    //toString


    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "idMovimiento=" + idMovimiento +
                ", montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", monto=" + monto +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                '}';
    }
}
