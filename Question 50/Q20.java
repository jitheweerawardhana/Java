import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[15];

        int totalScore = 0;
        int matchesAbove50 = 0;

        for (int i = 0; i < 15; i++) {
            System.out.print("Enter the score for Match " + (i + 1) + ": ");
            scores[i] = sc.nextInt();

            totalScore += scores[i];
            if (scores[i] > 50) {
                matchesAbove50++;
            }
        }

        double averageScore = totalScore / 15.0;

        boolean strongPerformance = matchesAbove50 > 7; 

        System.out.println("Total score across all matches: " + totalScore);
        System.out.println("Average score across all matches: " + averageScore);

        if (strongPerformance) {
            System.out.println("Strong Season Performance");
        } else {
            System.out.println("Average Season Performance");
        }

        System.out.println("Number of matches with scores above 50: " + matchesAbove50);
    }
}
