
public class O1 {
    public static void main(String[] args) {
        int score = 85;  // Sett poengsummen her

        if (score > 100 || score < 0) {
            System.out.println("Ugyldig poengsum! Vennligst oppgi en poengsum mellom 0 og 100.");
        } else if (score >= 90) {
            System.out.println("Karakter: A");
        } else if (score >= 80) {
            System.out.println("Karakter: B");
        } else if (score >= 60) {
            System.out.println("Karakter: C");
        } else if (score >= 50) {
            System.out.println("Karakter: D");
        } else if (score >= 40) {
            System.out.println("Karakter: E");
        } else {
            System.out.println("Karakter: F");
        }
    }
}
