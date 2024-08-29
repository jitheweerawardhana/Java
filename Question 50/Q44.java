import java.util.Scanner;

class Q44 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = new int[10];


        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        int maxCount = 0;
        int[] count = new int[10]; 

        for (int i = 0; i < 10; i++) {
            count[i] = 1; 
            for (int j = i + 1; j < 10; j++) {
                if (numbers[i] == numbers[j]) {
                    count[i]++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
            }
        }


        System.out.print("Number(s) with the highest frequency: ");
        for (int i = 0; i < 10; i++) {
            if (count[i] == maxCount) {
  
                boolean isDuplicate = false;
                for (int k = 0; k < i; k++) {
                    if (numbers[i] == numbers[k]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (!isDuplicate) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
    }
}
