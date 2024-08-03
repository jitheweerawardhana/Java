import java.util.Scanner;

class Demo24 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String dbUsername = "admin";
		String dbPassword = "123";
		
		boolean x = false;
		
		for(int i =0;i<5;i++){
			
		System.out.print("Enter Your username : ");
		String username = sc.next();
		
		System.out.print("Enter Your Password : ");
		String password = sc.next();
		
			if(username.equals("admin") && password.equals("123"))
			{
				System.out.print("Login Success!");
				x = true;
				break;
			}
			else
			{
				System.out.println("Login Failed! ");
				
			}
		}
		if(!x)
		{
			System.out.print("Account Locked!");
		}
		}
	}	

