import java.util.Scanner;
import java.util.*; 

class Demo40{
	public static void main (String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		Vehicle [] vehicle = new Vehicle[2];
		
		for(int i=0;i<2;i++){
			
			vehicle[i] = new Vehicle();
			
			System.out.println("Enter Vehicle name : ");
			vehicle[i].name =sc.next();
			
			System.out.println("Enter Vehicle type : ");
			vehicle[i].type =sc.next();
			
			System.out.println("Enter Vehicle weels : ");
			vehicle[i].weels =sc.nextInt();
			
			System.out.println("Enter Vehicle transmission Mode (auto or manual) : ");
			vehicle[i].transmissionMode =sc.next();
			
			System.out.println("Enter Vehicle power (true or false) : ");
			vehicle[i].power =sc.nextBoolean();
			
			System.out.println("Enter Vehicle manufacture Year : ");
			vehicle[i].manufactureYear =sc.nextInt();
		}
		
		for(int i=0;i<2;i++){
			System.out.println(vehicle[i].name);
		}
		
	}}

class Vehicle{
	String name;
	String type;
	int weels;
	String transmissionMode;
	boolean power;
	int manufactureYear;
}
