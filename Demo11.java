import java.util.Scanner;
import java.util.Random;

class Demo11{
	public static void main (String[]args){
	
	Scanner sc = new Scanner(System.in);
		
	System.out.print("Enter Your Name : ");
	String name = sc.next();
	
	System.out.print("Enter Your Age : ");
	int age = sc.nextInt();
	
	if(age>18){
		if(age<40){	
		    Random random = new Random();
		    int randInt1 = random.nextInt(6);
		    System.out.print(name+" You have "+randInt1+" children in 2030");
		}
	    else{
		    System.out.print("You are over matured");
		}
	}
	else{
		System.out.print("You are not eligible");}
    }
}
    
