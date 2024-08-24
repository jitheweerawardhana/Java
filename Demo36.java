import java.util.*; 

class Demo36 {
    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] arr = new int[8];
		
		for(int i=0;i<8;i++){
			System.out.print("Enter number "+(i+1)+ " - ");
		    arr[i] = sc.nextInt();  
		}
		
		System.out.print("What num want you search - ");
		int val = sc.nextInt();  
		
		//searchElement(arr,val);
		boolean value = searchElement(arr,val);
		System.out.print(value);
	}
    
    public static boolean searchElement(int [] arr ,int val){
		
		boolean isAvailable = false;
		  
		
		for(int i=0;i<8;i++){
			
			if(arr[i]==val){
			isAvailable = true;
			break;
			}
		
		}
		return isAvailable;
	}
    
    /*public static void searchElement(int [] arr ,int val){
		
		boolean isAvailable = false;
		  
		
		for(int i=0;i<8;i++){
			
			if(arr[i]==val){
			isAvailable = true;
			break;
			}
		
		}
		
		System.out.print(isAvailable);
	}*/

}
