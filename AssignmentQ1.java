import java.util.Scanner;

class AssignmentQ1{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter your name - ");
	String name1 = sc.next();
	System.out.print("Enter your monthly salary - ");
	double salary1 = sc.nextDouble();
	
	System.out.print("Enter your name - ");
	String name2 = sc.next();
	System.out.print("Enter your monthly salary - ");
	double salary2 = sc.nextDouble();
	
	System.out.print("Enter your name - ");
	String name3 = sc.next();
	System.out.print("Enter your monthly salary - ");
	double salary3 = sc.nextDouble();
	
	double newSalary1 = salary1 + (salary1*0.1);
	System.out.println(name1+", your new salary is "+newSalary1);
	
	double newSalary2 = salary2 + (salary2*0.1);
	System.out.println(name2+", your new salary is "+newSalary2);
	
	double newSalary3 = salary3 + (salary3*0.1);
	System.out.println(name3+", your new salary is "+newSalary3);
	
		}
	}
