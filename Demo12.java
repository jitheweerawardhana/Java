import java.util.Scanner;

class Demo12{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your monthly Sallery - ");
		double sallery = sc.nextDouble();
		
		double invest = ( sallery * 0.25);
		double consume =( sallery * 0.5);
		double save = ( sallery * 0.25 );
		
		System.out.println("Invest Amount "+invest);
		System.out.println("Consume Amount "+consume);
		System.out.println("Save Amount "+save);
		
		if (invest >= 75000){
			System.out.println("Tax free");
			}
		else{
			System.out.println("You are under tax");
			}
}}
