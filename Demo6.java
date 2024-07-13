import java.util.Scanner;

class Demo6{
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter your Name : " );
	String name = scan.next();
	System.out.print("Enter your chemistry Mark : " );
	double chemistry = scan.nextDouble();
	System.out.print("Enter your  physics Mark : " );
	double physics = scan.nextDouble();
	System.out.print("Enter your mathes Mark : " );
	double mathes = scan.nextDouble();
	
	double avg;
	
	avg = ( chemistry + physics + mathes )/ 3;
	
	System.out.println(name+" your average mark is"+avg);
		}
	}
