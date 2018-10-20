package kartetester;

class Feiertag extends Karte {

    public Feiertag(String empfaenger, String sex) {
        super(empfaenger, sex);
    }

    public void gruss() {
        System.out.println(anrede + " " + empfaenger + ",\n");
        System.out.println("frohe Feiertage!\n\n");
    }
}
