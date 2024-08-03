import java.util.Scanner;

class Demo22{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int numberOfFamily = 0;
		
		for(int i=0;i<18;i++){
			System.out.println("Enter your salary - ");
			
			int salary = sc.nextInt();
			
			if(salary<35000){
				numberOfFamily+=1;
				}
			}
			
			System.out.println(numberOfFamily);
		
	}
	
	}
