import java.util.Scanner;

class Q39 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a string: "); 
        String input = sc.nextLine(); 
        String reversed = new StringBuilder(input).reverse().toString(); 
 
        if (input.equals(reversed)) { 
            System.out.println("The string is a palindrome."); 
        } else { 
            System.out.println("The string is not a palindrome."); 
        } 
    } 
} 
