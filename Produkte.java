package SWP2.onlineshop;

public class Produkte {



    private String produktname;
    private double preis;
    private double ust; // z.B. 1.2 = 20%



    public Produkte(String produktname, double preis, double ust) {
        this.produktname = produktname;
        this.preis = preis;
        this.ust = ust;
    }

    public double getBruttoPreis() {
        double bruttoPreis = preis * ust;
        return bruttoPreis;
    }

    public double getPreis() {
        return preis;
    }

    public double getUst() {
        return ust;
    }


}
