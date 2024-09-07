import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double[][] dailyUsage = new double[15][30];
        double[] totalUsage = new double[15];
        boolean[] highUsage = new boolean[15];

        int highUsageCount = 0;

        for (int i = 0; i <15; i++) {
            System.out.println("Enter daily water usage for Apartment " + (i + 1) + " (in liters):");

            double total = 0;
            for (int x= 0; x <30; x++) {
                System.out.print("Day " + (x+ 1) + ": ");
                dailyUsage[i][x] = sc.nextDouble();
                total += dailyUsage[i][x];
            }

            totalUsage[i] = total;
            System.out.println("Apartment " + (i + 1) + " - Total water usage: " + total + " liters");

            if (total >10000) {
                highUsage[i] = true;
                highUsageCount++;
            }
        }

        double highUsagePercentage = (highUsageCount / (double) 15) * 100;

        if (highUsagePercentage >=50) {
            System.out.println("High Water Usage");
        } else {
            System.out.println("Water Usage Within Limits");
        }

        System.out.println("Number of apartments with water usage greater than 10000 liters: " + highUsageCount);
    }
}
