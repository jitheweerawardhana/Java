import java.util.Scanner;

class Demo29 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  double [] income = new double[3];
		  double total = 0;
		  double sum = 0 ;
		  int family = 0;
		  double max = 0;
		  
		  for(int i=0;i<3;i++){
			  
				  System.out.print("Enter your job income - ");
				  double job = sc.nextDouble();
				  
				  System.out.print("Enter your business income - ");
				  double bis = sc.nextDouble();
				  
				  System.out.print("Enter your land income - ");
				  double land = sc.nextDouble();
				  
				  
				  total = job + bis + land;

			      /*income[i] = total;
			      sum+=total;*/
				 }
				 
				 
			  for(int i=0;i<3;i++){
				  if(max<income[i]){
					  max=income[i];
					  }
				  if (income[i]<=20){
				       family++;
				   }
				   
			  sum+=income[i];
			  System.out.println(sum);
				  
				  }
			 double avg = sum / 3;
			  
			 System.out.println(avg);
			 System.out.println(family);
			 System.out.println(max);
		   
		  }}
