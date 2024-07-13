import java.util.Scanner;

class Demo7{
	public static void main(String[] args){
		
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter 1st Employee Name : ");
	String name1 = scan.next();
	System.out.print("Enter 1st Employee Salary : ");
	double salary1 = scan.nextDouble();
	
	System.out.print("Enter 2nd Employee Name : ");
	String name2 = scan.next();
	System.out.print("Enter 2nd Employee Salary : ");
	double salary2 = scan.nextDouble();
	
	System.out.print("Enter 3rd Employee Name : ");
	String name3 = scan.next();
	System.out.print("Enter3rd Employee Salary : ");
	double salary3 = scan.nextDouble();
	
	System.out.print("Enter 4th Employee Name : ");
	String name4 = scan.next();
	System.out.print("Enter 4th Employee Salary : ");
	double salary4 = scan.nextDouble();
	
	double avgSalary = (salary1+salary2+salary3+salary4)/4;
	
	System.out.println("Average Salary is  "+avgSalary);
	
	double newSalary1 = salary1 + (salary1*0.04);
	System.out.println(name1 +"new Salary is  "+newSalary1);
	
	double newSalary2 = salary2 + (salary2*0.04);
	System.out.println(name2 +"new Salary is  "+newSalary2);
	
	double newSalary3 = salary3 + (salary3*0.04);
	System.out.println(name3 +"new Salary is  "+newSalary3);

	double newSalary4 = salary4 + (salary4*0.04);
	System.out.println(name4 +"new Salary is  "+newSalary4);
}
}
