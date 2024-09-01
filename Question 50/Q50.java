import java.util.Scanner;

class Q50 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int upwardTrendCount = 0;

        int[][] grades = new int[20][4];

        System.out.println("Enter grades for 20 students over 4 exams:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Student " + (i + 1) + ":");
            for (int x = 0; x < 4; x++) {
                System.out.print("Exam " + (x + 1) + ": ");
                grades[i][x] = sc.nextInt();
            }
        }

        for (int i = 0; i < 20; i++) {
            boolean hasUpwardTrend = true;
            for (int x = 0; x < 3; x++) { 
                if (grades[i][x] >= grades[i][x + 1]) {
                    hasUpwardTrend = false;
                    break;
                }
            }
            if (hasUpwardTrend) {
                upwardTrendCount++;
            }
        }

        double upwardTrendPercentage = (double) upwardTrendCount / 20 * 100;

        if (upwardTrendPercentage > 50) {
            System.out.println("Consistent Improvement");
        } else {
            System.out.println("Irregular Performance");
        }
    }
}
