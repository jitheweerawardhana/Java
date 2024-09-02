import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int [][] sales  = new int[5][5];
		  
		  for( int i=0;i<5;i++ ){
			  
			  for( int x=0;x<5;x++ ){
				  
				  System.out.print("Enter your "+(x+1)+" day sale count - ");
				  sales [i][x] = sc.nextInt();
				  
				  }
			  }
		  int [] sumSales= new int [5];
		  int sum = 0;
		  
		  for( int i=0 ; i<5 ; i++ ){
			  
			  for( int x=0 ; x<5 ; x++ ){
				  
				  sum += sales [i][x];
				  
				  }
				  
				  sumSales [i] = sum;
				  
			  }
			  
			  int totalSum =  0;
			  for( int i=0;i<5;i++ ){
				  
				  totalSum += sumSales [i];
				  
				  }
					
				int avgSales = totalSum/5 ;
				int lessCount = 0;
				
				for( int i=0; i<5 ; i++ ){	
					
					if ( sumSales [i]< avgSales ){
						
						lessCount++;
						}
					}
					
				if ( lessCount > 5 ){
					
					System.out.println("Sales team needs improvement.");
					
					}
					
				else {
					
                    System.out.println("Sales team is performing well.");
                    
                    }
	}
		  
	}

