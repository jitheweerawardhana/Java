class Demo39{
	public static void main (String[] args){
		Student std1 =new Student();
		std1.name="Jithendra";
		std1.age=24;
		std1.address = "Homagama";
		std1.isSmoke = false;
		
		Student std2 = new Student();
		std2.name="weerawardhana";
		
		System.out.println(std2.name);
		System.out.println(std1.name);
		
		std1.age=25;
		System.out.println(std2.age);

		
		Animal anim1 = new Animal();
		anim1.name = "Lion";
		anim1.color = "yellow";
		anim1.food = "meat";
		anim1.country = "Africa";
		
		Animal anim2 = new Animal();
		anim2.name = "Cow";
		anim2.color = "black and white";
		anim2.food = "leaves";
		anim2.country = "all countries";

	}
}

class Student{
	//attributes
	String name;
	boolean isSmoke;
	double accountBalance;
	boolean isHaveGf;
	static int age;
	String address;
	
	//behaviors
  public static void Car(){
	
	String name;
}
}

class Animal{
	String color;
	String food;
	String country;
}

