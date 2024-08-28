import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] feedbook = new int[100];
		int totalScore = 0;
		int higherScoreCount = 0;
		
		for(int i=0; i<100; i++){
			
			System.out.print((i+1)+"Customer feedback (1-10)- ");
			feedbook [i] = sc.nextInt();
			
			
		totalScore += feedbook [i];
		if(feedbook[i]>=8){
			higherScoreCount++;
				 
		}
		}
		
		 double avgScore = totalScore / 100.0;
		 
		 System.out.println("Average Score:"+ avgScore);
		 
		  if ((higherScoreCount/ 100.0) >= 0.75) { 
            System.out.println("Product is Well-Received"); 
        } else { 
            System.out.println("Consider Improvements"); 
        }
		  
	}
    }
