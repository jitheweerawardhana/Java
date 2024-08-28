import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] submissions = new int[30][5];
		
		int[] assCompleted = new int[30]; 
        int studentsComp4orMore = 0;
        
        
        for(int i=0; i<5; i++){
			
			int completed = 0; 
			
			for(int x=0; x<30; x++){
				System.out.print("Enter submissions for Student "+(i+1)+"(1 or 0 ) - ");
				submissions[i][x] = sc.nextInt(); 
				
                if (submissions[i][x] == 1) {
					 
                    completed++; 
                    }
			}
			
			assCompleted[i] = completed;
			 if (completed >= 4) { 
                studentsComp4orMore++;
		}
		}
		 double avgCompletionRate = (double) studentsComp4orMore / 30.0; 
 
        for (int i = 0; i < 30; i++) { 
            System.out.println("Student "+(i+1)+" Completed "+assCompleted[i]+" assignments - "); 
        } 
 
        if (avgCompletionRate >= 0.80) { 
            System.out.println("Good Engagement"); 
        } else { 
            System.out.println("Low Engagement"); 
        }
	}
}
  
