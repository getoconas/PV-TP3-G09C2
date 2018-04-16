package punto10;

/**/

public class Cuota {
    private int numeroCuota;
    private double precioCuota;
    
    public Cuota() {
        
    }

    public Cuota(int numeroCuota, double precioCuota) {
        this.numeroCuota = numeroCuota;
        this.precioCuota = precioCuota;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getPrecioCuota() {
        return precioCuota;
    }

    public void setPrecioCuota(double precioCuota) {
        this.precioCuota = precioCuota;
    }
}
