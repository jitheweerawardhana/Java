import java.util.Scanner;

class Q22 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double[] sales = new double[30];

        double totalCommission = 0;

        for (int i = 0; i < 30; i++) {
            System.out.print("Enter the total sales for Salesperson " + (i + 1) + ": Rs. ");
            sales[i] = sc.nextDouble();

            double commission;
            if (sales[i] >= 10000) {
                commission = sales[i] * 0.10;
            } else if (sales[i] >= 5000) {
                commission = sales[i] * 0.07;
            } else {
                commission = sales[i] * 0.05;
            }

            totalCommission += commission;
        }

        System.out.println("Total commission paid to all salespersons: Rs. " + totalCommission);
    }
}
