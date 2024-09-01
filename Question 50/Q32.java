
import java.util.Scanner;

class Q32 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[8];
        boolean allEven = true;

        System.out.println("Enter 8 numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 8; i++) {
            if (numbers[i] % 2 != 0) {
                allEven = false;
                break; 
            }
        }

        if (allEven) {
            System.out.println("All numbers are even.");
        } else {
            System.out.println("Not all numbers are even.");
        }
    }
}
