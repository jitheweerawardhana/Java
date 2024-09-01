import java.util.Scanner;

class Q47 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		 int[] array1 = new int[5];
        int[] array2 = new int[5];
        int[] sumArray = new int[5];

        System.out.println("Enter 5 numbers for the first array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter 5 numbers for the second array:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            sumArray[i] = array1[i] + array2[i];
        }

        System.out.println("Sum of corresponding elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(sumArray[i] + " ");
        }
    }
}
