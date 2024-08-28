import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double [][] temp = new double[5][30];
		double []avgTemp= new double [5];
		double cityTotalTemp = 0;
		double allAvgTemp = 0;
		int tempAbove30 = 0;
		
		for(int i=0; i<5; i++) {
			for(int x= 0; x<30; x++){
				
				System.out.print("Enter "+(i+1)+" city,"+(x+1)+" day temperature : ");
				temp[i][x] = sc.nextDouble();
				cityTotalTemp += temp[i][x];
			}
			
			avgTemp[i] = cityTotalTemp/30;
			allAvgTemp += avgTemp[i];
			
		
		    if(avgTemp[i]>30){
				
			     tempAbove30++;
		}
		}
		
		allAvgTemp /= 5;
		System.out.print("Avarage temperatuer in all city - "+allAvgTemp);
		
		
		for(int i=0; i<5; i++){
			System.out.print("Avarage temperatuer in city - "+avgTemp[i]);
		}
		
		if(tempAbove30>= 3 ){
			System.out.print("Heat Wave Alert!");
		}
		else{
			System.out.print("Normal Weather");
		}
		
		
	}
    }
