import java.util.Scanner;

class AssignmentQ5{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number  - ");
		int num1 = sc.nextInt();
		
		System.out.print("Enter number  - ");
		int num2 = sc.nextInt();
		
		System.out.print("Enter number  - ");
		int num3 = sc.nextInt();
		
		System.out.print("Enter number  - ");
		int num4 = sc.nextInt();
		
		System.out.print("Enter number  - ");
		int num5 = sc.nextInt();
		
		int largestNum = num1;
		int smalestNum = num1;
		
		if(num2>largestNum){
			largestNum=num2;}
	    else if(num2<smalestNum){
				smalestNum=num2;
				}
		if(num3>largestNum){
			largestNum=num3;}
		else if(num3<smalestNum){
				smalestNum=num3;
				}
		if(num4>largestNum){
			largestNum=num4;}
		else if(num4<smalestNum){
				smalestNum=num4;
				}
		if(num5>largestNum){
			largestNum=num5;}
		else if(num5<smalestNum){
				smalestNum=num5;
				}
		System.out.println("Largest number is  - "+largestNum);
		System.out.println("Smalest number is  - "+smalestNum);
		}
	}
