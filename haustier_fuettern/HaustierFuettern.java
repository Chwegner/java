package haustierfuettern;

public class HaustierFuettern {

    public static void main(String[] args) {
        String name;
        double futtervorrat;

        Katze minkaKatze = new Katze("Minka", 5.0);
        minkaKatze.fuettern();
        minkaKatze.anzeigen();

        Hund belloHund = new Hund("Strolchie", 5.0);
        belloHund.fuettern();
        belloHund.anzeigen();

    }

}
