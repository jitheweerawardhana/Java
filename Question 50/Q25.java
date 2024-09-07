import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        double[][] dailyConsumption = new double[10][30];
        double[] totalConsumption = new double[10];
        boolean[] highConsumption = new boolean[10];

        int highConsumptionCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter daily consumption for Household " + (i + 1) + " (in kWh):");

            double total = 0;
            for (int x= 0;x< 30;x++) {
                System.out.print("Day " + (x+ 1) + ": ");
                dailyConsumption[i][x] = sc.nextDouble();
                total += dailyConsumption[i][x];
            }
            totalConsumption[i] = total;
            double averageConsumption = total / 30;
            System.out.println("Household " + (i + 1) + " - Total consumption: " + total + " kWh, Average daily consumption: " + averageConsumption + " kWh");

            if (total >500) {
                highConsumption[i] = true;
                highConsumptionCount++;
            }
        }

        double highConsumptionPercentage = (highConsumptionCount / (double) 10) * 100;

        if (highConsumptionPercentage > 20) {
            System.out.println("High Consumption Alert");
        } else {
            System.out.println("Normal Consumption");
        }

        System.out.println("Number of households with consumption greater than 500 kWh: " + highConsumptionCount);
    }
}
