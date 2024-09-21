class Demo41{
	public static void main (String[] args){
		
		Animal anim1 = new Animal();
		anim1.name = "Tiger";
		anim1.age = 5;
		anim1.noOfLegs = 4;
		anim1.favFood = "Meat";
		
		Animal anim2 = new Animal();
		anim2.name = "Cow";
		anim2.age = 2;
		anim2.noOfLegs = 4;
		anim2.favFood = "Leaves";
		
		Animal anim3 = new Animal("Dog",5,4,"Meat");
		System.out.println(anim3.name);
	}
}

class Animal{
	//attriubiut  instant variable
	String name;
	int age;
	int noOfLegs;
	String favFood;
	
	//constructor -------> defult constructor
	public Animal(){
		//data load
		System.out.println("Hello");
	}
	
	public Animal(int a){
		System.out.println("Hi");
	}
	
	public Animal (String name,int age,int noOfLegsl,String favFood){
		this.name = name;
		this.age = age;
		this.noOfLegs = noOfLegsl;
		this.favFood = favFood;
	}
}
