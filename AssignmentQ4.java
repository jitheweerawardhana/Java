import java.util.Scanner;

class AssignmentQ4{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Month - ");
		String month = sc.next();
		
		
		if(month.equals("january")){
			System.out.print(" January - 31 Days");
			}
		else if(month.equals("february")){
			System.out.print(" February - 28 Days");
			}
		else if(month.equals("march")){
			System.out.print(" March - 31 Days");
			}
		else if(month.equals("april")){
			System.out.print(" April - 30 Days");
			}
		else if(month.equals("may")){
			System.out.print(" May - 31 Days");
			}
		else if(month.equals("june")){
			System.out.print(" June - 30 Days");
			}
		else if(month.equals("july")){
			System.out.print(" July - 31 Days");
			}
		else if(month.equals("august")){
			System.out.print(" August - 31 Days");
			}
		else if(month.equals("september")){
			System.out.print(" September - 30 Days");
			}
		else if(month.equals("october")){
			System.out.print(" October - 31 Days");
			}
		else if(month.equals("november")){
			System.out.print("November - 30 Days");
			}
		else if(month.equals("december")){
			System.out.print(" December - 31 Days");
			}
		else{
			System.out.print("Invalid month entered");
			}
	}
	}
