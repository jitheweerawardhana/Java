import java.util.Scanner;

class Q17 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] violations = new int[200];

        int totalViolations = 0;
        int driversAbove3Violations = 0;

        for (int i = 0; i < 200; i++) {
            System.out.print("Enter the number of violations committed by Driver " + (i + 1) + ": ");
            violations[i] = sc.nextInt();

            if (violations[i] < 0) {
                violations[i] = 0;
            }

            totalViolations += violations[i];
            if (violations[i] >= 3) {
                driversAbove3Violations++;
            }
        }

        double averageViolations = totalViolations / 200;

        double percentage = (driversAbove3Violations / 200) * 100;

        System.out.println("Total number of violations: " + totalViolations);
        System.out.println("Average number of violations per driver: " + averageViolations);

        if (percentage > 10) {
            System.out.println("High Violation Rate");
        } else {
            System.out.println("Low Violation Rate");
        }

        System.out.println("Number of drivers who committed 3 or more violations: " + driversAbove3Violations);
}}
