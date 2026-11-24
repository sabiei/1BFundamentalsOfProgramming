package Looping;

import java.util.Scanner;

public class MuchoDineroScanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 20000.00;

        System.out.println("Initial balance: P" + balance);

        while (true) {
            System.out.print("Enter amount (0 to stop): ");
            double amount = sc.nextDouble();

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
            } else {
                double withdrawal = Math.abs(amount);

                if (withdrawal > balance) {
                    System.out.println("INSUFFICIENT FUNDS!");
                } else {
                    balance -= withdrawal;
                }
            }

            System.out.println("Outstanding balance: P" + balance);
        }

        System.out.println("Final balance: P" + balance);
        sc.close();
    }
}
