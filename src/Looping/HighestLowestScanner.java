package Looping24;

import java.util.Scanner;

public class HighestLowestScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int highest = sc.nextInt();
        int lowest = highest;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        System.out.println("Highest number: " + highest);
        System.out.println("Lowest number: " + lowest);

        sc.close();
    }
}
