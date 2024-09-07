import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] totalSteps = new int[25];
		int [] daysMetGoal  = new int[25];
		
		for (int i=0; i<25; i++) {
			
            System.out.println("Enter daily steps for Participant " + (i + 1) + " for 30 days:");
            
            for (int x= 0; x<30; x++) {
				
                int steps = sc.nextInt();
                totalSteps[i] += steps;
                if (steps >= 10000) {
                    daysMetGoal[i]++;
                }
            }
        }
        
        double []avgSteps= new double[25];
        for (int i = 0; i <25; i++) {
			
            avgSteps[i] = (double) totalSteps[i] / 30;
        }

        int MetGoal = 0;
        for (int i = 0; i <25; i++) {
            if (daysMetGoal[i] >= 20) {
                MetGoal++;
            }
        }
        
        if (MetGoal > 0.7 * 25) {
            System.out.println("Great Effort!");
        } else {
            System.out.println("Keep Pushing.");
        }

        System.out.println("Total steps and average steps per day for each participant:");
        
        for (int i = 0; i <25; i++) {
            System.out.println("Participant " + (i + 1) + ": Total Steps = " + totalSteps[i] + ", Average Steps/Day = " + avgSteps[i]);
        }
		
		}
    
  }
