import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[] initialStock = new int[50];
        int[][] dailySales = new int[50][7];
        int[] remainingStock = new int[50];
        boolean[] lowStockProducts = new boolean[50];

        int lowStockCount = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Enter initial stock for Product " + (i + 1) + ": ");
            initialStock[i] = sc.nextInt();

            int totalSales = 0;

            System.out.println("Enter daily sales for Product " + (i + 1) + ":");
            for (int x= 0; x < 7; x++) {
                System.out.print("Day " + (x + 1) + ": ");
                dailySales[i][x] = sc.nextInt();
                totalSales += dailySales[i][x];
            }

            remainingStock[i] = initialStock[i] - totalSales;

            if (remainingStock[i] < 10) {
                lowStockProducts[i] = true;
                lowStockCount++;
            }

            System.out.println("Product " + (i + 1) + " - Remaining stock: " + remainingStock[i]);
        }

        double lowStockPercentage = (lowStockCount / (double) 50) * 100;

        if (lowStockPercentage > 30) {
            System.out.println("Restock Required");
        } else {
            System.out.println("Stock Levels Adequate");
        }

        System.out.println("Number of products with less than 10 units left: " + lowStockCount);
    }
}
