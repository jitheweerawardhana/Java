import java.util.Scanner;

class Demo15{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter your user name - ");
		String name = sc.next();
		
		System.out.print("Enter your password - ");
		String password = sc.next();
		
		String dbName = "admin@gmail.com";
		String dbPassword = "admin123";
		
		if(name.equals(dbName)  && password.equals(dbPassword)){
			System.out.print("Loging Success");
			}
			
		else{
			System.out.print("Loging fail");
			}
}}
