import java.util.Scanner;

class Demo16{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your user name - ");
		String name = sc.next();
		
		System.out.print("Enter your password - ");
		String password = sc.next();
		
		String dbName = "j";
		String dbPassword = "a1";
		
		if(name.equals(dbName)  && password.equals(dbPassword)){
			System.out.println("Loging Success");
			
			System.out.print("Enter monthly Sallery - ");
		    int sallery = sc.nextInt();
		    System.out.print("If you have a car? (true or false) - ");
		    boolean haveCar = sc.nextBoolean();
		   
		    
		    if(sallery > 100000 && haveCar){
				System.out.print("You are under the tax");
				}
			else if(haveCar){
				System.out.print("Enter car value - ");
				int carValue = sc.nextInt();
				
				if(sallery >= 60000 ||  carValue >= 2000000){
					System.out.print("You are under the waripanam");
					}
				}
			}
			
		else{
			System.out.print("you are tax free guy");
			}
}}
