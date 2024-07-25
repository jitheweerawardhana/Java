import java.util.Scanner;

class AssignmentQ2{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your science marks - ");
		double scienceMarks = sc.nextDouble();
		System.out.print("Enter your maths marks - ");
		double mathsMarks = sc.nextDouble();
		System.out.print("Enter your english marks - ");
		double englishMarks = sc.nextDouble();
		
		double total = scienceMarks + mathsMarks + englishMarks;
		double avarage = total/3;
		
		if(avarage>=75){
			
			System.out.print("Enter your name - ");
		    String name = sc.next();
		    System.out.print("Enter your age - ");
		    int age = sc.nextInt();
		    System.out.print("Enter your address - ");
		    String address = sc.next();
		    
		    System.out.println("We will send you a letter to the address - "+name+","+address);
			}
		else{
			System.out.println("Try again! Good luck");
			}
		
		}
	}
