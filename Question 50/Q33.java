
import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[15];

        System.out.println("Enter 15 numbers:");
        for (int i = 0; i < 15; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the number to search: ");
        int searchNumber = sc.nextInt();

        int count = 0;
        for (int i = 0; i < 15; i++) {
            if (numbers[i] == searchNumber) {
                count++;
            }
        }

        System.out.println("The number " + searchNumber + " appears " + count + " times in the array.");
    }
}
