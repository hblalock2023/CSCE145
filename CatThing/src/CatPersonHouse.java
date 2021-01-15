
public class CatPersonHouse {

	public static void main(String[] args) {
		
		// Declare an instance of an object.
		Cat cat01;
		Cat cat02;
		
		cat01 = new Cat(); // Call to the default constructor
		cat02 = new Cat("Mr. Flufferkins", 10.0, 4); // Call to parameter constructor
		
		cat01.setName("Triscut");
		cat01.setWeight(15.0);
		cat01.setNumOfLegs(3);
		
		System.out.println(cat01.getName());
		System.out.println(cat02.getName());
		
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		
		cat01 = new Cat("Mr. Flufferkins", 10.0, 4);
		
		// double equals compares memory allocation, not the content of the objects
		// System.out.println(cat01 == cat02);
		System.out.println(cat01.toString());
		System.out.println(cat02.toString());
		System.out.println(cat01.equals(cat02));
		
		cat01 = cat02; // both variables now point to the same address in memory; they see the same changes
		cat02.setName("Rusty");
		System.out.println(cat01.getName());
	}

}
