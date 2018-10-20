package haustierfuettern;

public class Katze extends Haustiere {

    public Katze(String name, double futtervorrat) {
        super(name, futtervorrat);
    }

    public void sprich() {
        System.out.println("Miau!");
    }

    public void friss() {
        futtervorrat -= 0.5;
    }

}
