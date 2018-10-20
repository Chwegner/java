package haustierfuettern;

public class Hund extends Haustiere {

    public Hund(String name, double futtervorrat) {
        super(name, futtervorrat);
    }

    public void sprich() {
        System.out.println("Wuff!");
    }

    public void friss() {
        futtervorrat -= 1.0;
    }

}
