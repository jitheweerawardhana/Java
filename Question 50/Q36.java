import java.util.Scanner;

class Q36 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];
        int sumPositive = 0;
        int sumNegative = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 0) {
                sumPositive += numbers[i];
            } else if (numbers[i] < 0) {
                sumNegative += numbers[i];
            }
        }

        System.out.println("Sum of positive numbers: " + sumPositive);
        System.out.println("Sum of negative numbers: " + sumNegative);
    }
}
