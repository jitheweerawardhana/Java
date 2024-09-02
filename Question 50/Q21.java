import java.util.Scanner;

class Q21 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] monthlyProfits = new int[12];

        int totalProfit = 0;
        int profitableMonths = 0;

        for (int i = 0; i < 12; i++) {
            System.out.print("Enter the profit for Month " + (i + 1) + ": ");
            monthlyProfits[i] = sc.nextInt();

            totalProfit += monthlyProfits[i];
            if (monthlyProfits[i] > 10000) {
                profitableMonths++;
            }
        }
        double averageProfit = totalProfit / 12.0;

        boolean profitableYear = profitableMonths > 6; 

        System.out.println("Total profit for the year: Rs. " + totalProfit);
        System.out.println("Average monthly profit: Rs. " + averageProfit);

        if (profitableYear) {
            System.out.println("Profitable Year");
        } else {
            System.out.println("Need for Growth");
        }

        System.out.println("Number of months with profit greater than Rs. 10,000: " + profitableMonths);
    }
}
