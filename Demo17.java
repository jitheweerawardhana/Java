import java.util.Scanner;

class Demo17{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter mounth - ");
		String mounth = sc.next();
		
		if(mounth.equals("january") || mounth.equals("January")){
			System.out.print("Duruthu");
			}
		else if(mounth.equals("february") || mounth.equals("February")){
			System.out.print("Nawam");
			}
		else if(mounth.equals("march") || mounth.equals("March")){
			System.out.print("Madin");
			}
		else if(mounth.equals("april") || mounth.equals("April")){
			System.out.print("Bak");
			}
		else if(mounth.equals("may") || mounth.equals("May")){
			System.out.print("Vesak");
			}
		else{
			System.out.print("Please enter the first five mounths");
			}
}
}
