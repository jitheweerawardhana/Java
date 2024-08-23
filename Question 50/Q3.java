import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int [][] attendence  = new int[30][22];
		  int totalAtt [] = new int [30];
		  
		  int  totalAttendence = 0;
		  
		  
		  for( int i=0;i<30;i++ ){
			  
			  for( int x=0;x<22;x++ ){
				  
				  System.out.print("Enter your "+(x+1)+" day attendence(1 for present, 0 for absent) - ");
				  attendence [i][x] = sc.nextInt();
				  
				  }
			  }
			  
		  for( int i=0;i<30;i++ ){
			  
			  for( int x=0;x<22;x++ ){
				  
				 totalAttendence += attendence [i][x];
				  
				  }
				  
				totalAtt [i] =  totalAttendence;
			  }
			  
		 int avgAtt [] = new int [30];
		 int avgAttendence  =  0;
		 
		 for(int i=0;i<30;i++){
				 
				 avgAtt[i] = totalAtt [i]/30;
				 
				 }
			  
		
			  
		
     }
  }
