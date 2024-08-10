import java.util.Scanner;

class Demo27 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int x;
		  boolean y = true;
		  
			  System.out.print("Enter number - ");
			  int num = sc.nextInt();
			  
			  
			  while(num>0){
				  
			     int rest = num % 10;
			     System.out.print(rest);
			     
			     num = num/10;
			 
			  }
	  }
}
