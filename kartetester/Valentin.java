package kartetester;

class Valentin extends Karte {

    int kuesse;

    public Valentin(String empfaenger, String sex, int k) {
        super(empfaenger, sex);
        kuesse = k;
    }

    @Override
    public void gruss() {
        System.out.println(anrede + " " + empfaenger + ",\n");
        System.out.println("herzliche Gruesse und Kuesse,\n");
        for (int j = 0; j < kuesse; j++) {
            System.out.print("X");
        }
        System.out.println("\n\n");
    }
}
