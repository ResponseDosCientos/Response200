package co.ciclo3.Response200.entity;

public class MovimientoDinero {

    private double montoMovimiento;

    private String conceptoMovimiento;

    //es el monto del balance general de la empresa
    private double monto;

    private String nombreEmpleado;


    //Constructor
    public MovimientoDinero(double montoMovimiento, String conceptoMovimiento, Empresa empresa, Empleado empleado) {
        this.montoMovimiento = montoMovimiento;
        this.conceptoMovimiento = conceptoMovimiento;
        //this.monto = empresa.getBalance() + montoMovimiento;
        this.nombreEmpleado = empleado.getNombreEmpleado();
    }


    //Getter and Setter
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


    //toString


    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                ", monto=" + monto +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                '}';
    }




}
