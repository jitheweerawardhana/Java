
import java.util.Scanner;

class Q35 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[7];
        boolean isSorted = true;

        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 1; i < 7; i++) {
            if (numbers[i] < numbers[i - 1]) {
                isSorted = false;
                break; 
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted.");
        } else {
            System.out.println("Array is not sorted.");
        }
    }
}
