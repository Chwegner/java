package kartetester;

abstract class Karte {
    
    String empfaenger;
    String anrede;
    String sex;
    
    Karte(String empfaenger, String sex) {
        this.empfaenger = empfaenger;
        if (sex.equals("w")) {
            anrede = "Liebe";
        } else {
            anrede = "Lieber";
        }
        
    }
    
    public abstract void gruss();
}
