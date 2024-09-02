import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] attendance = new int[100];

        int totalAttendance = 0;
        int membersAbove15Days = 0;

        for (int i = 0; i < 100; i++) {
            System.out.print("Enter the number of days attended by Member " +(i+1)+ " - ");
            attendance[i] = sc.nextInt();

            if (attendance[i] < 0) {
                attendance[i] = 0;
            } else if (attendance[i] > 30) {
                attendance[i] = 30;
            }

            totalAttendance += attendance[i];
            if (attendance[i] >= 15) {
                membersAbove15Days++;
            }
        }

        double averageAttendance = totalAttendance / 100;

        double percentage = (membersAbove15Days / 100) * 100;

        System.out.println("Total attendance for all members - " + totalAttendance);
        System.out.println("Average attendance per member - " + averageAttendance);

        if (percentage >= 70) {
            System.out.println("Active Members");
        } else {
            System.out.println("Inactive Members");
        }

        System.out.println("Number of members who attended at least 15 days - " +membersAbove15Days);
}}
