package Looping442;

import javax.swing.JOptionPane;

public class HighestLowestJOption {

    public static void main(String[] args) {
        int highest = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number 1:"));
        int lowest = highest;

        for (int i = 2; i <= 10; i++) {
            int num = Integer.parseInt(
                    JOptionPane.showInputDialog("Enter number " + i + ":"));

            if (num > highest) {
                highest = num;
            }
            if (num < lowest) {
                lowest = num;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Highest number: " + highest + "\nLowest number: " + lowest);
    }
}
