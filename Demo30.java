import java.util.Scanner;

class Demo30 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  
		  double [] sallery = new double[7];
		  
		  for(int i=0;i<7;i++){
			  
				  System.out.print("Enter your sallery - ");
				  sallery[i] = sc.nextDouble();  
			  }
			  
			for(int i=0;i<7;i++){
				
				sallery[i] = sallery[i]+(sallery[i]*0.12);
				
				}
			for(int i=0;i<7;i++){
				
				System.out.println("Your new sallery - "+sallery[i]);
				
				}
				
			/*	
		     continue key word eken skip kirimak siduwe 
		     int[][] vehicleMilage = new int[8][2];
		     vehicleMilage[0][1] = 34000;
		    
		     for (int i=0;i<0;i++){
		          for( int j=0;j<0;j++){
		     
		     
		     vehicleMilage[i][j] = 250000;
		     }
		     
		     
		     
		     */
		    }
	}
	
