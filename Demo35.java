import java.util.*; 

class Demo35 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number 1 - ");
		int x = sc.nextInt();  
		System.out.print("Enter number 2 - ");
		int y = sc.nextInt();  
		
		getSum(x,y);
	
	}
	
	public static void getSum(int val1,int val2){
		
		int total = val1+ val2;
		System.out.print("Total is - "+total);
	}
    }
    
