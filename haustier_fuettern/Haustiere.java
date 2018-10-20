package haustierfuettern;

public abstract class Haustiere {

    String name;
    double futtervorrat;
    int anzahlTage;

    public Haustiere(String name, double futtervorrat) {
        this.name = name;
        this.futtervorrat = futtervorrat;
    }

    public void fuettern() {
        sprich();
        while (futtervorrat > 0) {
            System.out.println(name + ": " + futtervorrat);
            anzahlTage++;
            friss();
        }
    }

    public void anzeigen() {
        System.out.println("Der Vorrat für " + name + " reicht " + anzahlTage + " Tage.\n");
    }

    public abstract void friss();

    public abstract void sprich();

}
