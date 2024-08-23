import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int empAttendance [] = new int[40];
		
		for (int i = 0; i < 40; i++) {
            System.out.println("Enter attendance for Employee " + (i + 1) + " (1 for present, 0 for absent) - ");
            
            for (int x = 0; x < 26; x++) {
            int attendance = sc.nextInt();
            empAttendance[i] += attendance; 
            }
        
}
        
        int perfectAtt = 0;
        int satisfactoryAtt = 0;
        for (int i=0;i < 40;i++) {
            if (empAttendance[i] == 26) {
                perfectAtt++;
            }
            if (empAttendance[i] > 20) {
                satisfactoryAtt++;
            }
        }
        
        System.out.println("Number of employees with perfect attendance: " + perfectAtt);
            
            if (satisfactoryAtt >= 0.8 * 40) {
            System.out.println("Satisfactory Attendance");
        } else {
            System.out.println("Attendance Needs Improvement");
        }
		}
}
