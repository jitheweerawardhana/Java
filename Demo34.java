import java.util.*; 

class Demo34 {
    public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance(); 
		
            int hour = c.get(Calendar.HOUR);
            int withMin = c.get(Calendar.MINUTE);
		
		if (hour<12){
			System.out.print("Good Morning - ");
			System.out.println("Time - "+hour+":"+withMin);
		}
		else if(hour ==12){
			System.out.print("Good Afternoon");
		}
		else if(hour ==18){
			System.out.print("Good Afternoon");
		}
		
		/* c.get(Calendar.HOUR);
		 * 
		 * 
		 * if (c.get(Calendar.HOUR)<12){
			System.out.print("Good Morning");
		}
		else if(c.get(Calendar.HOUR) ==12){
			System.out.print("Good Afternoon");
		}
		else if(c.get(Calendar.HOUR) ==18){
			System.out.print("Good Afternoon");}*/
		
	}
    
 }
