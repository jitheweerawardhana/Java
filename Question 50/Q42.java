import java.util.Scanner;

class Q42 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a string: "); 
        String input = sc.nextLine(); 
        
        int vowelCount = 0; 
        
        String vowels = "aeiou"; 
 
        for (char c : input.toLowerCase().toCharArray()) { 
            if (vowels.indexOf(c) != -1) { 
                vowelCount++; 
            } 
        } 
 
        System.out.println("Number of vowels: " + vowelCount); 
    } 
}
