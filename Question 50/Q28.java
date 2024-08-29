import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

        int[][] participationPoints = new int[25][10];
        int[] totalPoints = new int[25];
        boolean[] highParticipation = new boolean[25];

        int highParticipationCount = 0;

        for (int i = 0; i <25; i++) {
            System.out.println("Enter participation points for Student " + (i + 1) + " (0-5 points) over 10 sessions:");

            int total = 0;
            for (int x= 0;x<10; x++) {
                System.out.print("Session " + (x+ 1) + ": ");
                participationPoints[i][x] = sc.nextInt();
                total += participationPoints[i][x];
            }

            totalPoints[i] = total;
            System.out.println("Student " + (i + 1) + " - Total participation points: " + total);

            if (total >= 40) {
                highParticipation[i] = true;
                highParticipationCount++;
            }
        }

        double highParticipationPercentage = (highParticipationCount / (double)25) * 100;

        if (highParticipationPercentage > 60) {
            System.out.println("High Classroom Participation");
        } else {
            System.out.println("Participation Needs Improvement");
        }

        System.out.println("Number of students with 40 or more participation points: " + highParticipationCount);
    }
}
