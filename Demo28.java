import java.util.Scanner;

class Demo28 {
    public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  
		 /* int age5 =27;
		  * int age1 =7;
		  * int age2 =85;
		  * int age3=66;
		  * int age4 =35;
		  * 
		  * int [] ages = new int[5];
		  * 
		  * ages[0] = 7;
		  * ages[3] = 27;
		  * 
		  * */
		  int [] ages = new int[5];
		  
		  for (int i=0;i<5;i++){
			  System.out.print("Enter a value - ");
			  
			  int val = sc.nextInt();
			  ages[i] = val;
			  } 
		 for(int i=0;i<5;i++){
			 System.out.print(ages[i]);
		 }
		 
}} 
