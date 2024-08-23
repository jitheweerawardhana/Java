import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String name [] = new String [5];
		int age [] = new int [5];
		
		int group18to22 = 0;
		int group23to30 = 0;
		int group31to40 = 0;
		int groupUpto40 = 0;
		
		for(int i=0;i<5;i++){
			
			System.out.print("Enter your name - ");
			name[i] = sc.next();
			
			System.out.print("Enter your age - ");
			age[i] = sc.nextInt();
			
			
			if(age[i] <22 && age[i]>18){
				group18to22++;
				}
				
				else if(age[i] <30 && age[i]>23){
				group23to30++;
				}
				else if(age[i] <40 && age[i]>31){
				 group31to40++;
				}
				else if( age[i]> 40){
				groupUpto40++;
				}
		}
		System.out.print("Student between the ages of 18 and 22 years - ");
		System.out.print("Student between the ages of 23 and 30 years - ");
		System.out.print("Student between the ages of 31 and 40 years - ");
		System.out.print("Student upto 40 years - ");
		}
}
