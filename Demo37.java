import java.util.Scanner;
import java.util.*; 

class Demo37 {
    public static void main(String[] args) {
		
		int [] data = {45,12,34,56,78,42,67};
		
		int [] result = reverseArr(data);
		  
          for (int i=0;i<7;i++) {
            System.out.print(" "+result[i]);
		  }
	  }
		public static int[] reverseArr(int[] data){
			
			int [] reverseArr = new int[data.length];
			
			for(int i=0;i<7;i++){
				reverseArr[i] = data[6-i];
        }
        
        return reverseArr;
        
			}
	}
