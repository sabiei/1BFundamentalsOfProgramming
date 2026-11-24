package Array;

public class OneDiamensionalArray { // dito nagsisimula yung class, pangalan ng program

    public static void main(String[] args) { // ito yung pinaka-start ng program

        // gumagawa tayo ng array na kaya mag-hold ng 5 na double
        double[] temperatures = new double[5];

        // nilalagay natin yung values isa-isa gamit yung index
        temperatures[0] = 32.5; // day 1, index 0
        temperatures[1] = 34.0; // day 2, index 1
        temperatures[2] = 31.8; // day 3, index 2
        temperatures[3] = 33.2; // day 4, index 3
        temperatures[4] = 35.1; // day 5, index 4

        // for loop para ipakita lahat ng temperature
        // ginagamit natin yung .length para malaman kung ilan lahat
        for (int i = 0; i < temperatures.length; i++) {
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // papalitan natin yung temperature ng third day
        // from 31.8 papuntang 32.0, index 2 pa rin
        temperatures[2] = 32.0;

        // ipapakita yung bagong temperature ng third day
        System.out.println("Updated temperature for day 3: " + temperatures[2]);
    }
}
