
public class O3 {
    public static void main(String[] args) {
        int n = 5;  // Sett verdien av n her (n > 0)
        int fakultet = 1;

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                fakultet *= i;
            }
            System.out.println(n + "! = " + fakultet);
        } else {
            System.out.println("n må være et heltall større enn 0.");
        }
    }
}
