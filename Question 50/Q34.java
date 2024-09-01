import java.util.Scanner;

class Q34 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("Array in reverse order:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
