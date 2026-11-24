package Array;

import java.util.Arrays; // kinukuha natin yung Arrays class para magamit yung deepToString

public class MultidimensionalArray { // dito mag sstart yung program, pangalan ng class

    public static void main(String[] args) { // ito yung pinaka-start ng program

        // gumagawa tayo ng 2D array, 2 rows at 3 columns, puro names ang laman
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},   // row 1, index 0
                {"David", "Emma", "Frank"}     // row 2, index 1
        };

        // ipapakita yung nasa second row, third column
        // tandaan: nagsisimula sa 0 ang bilang, kaya row 2 = index 1, column 3 = index 2
        System.out.println("Seat in row 2, column 3: " + seats[1][2]);

        // papalitan si Bob ng "Vacant"
        // si Bob ay nasa row 1 (index 0), column 2 (index 1)
        seats[0][1] = "Vacant";

        // ipapakita yung buong array sa isang linya lang
        // deepToString ang gamit kasi 2D array ito, hindi basta toString
        System.out.println("Seating arrangement: " + Arrays.deepToString(seats));
    }
}
