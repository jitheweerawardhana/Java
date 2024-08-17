import java.util.Scanner;

class Demo31 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		  int [] uniqueId = new int[3];
		  String [] brand = new String[3];
		  String [] model = new String[3];
		  int [] ram = new int[3];
		  
		  /*for (int i=0;i<3;i++){
			  System.out.print("Enter Laptop "+(i+1)+" ID - ");
			  uniqueId[i] = sc.nextInt();
			  
			  System.out.print("Enter Laptop "+(i+1)+" Brand - ");
			  brand[i] = sc.next();
			  
			  System.out.print("Enter Laptop "+(i+1)+" model - ");
			  model[i] = sc.next();
			  
			  System.out.print("Enter Laptop "+(i+1)+" ram - ");
			  ram[i] = sc.nextInt();  
			  
			  }
		  for (int i=0;i<3;i++){
			  System.out.println("LAPTOP details - ID - "+uniqueId[i]+", Brand - "+brand[i]+", Model - "+model[i]+", Ram - "+ram[i]);
			  }*/
			 
			 
			 for (int i=0;i<3;i++){  
		      System.out.print("Enter Laptop "+(i+1)+" ID - ");
			  uniqueId[i] = sc.nextInt();
			  
			  System.out.print("Enter Laptop "+(i+1)+" Brand - ");
			  brand[i] = sc.next();
			  
			  System.out.print("Enter Laptop "+(i+1)+" model - ");
			  model[i] = sc.next();
			  
			  while (true) { 
                System.out.print("Enter Laptop " + (i + 1) + " RAM - ");
                ram[i] = sc.nextInt();
                
                if (ram[i] <= 25) {
                    break;
                } else {
                    System.out.println("Error! RAM capacity over 25. Please enter again.");
                }
			  
			 }
		 }
			 
			 for (int i=0;i<3;i++){
			  System.out.println("LAPTOP details - ID - "+uniqueId[i]+", Brand - "+brand[i]+", Model - "+model[i]+", Ram - "+ram[i]);
			  }
		  }
		  }

