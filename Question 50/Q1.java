import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int [][] subjectMarks  = new int[15][5];
		  
		  for(int i=0;i<15;i++){
			  
			  for(int x=0;x<5;x++){
				  
				  System.out.print("Enter your "+(x+1)+" Subject marks - ");
				  subjectMarks [i][x] = sc.nextInt();
				  }
			  }
			  
			int sum [] = new int [15];
			
			int temp = 0; 
			
			for(int i=0;i<15;i++){
				
				
			    for(int x=0;x<5;x++){
				  
				   temp += subjectMarks [i][x];
				   
				  }
				  
				  sum[i] = temp;
			  }
			  
			 int avg [] = new int [15];
			 
			 for(int i=0;i<15;i++){
				 
				 avg[i] = sum[i]/5;
				 
				 }
				
			int	countP = 0;
			int	countF = 0;
				 
			 for(int i=0;i<15;i++){
				 
				 if(avg[i]<40){
					 
					 countP++;
					 
					 }
				else{
					
					countF++;
					
					}
				 
				 }
				 
			System.out.print("Pass Count - "+countP+" Fail Count - "+countF);
		
				  	
		  }
}
