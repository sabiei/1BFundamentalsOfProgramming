package Looping;

import javax.swing.JOptionPane;

public class MuchoDineroJOption {

    public static void main(String[] args) {
        double balance = 20000.00;

        while (true) {
            String input = JOptionPane.showInputDialog(
                    "Balance: P" + balance + "\nEnter amount (0 to stop):");

            if (input == null) {
                break;
            }

            double amount = Double.parseDouble(input);

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
            } else {
                double withdrawal = Math.abs(amount);

                if (withdrawal > balance) {
                    JOptionPane.showMessageDialog(null, "INSUFFICIENT FUNDS!");
                } else {
                    balance -= withdrawal;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "Final balance: P" + balance);
    }
}
