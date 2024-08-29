import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int[][] dailyExercise = new int[20][30];
        int[] totalExercise = new int[20];
        boolean[] metGoal = new boolean[20];

        int participantsMetGoal = 0;

        for (int i = 0; i <20; i++) {
            System.out.println("Enter daily exercise time for Participant " + (i + 1) + " (in minutes):");

            int total = 0;
            for (int x = 0;x< 30; x++) {
                System.out.print("Day " + (x + 1) + ": ");
                dailyExercise[i][x] = sc.nextInt();
                total += dailyExercise[i][x];
            }

            totalExercise[i] = total;
            double averagePerDay = total / (double) 30;
            System.out.println("Participant " + (i + 1) + " - Total exercise time: " + total + " minutes, Average per day: " + averagePerDay + " minutes");

            if (averagePerDay >= 30) {
                metGoal[i] = true;
                participantsMetGoal++;
            }
        }

        double successPercentage = (participantsMetGoal / (double)20) * 100;

        if (successPercentage > 70) {
            System.out.println("Successful Fitness Challenge");
        } else {
            System.out.println("Challenge Not Fully Achieved");
        }

        System.out.println("Number of participants who exercised for an average of 30 minutes or more per day: " + participantsMetGoal);
    }
}
