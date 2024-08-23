import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  
		  int mark [] = new int [5];
		  
		  int countA = 0;
		  int countB = 0; 
		  int countC = 0; 
		  int countD = 0;
		  int countF = 0;
		  
		  for(int i=0; i<5; i++){
			  
			  System.out.print("Enter your marks - ");
			  mark [i] = sc.nextInt();
			  
			  if( mark [i] >= 90){
				  
				  countA++;
				  }
				  
			  else if ( mark [i] >= 80){
				  countB++;
				  }
				  
			else if ( mark [i] >= 70){
				  countC++;
				  }
			else if ( mark [i] >= 60){
				  countD++;
				  }
			else {
				countF++;
				
				}
			  
			  }
			  
		System.out.print("Grade A sutdent count" + countA);
		System.out.print("Grade A sutdent count" + countB);
		System.out.print("Grade A sutdent count" + countC);
		System.out.print("Grade A sutdent count" + countD);
		System.out.print("Grade A sutdent count" + countF);
}}
