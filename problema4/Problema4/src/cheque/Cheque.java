package cheque;

public class Cheque {

    private String nomC, nomB;
    private double vC, cB;

    public Cheque(String nomC, String nomB, double vC) {
        this.nomC = nomC;
        this.nomB = nomB;
        this.vC = vC;
    }

    public Cheque(String nomC, double vC) {
        this.nomC = nomC;
        this.vC = vC;
        nomB = "Banco Guayaquil";
    }

    public String getNomC() {
        return nomC;
    }

    public void setNomC(String nomC) {
        this.nomC = nomC;
    }

    public String getNomB() {
        return nomB;
    }

    public void setNomB(String nomB) {
        this.nomB = nomB;
    }

    public double getvC() {
        return vC;
    }

    public void setvC(double vC) {
        this.vC = vC;
    }

    public double getcB() {
        return cB;
    }

    public void calcularcB() {
        cB = (0.00003 * vC);
    }

    @Override
    public String toString() {
        return "Nombre del cliente: " + nomC + "\n"
                + "Banco : " + nomB + "\n"
                + "Valor del cheque: " + vC + "\n"
                + "Comision del banco: " + cB + "\n";
    }

}
