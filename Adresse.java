package SWP2.onlineshop;

public class Adresse {

    private String hausnummer;
    private String plz;
    private String stadt;
    private String strasse;

    public Adresse (String hausnummer, String plz, String stadt, String strasse) {
        this.hausnummer = hausnummer;
        this.plz = plz;
        this.stadt = stadt;
        this.strasse = strasse;
    }

    public String getVollständigeAdresse() {
        return plz + stadt + strasse + hausnummer;
    }


}
