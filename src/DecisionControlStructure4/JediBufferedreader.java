package DecisionControlStructure4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class JediBufferedreader {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C/N): ");
        char citizen = br.readLine().trim().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = br.readLine().trim().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Result: ACCEPTED (recommended by Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }
    }
}

