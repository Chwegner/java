package kartetester;

import java.util.Scanner;

public class KarteTester {

    public static void main(String[] args) {
        String name;
        String sex;
        Scanner scan = new Scanner(System.in);
        System.out.println("Ihr Name");
        name = scan.nextLine();
        System.out.println("Ihr Geschlecht");
        sex = scan.nextLine();
        Feiertag feiern = new Feiertag(name, sex);
        feiern.gruss();
        Geburtstag geb = new Geburtstag(name, sex, 21);
        geb.gruss();
        Valentin val = new Valentin(name, sex, 7);
        val.gruss();

    }
}
