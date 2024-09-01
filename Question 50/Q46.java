import java.util.Scanner;

class Q46 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[7];

        System.out.println("Enter 7 numbers:");
        for (int i = 0; i < 7; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }


        int firstElement = numbers[0];
        for (int i = 1; i < 7; i++) {
            numbers[i - 1] = numbers[i];
        }
        numbers[6] = firstElement; 

        System.out.println("Rotated array:");
        for (int i = 0; i < 7; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
		
		
