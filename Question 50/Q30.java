import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[][] grades = new int[50][2];
        boolean[] improved = new boolean[50];

        int improvementCount = 0;

        for (int i = 0; i < 50; i++) {
            System.out.println("Enter grades for Student " + (i + 1) + " for " + 2 + " exams:");

            for (int x = 0; x < 2; x++) {
                System.out.print("Exam " + (x + 1) + ": ");
                grades[i][x] = sc.nextInt();
            }

            int improvement = grades[i][1] - grades[i][0];
            System.out.println("Student " + (i + 1) + " - Improvement: " + improvement);

            if (improvement > 0) {
                improved[i] = true;
                improvementCount++;
            }
        }

        double improvementPercentage = (improvementCount / (double) 50) * 100;

        if (improvementPercentage > 70) {
            System.out.println("Good Academic Progress");
        } else {
            System.out.println("Needs More Attention");
        }

        System.out.println("Number of students who showed improvement: " + improvementCount);
    }
}
