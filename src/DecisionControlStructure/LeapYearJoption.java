package DecisionControlStructure;

import javax.swing.*;

public class LeapYearJoption {
    static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Enter a year:");
        int year = Integer.parseInt(input);

        String result;
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            result = year + " is a LEAP YEAR.";
        } else {
            result = year + " is NOT a leap year.";
        }

        JOptionPane.showMessageDialog(null, result);
    }
}
