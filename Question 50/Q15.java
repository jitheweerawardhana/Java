import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] modulesCompleted = new int[20];

        int totalModules = 0;
        int studentsAbove8Modules = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Enter the number of modules completed by Student " + (i + 1) + ": ");
            modulesCompleted[i] = sc.nextInt();

            if (modulesCompleted[i] < 0) {
                modulesCompleted[i] = 0;
            } else if (modulesCompleted[i] > 10) {
                modulesCompleted[i] = 10;
            }

            totalModules += modulesCompleted[i];
            if (modulesCompleted[i] >= 8) {
                studentsAbove8Modules++;
            }
        }

        double averageModules = totalModules / 20;

        double percentage = (studentsAbove8Modules / 20) * 100;

        System.out.println("Total modules completed by all students: " + totalModules);
        System.out.println("Average modules completed per student: " + averageModules);

        if (percentage > 75) {
            System.out.println("High Course Completion");
        } else {
            System.out.println("Low Course Completion");
        }

        System.out.println("Number of students who completed 8 or more modules: " + studentsAbove8Modules);
		
}}
