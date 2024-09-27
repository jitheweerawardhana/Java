class Practice1{
	public static void main (String[] args){
		
		Swap swap = new Swap(10,20);
		
		swap.displayValues();
	}
}
class Swap{
		
		int x;
		int y;
		
		public Swap(int x,int y){
			this.x = y;
			this.y = x;
			
		}
		
		public void displayValues(){
			System.out.println("x = " + x + ", y = " + y);
		}
	}
