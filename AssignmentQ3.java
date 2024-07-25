import java.util.Scanner;

class AssignmentQ3{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number - ");
		int num = sc.nextInt();
		
		if(num>0){
			System.out.println(num+" is positive number");
			}
		else if(num<0){
			System.out.println(num+" is negative number");
			}
		else{
			System.out.println("you enter  number is 0");
			}
		}
		}
