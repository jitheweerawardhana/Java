import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] booksBorrowed = new int[50];

        int totalBooks = 0;
        int membersAbove5Books = 0;

        for (int i = 0; i < 50; i++) {
            System.out.print("Enter the number of books borrowed by Member "+(i+1)+ ": ");
            booksBorrowed[i] = sc.nextInt();

            if (booksBorrowed[i] < 0) {
                booksBorrowed[i] = 0;
            } else if (booksBorrowed[i] > 10) {
                booksBorrowed[i] = 10;
            }

            totalBooks += booksBorrowed[i];
            if (booksBorrowed[i] >= 5) {
                membersAbove5Books++;
            }
        }

        double averageBooks = totalBooks / 50.0;

        
        double percentage = (membersAbove5Books / 50.0) * 100;

        
        System.out.println("Total number of books borrowed: " + totalBooks);
        System.out.println("Average number of books borrowed: " + averageBooks);

        if (percentage > 60) {
            System.out.println("High Library Usage");
        } else {
            System.out.println("Low Library Usage");
        }

        System.out.println("Number of members who borrowed 5 or more books: " + membersAbove5Books);
		
		
		
	}}
	
