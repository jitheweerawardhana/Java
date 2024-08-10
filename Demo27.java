import java.util.Scanner;

class Demo27 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
			  System.out.print("Enter number - ");
			  int num = sc.nextInt();
			  
			  int x;
			  
			  while(num>0){
				  
			     x = num % 10;
			     System.out.print(x);
			     
			     //  System.out.print(num%10);
			     
			     num = num/10;
			     
			     //   num/=10
			 
			  }
	  }
}
