package Array; // dito naka-package yung class, kaya nasa Array folder siya

public class Cafe { // pangalan ng class, dapat kapareho ng file name
    public static void main(String[] args) { // dito nagsisimula yung program

        // dito nagsisimula yung Array
        // weeklySales = benta kada araw, daysOfWeek = pangalan ng mga araw
        int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};
        String[] daysOfWeek = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"};

        System.out.println("---Daily Sales---"); // title lang para madaling basahin
        // loop para ipakita yung benta ng bawat araw
        // same index sila kaya tugma yung araw at yung benta
        for (int i = 0; i < weeklySales.length; i++) {
            System.out.println(daysOfWeek[i] + " sales: " +  weeklySales[i]);
        }
        int totalSales = 0; // dito natin iipunin lahat ng benta
        // enhanced for loop, kukunin isa-isa yung value ng array
        for (int dailySales : weeklySales) {
            totalSales += dailySales; // dinadagdag sa total
        }
        double averageSales = totalSales / weeklySales.length; // total hati sa bilang ng araw
        System.out.println("\n---Weekly Summary---");
        System.out.println("Total Sales: " + totalSales + " cups");
        System.out.println("Average Daily Sales: " + averageSales + " cups");

        // dito natin hahanapin yung pinakamalaki at pinakamaliit
        // simula muna tayo sa unang araw, index 0
        int maxSales = weeklySales[0];
        int minSales = weeklySales[0];
        String bestDay = daysOfWeek[0];
        String worstDay =  daysOfWeek[0];
        for (int i = 1; i < weeklySales.length; i++) { // start sa 1 kasi nasa 0 na tayo
            if (weeklySales[i] > maxSales) { // kung mas malaki sa current max
                maxSales = weeklySales[i]; bestDay = daysOfWeek[i]; // palitan yung max at yung araw
            }
            if  (weeklySales[i] < minSales) { // kung mas maliit sa current min
                minSales = weeklySales[i]; worstDay = daysOfWeek[i]; // palitan yung min at yung araw
            }
        }
        System.out.println("\n---Bests and Worsts---");
        System.out.println("Best day was " + bestDay + " with " + maxSales + " cups");
        System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups");
    }
}
