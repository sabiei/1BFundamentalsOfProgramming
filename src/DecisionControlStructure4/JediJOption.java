package DecisionControlStructure4;

import javax.swing.JOptionPane;

public class JediJOption {

    public static void main(String[] args) {
        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));
        char citizen = JOptionPane.showInputDialog("Enter citizenship code (C/N):")
                .trim().toUpperCase().charAt(0);
        char recommendee = JOptionPane.showInputDialog("Enter recommendee code (R/N):")
                .trim().toUpperCase().charAt(0);

        String result;

        if (recommendee == 'R') {
            result = "ACCEPTED (recommended by Jedi Master Obi Wan)";
        } else if (height >= 200 && age >= 21 && age <= 25 && citizen == 'C') {
            result = "ACCEPTED";
        } else {
            result = "REJECTED";
        }

        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}
