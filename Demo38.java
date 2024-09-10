import java.util.*; 

class Demo38 {
	
    public static void main(String[] args) {
		
		double [][] bank = new double[56][2];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<100;i++){
			
			System.out.print("Enter your user id : ");
			int id = sc.nextInt();
			
			System.out.print("Do you want to deposit or withdrow : ");
			String type = sc.next();
			
			
			if(type.equals("deposit")){
				deposit(id,bank);
			}
			else if (type.equals("withdrow")){
				withdrow(id,bank);
			}
		}
		}
		
		public static void deposit(int id,double [][] bank){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("for saving account or current account : ");
			String acc = sc.next();
			
			if(acc.equals("saving")){
				System.out.print("Enter your deposit ammount : ");
				double amount = sc.nextInt();
				
				bank [(id-1)][0] += amount; 
				
			}
			else if (acc.equals("current")){
				System.out.print("Enter your deposit ammount : ");
				double amount = sc.nextInt();
				
				bank [(id-1)][1] += amount; 
				
			}
		}
		
		public static void withdrow(int id,double [][] bank){
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("for saving account or current account : ");
			String acc = sc.next();
			
			if(acc.equals("saving")){
				System.out.print("Enter your withdrow ammount : ");
				double amount = sc.nextInt();
				
				if(bank [id-1][0] > amount){
					
					bank [id-1][0] -= amount; 
				}
				
				else{
					System.out.print("Your bank balence is low");
				}
				
			}
			else if (acc.equals("current")){
				System.out.print("Enter your withdrow ammount : ");
				double amount = sc.nextInt();
				
				if(bank [id-1][1] > amount){
					
					bank [id-1][1] -= amount; 
				}
				
				else{
					System.out.print("Your bank balence is low");
				}
				
			}
		
	}
}

//public static void getSum()
//public static void getSum(int x)
//public static void getSum(String name)




