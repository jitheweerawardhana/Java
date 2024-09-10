import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] sales = new int[50][30];
		
		int  totalSales [] = new int[50];
		int highDemandCount = 0;
		
		for(int i=0;i<50;i++){
			
			System.out.println("Enter sales for product - ");
			
			for(int x=0;x<30;x++){
				
				sales[i][x] = sc.nextInt();
				totalSales [i] += sales[i][x];
			}
		}
		
		for(int i=0;i<50;i++){
			
			double avgDailySales = totalSales [i]/30;
			
			System.out.println("Product "+(i+1)+" : Total Units Sold = "+totalSales[i]+" Average Daily Sales = " + avgDailySales);
			
		
		    if (avgDailySales > 10) { 
                highDemandCount++; 
		}
		
            } 
            
            if ((highDemandCount / 50.0) > 0.6) { 
            System.out.println("High Demand Products"); 
        }   
            else { 
            System.out.println("Low Demand Products");
        } 
 
        
        
}
}
