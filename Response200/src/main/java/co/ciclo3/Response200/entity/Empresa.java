package co.ciclo3.Response200.entity;

public class Empresa {

    private long nitEmpresa;
    private String nomEmpresa;
    private String dirEmpresa;
    private int telEmpresa;
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

    public double getBalance() { return balance; }

    public void setBalance(double balance) { this.balance = balance; }


    //toString
    @Override
    public String toString() {
        return "Empresa{" +
                "nitEmpresa=" + nitEmpresa +
                ", nomEmpresa='" + nomEmpresa + '\'' +
                ", dirEmpresa='" + dirEmpresa + '\'' +
                ", telEmpresa=" + telEmpresa +
                ", balance=" + balance +
                '}';
    }
}

