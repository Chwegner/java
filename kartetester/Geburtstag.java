package kartetester;

class Geburtstag extends Karte {

    int alter;

    public Geburtstag(String empfaenger, String sex, int jahre) {
        super(empfaenger, sex);
        alter = jahre;
    }

    @Override
    public void gruss() {
        System.out.println(anrede + " " + empfaenger + ",\n");
        System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
    }
}
