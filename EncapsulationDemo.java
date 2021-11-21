/**
 * Encapsulation in Java is a mechanism of wrapping the data(variables) and code
 * acting on the data(methods) together as a single unit.
 * In encapsulation, the variables of a class will be hidden from other classes and 
 * can be accessed only through the methods of their current class.
 * It is also known as data hiding.
 * To achieve encapsulation --
 * 	1) declare the variables of a class as private.
 *  2) provide public setter and getter methods to modify and veiw the variables value.
 */
public class EncapsulationDemo {
	private int age ;

	// public getter method
	public int getAge(){
		return age;
	}

	// public setter method
	public void setAge(int age){
		this.age = age;
	}
}

class Demo{
	public static void main(String[] args) {
		EncapsulationDemo obj = new EncapsulationDemo();
		obj.setAge(67);
		System.out.println("Age = " + obj.getAge());
	}
}
