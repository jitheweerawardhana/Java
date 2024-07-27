import java.util.Scanner;

class Demo13{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number - ");
		int num = sc.nextInt();
		
		int resalt = num%2 ;
		
		if (resalt == 0){
			System.out.print("Even number");
			}
		else{
			System.out.print("Odd number");
			}
}}
