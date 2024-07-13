import java.util.Scanner;

class Demo7{
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter 1st Employee Name : ");
	String name1 = scan.next();
	System.out.print("Enter 1st Employee Salary : ");
	int salary1 = scan.nextInt();
	
	System.out.print("Enter 2nd Employee Name : ");
	String name2 = scan.next();
	System.out.print("Enter 2nd Employee Salary : ");
	int salary2 = scan.nextInt();
	
	System.out.print("Enter 3rd Employee Name : ");
	String name3 = scan.next();
	System.out.print("Enter3rd Employee Salary : ");
	int salary3 = scan.nextInt();
	
	System.out.print("Enter 4th Employee Name : ");
	String name4 = scan.next();
	System.out.print("Enter 4th Employee Salary : ");
	int salary4 = scan.nextInt();
	
	int avgSalary = (salary1+salary2+salary3+salary4)/4;
	
	System.out.print("Average Salary is  "+avgSalary);
	
}
}
