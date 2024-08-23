import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  double salary [] = new double [25];
		  double totalSalaryBefore = 0;
		  
		  for(int i=0;i<25;i++){
			  
			  System.out.print("Enter your sallery - ");
              salary[i] = sc.nextInt();
              totalSalaryBefore += salary[i];
              
			  }
			  
		  double salUp[] = new double [25];
		  double newSal = 0;
		  double totalSalaryAfter = 0;
		   
			  
		  for(int i=0;i<25;i++){
			  if(salary [i] < 30000){
				  newSal =  salary [i]*1.10;
				  
				  salUp[i] = newSal; 
				  
				  }
			  else if(salary [i] > 30000 && salary [i] < 50000){
				  newSal = salary [i]*1.05;
				  
				  salUp[i] = newSal; 
				  }
				  totalSalaryAfter += salUp[i]; 
				  } 
				
			System.out.println("Total Salary Before Adjustments: Rs." + totalSalaryBefore);	
			System.out.println("Total Salary After Adjustments: Rs." + totalSalaryAfter);	
				  
			  }
		  
}

