public class O2 {
    public static void main(String[] args) {
        double bruttoinntekt = 1350001;  // Sett bruttoinntekten her
        double trinnskatt = 0;

        if (bruttoinntekt <= 208050) {
            trinnskatt = 0;
        } else if (bruttoinntekt <= 292850) {
            trinnskatt = (bruttoinntekt - 208050) * 0.017;
        } else if (bruttoinntekt <= 670000) {
            trinnskatt = (292850 - 208050) * 0.017 + (bruttoinntekt - 292850) * 0.04;
        } else if (bruttoinntekt <= 937900) {
            trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (bruttoinntekt - 670000) * 0.136;
        } else if (bruttoinntekt <= 1350000) {
            trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (bruttoinntekt - 937900) * 0.166;
        } else {
            trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (1350000 - 937900) * 0.166 + (bruttoinntekt - 1350000) * 0.176;
        }

        System.out.printf("Trinnskatt: %.2f", trinnskatt);
    }
}
