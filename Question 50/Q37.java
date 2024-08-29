import java.util.Scanner;

class Q37 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[12];
        int countEven = 0;
        int countOdd = 0;

        System.out.println("Enter 12 numbers:");
        for (int i = 0; i < 12; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < 12; i++) {
            if (numbers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Count of even numbers: " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }
}
