import java.util.Scanner;

class Demo10{
	public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Your Name : ");
	String name = sc.next();
	
	System.out.print("Enter Your Main income : ");
	double mainIncome = sc.nextDouble();
	
	System.out.print("Enter Your Business income : ");
	double businessIncome = sc.nextDouble();
	
	System.out.print("Enter Your Other income : ");
	double otherIncome = sc.nextDouble();
	
	double totalIncome = mainIncome + businessIncome + otherIncome;
	
	if (totalIncome<50000){
		System.out.println("Mrs/Mr "+name+" ,You are Aswasuma Eligible");
		}
	else{
		System.out.println("Mrs/Mr "+name+" ,You are not Aswasuma eligible");
	}
		}
	}
