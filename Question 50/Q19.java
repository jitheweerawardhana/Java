
import java.util.Scanner;

class Q19 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] dailyOccupancy = new int[30];


        int totalOccupiedBedDays = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Enter the number of occupied beds for Day " + (i + 1) + " - ");
            dailyOccupancy[i] = sc.nextInt();

            if (dailyOccupancy[i] < 0) {
                dailyOccupancy[i] = 0;
            } else if (dailyOccupancy[i] > 100) {
                dailyOccupancy[i] = 100;
            }
            totalOccupiedBedDays += dailyOccupancy[i];
        }

        double averageOccupancyRate = (totalOccupiedBedDays / (double) (100 * 30)) * 100;

        System.out.println("Total occupied bed-days: " + totalOccupiedBedDays);
        System.out.println("Average daily occupancy rate: " + averageOccupancyRate + "%");

        if (averageOccupancyRate >= 80) {
            System.out.println("High Occupancy Rate");
        } else {
            System.out.println("Low Occupancy Rate");
        }
    }
}
