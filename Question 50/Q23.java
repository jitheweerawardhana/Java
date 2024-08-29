import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] workHours = new int[25][20];
        boolean[] complianceIssue = new boolean[25];
        
        int employeesWithIssues = 0;

        for (int i = 0; i < 20; i++) {
            System.out.println("Enter work hours for Employee " + (i + 1) + ":");
            int totalHours = 0;

            for (int x= 0;x< 20;x++) {
                System.out.print("Day " + (x+ 1) + ": ");
                workHours[i][x] = sc.nextInt();

                if (workHours[i][x] < 6) {
                    complianceIssue[i] = true;
                }

                totalHours += workHours[i][x];
            }

            double averageHours = totalHours / (double) 20;
            System.out.println("Employee " + (i + 1) + " - Total hours: " + totalHours + ", Average hours: " + averageHours);
        }

        for (int i = 0; i < 20; i++) {
            if (complianceIssue[i]) {
                employeesWithIssues++;
            }
        }

        double compliancePercentage = (employeesWithIssues / (double) 20) * 100;

        if (compliancePercentage > 50) {
            System.out.println("Work Hour Compliance Issue");
        } else {
            System.out.println("Good Compliance");
        }
        System.out.println("Number of employees with less than 6 hours worked on any day: " + employeesWithIssues);
    }
}

