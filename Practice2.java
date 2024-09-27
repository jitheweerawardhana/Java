class Practice2{
	public static void main(String[] args){
		
		NumberPrinter printer = new NumberPrinter();
        printer.printNumbers();
	}
	}

class NumberPrinter{
	
	public void printNumbers(){
		int[] arr = new int [10];
		
		int hundred = arr.length * arr.length;
		
		for (int i = 1; i <= hundred; i++) {
            System.out.println(i);
	}
}
}
