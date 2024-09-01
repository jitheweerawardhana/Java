import java.util.Scanner;

class Q31 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}

