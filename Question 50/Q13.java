import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] contribution = new int[10][4];
		int[] totalContributions = new int[10];
		int members20HMore = 0;
		
		for(int i=0;i<5;i++){
			  
			   for (int x= 0; x< 4; x++){
				   
				   System.out.print("Enter submissions for Student "+(i+1)+"(1 or 0 ) - ");
				   contribution[i][x] = sc.nextInt();
			   }
		}
		for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int x= 0;x<4; x++) {
                total += contribution[i][x];
            }
            totalContributions[i] = total;
            
            if (total >= 20) {
                members20HMore++;
            }
        }
        double percentage = (members20HMore / 10.0) * 100;
        
        if (percentage > 70) {
            System.out.println("High Team Participation");
        } else {
            System.out.println("Low Team Participation");
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Member "+(i+1)+" contributed a total of " + totalContributions[i] + " hours.");
        }
}
}





