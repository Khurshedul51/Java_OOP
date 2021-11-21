public class ConstructorDemo {
	private double num1, num2;

	//constructor of this class
	ConstructorDemo(double num1, double num2){

		// 'this' keyword refers to the current object in a method or constructor.
		this.num1 = num1;
		this.num2 = num2;
	}

	public static void main(String[] args) {
		ConstructorDemo obj = new ConstructorDemo(56.89, 78.98);
		System.out.println("sum = " + (obj.num1 + obj.num2));
	}
}
