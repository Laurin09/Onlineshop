package SWP2.onlineshop;

public class Kunde {

    private String vorname;
    private String nachname;
    private Adresse anschrift;



    public Kunde (String vorname, String nachname, Adresse anschrift) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.anschrift = anschrift;

    }

    // Zweiter Konstruktor für Kunde ohne Adresse
    public Kunde(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }


    public void kundenProfilAnzeigen() {
        System.out.println("Kundendaten: ");
        System.out.println("-------------");
        System.out.printf("Vorname: %s\n", vorname);
        System.out.printf("Nachname: %s\n", nachname);
        System.out.printf("Adresse: %s\n", anschrift.getVollständigeAdresse());
    }

    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;
    }

}
