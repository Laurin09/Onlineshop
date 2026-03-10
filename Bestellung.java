package SWP2.onlineshop;

import java.util.ArrayList;

public class Bestellung {


    private int bestellNummer;
    private Kunde kunde;
    private ArrayList<Produkte> warenkorb;


    public Bestellung(int bestellNummer, Kunde kunde) {
        this.bestellNummer = bestellNummer;
        this.kunde = kunde;
        this.warenkorb = new ArrayList<>();
    }

    // Produkt hinzufügen
    public void produktHinzufuegen(Produkte p) {
        this.warenkorb.add(p);
    }

    // Rechnung drucken
    public void rechnungDrucken() {
        System.out.println("Rechnung NR: " + bestellNummer);
        kunde.kundenProfilAnzeigen();
        System.out.println("---------------------------");


        double gSumme = 0;
        // alle Produkte zusammenzählen
        for (Produkte p : warenkorb) {
            gSumme += p.getBruttoPreis();
        }

        System.out.println("Gesamtpreis: " + gSumme);

    }
}
