import java.util.Scanner;

class Demo8{
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter Coast : ");
	double amount = scan.nextDouble();
	
	double newAmount = amount + (amount * 0.03);
	System.out.println("Your new amount is " +newAmount);}
}
	
