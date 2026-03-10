package SWP2.onlineshop;

public class Kunde_Main {
    public static void main(String[] args) {

        Adresse a1 = new Adresse("7 ", "6406 ", "Oberhofen ", "Zwischenweger ");
        Adresse a2 = new Adresse("3 ", "3829 ", "Seefeld ", "Holzweg ");
        Adresse a3 = new Adresse("89 ", "3928 ", "Zillertal ", "Wasserweg ");
        Adresse a4 = new Adresse("293 ", "9827 ", "Pfaffenhofen ", "Gragge ");

        Kunde k1 = new Kunde("Laurin", "Wett", a1);
        Kunde k2 = new Kunde("Quirin", "Puckl", a2);
        Kunde k3 = new Kunde("Friedrich", "Ogel");



        k1.kundenProfilAnzeigen();


        // Kunde ohne Anschrift erstellen
        Kunde k4 = new Kunde("Simon", "Schober");
        // Anschrift hinzufügen
        k4.setAnschrift(a4);
        k4.kundenProfilAnzeigen();


    }
}
