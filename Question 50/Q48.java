
import java.util.Scanner;

class Q48 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int[] tempArray = new int[10];
        int uniqueCount = 0;

        for (int i = 0; i < 10; i++) {
            boolean isDuplicate = false;

  
            for (int x = 0; x < uniqueCount; x++) {
                if (numbers[i] == tempArray[x]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                tempArray[uniqueCount] = numbers[i];
                uniqueCount++;
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < uniqueCount; i++) {
            System.out.print(tempArray[i] + " ");
        }
    }
}
