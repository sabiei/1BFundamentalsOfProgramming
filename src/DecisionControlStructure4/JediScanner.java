package DecisionControlStructure4;

import java.util.Scanner;

public class JediScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship code (C/N): ");
        char citizen = sc.next().toUpperCase().charAt(0);

        System.out.print("Enter recommendee code (R/N): ");
        char recommendee = sc.next().toUpperCase().charAt(0);

        if (recommendee == 'R') {
            System.out.println("Result: ACCEPTED (recommended by Jedi Master Obi Wan)");
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            System.out.println("Result: ACCEPTED");
        } else {
            System.out.println("Result: REJECTED");
        }

        sc.close();
    }
}
