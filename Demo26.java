import java.util.Scanner;

class Demo26 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		   int x = 0;
		   boolean y = true;
		   int total = 0;
		   
		   while(y){
			   
			   System.out.println("Enter number - ");
			   int num = sc.nextInt();
			   if( 0<num){
				 total+=num;
				   }
				else{
					y = false;
					}
					
					
			   }
			   System.out.println("Total - "+total);
	  }
	  }
