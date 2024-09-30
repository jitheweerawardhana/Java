class Practice5{
	public static void main(String[] args){
		
        int totalSteps = 0;
        
        for (int steps = 100; steps <= 1000; steps += 100) {
            totalSteps += steps;
            System.out.println("Steps walked: " + totalSteps);
        }
    }
}
class FitnessApp2 {

    public static void main(String[] args) {
        int totalSteps = 0;

        while (totalSteps < 2000) {
            totalSteps += 500;
            System.out.println("Total steps: " + totalSteps);
        }
    }
}

class FitnessApp1 {

    public static void main(String[] args) {
        int totalSteps = 0;
        
        for (int steps = 100; totalSteps < 1000; steps += 100) {
            totalSteps += steps;
            System.out.println("Steps walked: " + totalSteps);

            if (totalSteps % 300 == 0) {
                System.out.println("Notification sent!");
            }
        }
    }
}
