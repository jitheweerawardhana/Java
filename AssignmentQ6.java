import java.util.Scanner;

class AssignmentQ6{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter lagna (aries,taurus,cancer...)  - ");
		String lagna = sc.next().toLowerCase();
		
		if(lagna.equals("aries")){
			System.out.println("status of today : Frequent agitation and distressing experiences ");}
			
		else if(lagna.equals("taurus")){
			System.out.println("status of today : It is a day of social respect, which is fertile for the hands. ");}
			
		else if(lagna.equals("gemini")){
			System.out.println("status of today : Wealth and pleasures are attained. ");}
			
		else if(lagna.equals("cancer")){
			System.out.println("status of today : Talent emerges, and learning comes to the fore ");}
			
		else if(lagna.equals("sinha")){
			System.out.println("status of today : Courage may decrease.. ");}
			
		else if(lagna.equals("virgo")){
			System.out.println("status of today : Marriage candidates are auspicious. ");}
			
		else if(lagna.equals("libra")){
			System.out.println("status of today : Secret enemies and waning health. ");}
			
		else if(lagna.equals("scorpio")){
			System.out.println("status of today : Effectiveness of education and children's activities. ");}
			
		else if(lagna.equals("sagittarius")){
			System.out.println("status of today : Family harmony and happiness. ");}
			
		else if(lagna.equals("dragon")){
			System.out.println("status of today : To prove your skills in action. ");}
			
		else if(lagna.equals("aquarius")){
			System.out.println("status of today : Good company and good economy.. ");}
		
		else if(lagna.equals("pisces")){
			System.out.println("status of today : Wins the hearts of others. ");}
			
	    else{
			System.out.print("Invalid lagna entered");
			}
}}
