package co.ciclo3.Response200.entity;

public class MovimientoDinero {

    private double montoMovimiento;

    private String conceptoMovimiento;



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


    @Override
    public String toString() {
        return "MovimientoDinero{" +
                "montoMovimiento=" + montoMovimiento +
                ", conceptoMovimiento='" + conceptoMovimiento + '\'' +
                '}';
    }

    public double montoPositivoNegativo(){
        return -1;
    }

    public String usuario(){
        return "user";
    }
}
