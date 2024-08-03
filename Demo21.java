import java.util.Scanner;


class Demo21{
	
	public static void main(String[]args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		
		/*for(int i=0;i<5;i++)
		{
			System.out.println(i);
			}*/
		////////////////////////////////////
		
		double totalMarks = 0.0;
		
		for (int i=0;i<7;i++)
		{
			System.out.print("Enter marks for student  " +(i+1)+"- ");
			double val = sc.nextDouble();
			
			totalMarks +=val;
			
			
			}
		
		System.out.print(totalMarks);
		
		}
	}
