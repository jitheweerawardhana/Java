import java.util.Scanner;

class Q29 {
    public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

        double[][] fuelEfficiency = new double[30][15];
        double[] averageEfficiency = new double[30];
        boolean[] lowEfficiency = new boolean[30];

        int lowEfficiencyCount = 0;

        for (int i = 0; i <30; i++) {
            System.out.println("Enter fuel efficiency for Vehicle " + (i + 1) + " (in mpg) over 15 trips:");

            double total = 0;
            for (int x = 0; x <15; x++) {
                System.out.print("Trip " + (x + 1) + ": ");
                fuelEfficiency[i][x] = sc.nextDouble();
                total += fuelEfficiency[i][x];
            }

            averageEfficiency[i] = total / 15;
            System.out.println("Vehicle " + (i + 1) + " - Average fuel efficiency: " + averageEfficiency[i] + " mpg");

            if (averageEfficiency[i] <20) {
                lowEfficiency[i] = true;
                lowEfficiencyCount++;
            }
        }

        double lowEfficiencyPercentage = (lowEfficiencyCount / (double)30) * 100;

        if (lowEfficiencyPercentage > 30) {
            System.out.println("Fuel Efficiency Issue");
        } else {
            System.out.println("Satisfactory Fuel Efficiency");
        }

        System.out.println("Number of vehicles with average fuel efficiency below 20 mpg: " + lowEfficiencyCount);
    }
}
