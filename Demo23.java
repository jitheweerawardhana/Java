import java.util.Scanner;

class Demo23{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int dialog = 0;
		int mobitel = 0;
		int airtel = 0;
		int mostUsers = 0;
		String a = "";
		
		System.out.print("Population in the city - ");
		int pop = sc.nextInt();
		
		for(int i=0;i<pop;i++){
			
			System.out.print("Enter your name - ");
			String name = sc.next();
			System.out.print("How many sim card you have - ");
		    int sim = sc.nextInt();
		    
		    for(int x=0;x<sim;x++){
				System.out.print("Enter "+(x+1)+" Sim card name - ");
		        String simName = sc.next();
		        
		        if(simName.equals("dialog")){
					dialog++;
					}
					
				else if(simName.equals("mobitel")){
					mobitel++;
					}
				else if(simName.equals("airtel")){
					airtel++;
					}
				}
			}
			
		System.out.println("Dialog sim users- "+dialog+" Mobitel sim users- "+mobitel+" Airtel sim users - "+airtel);
		
		/*if(dialog<mobitel && airtel<mobitel){
			System.out.println("More people are using Mobitel sim. Count - "+mobitel);
			}
		else if(mobitel<dialog && airtel<dialog){
			System.out.println("More people are using dialog sim. Count - "+dialog);
			}
		else if(airtel<dialog && mobitel<airtel){
			System.out.println("More people are using dialog sim. Count - "+airtel);
			}*/
			
		for(int y=0;y<3;y++){
			if(mostUsers<dialog){
				mostUsers=dialog;
				a="Dialog";
				}
			else if(mostUsers<mobitel){
				mostUsers=mobitel;
				a="Mobitel";
				}
			else if(mostUsers<airtel){
				mostUsers=airtel;
				a="Airtel";
				}
			}
		System.out.println("More people are using - "+a);
		
		}
}
