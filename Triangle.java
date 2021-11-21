/**
 * Inheritance is an important pillar of OOP.
 * It is the mechanism in Java by which one class is allowed to inherit the features
 * (fields and methods) of another class.
 * the keyword used for inheritance is 'extends'. 
 */
public class Triangle extends Shape{
	private double side3;

	Triangle(double side1, double side2, double side3){
		super(side1, side2);
		this.side3 = side3;
	}

	// print() method has been overriden
	@Override
	public void print(){
		System.out.println("This is a class named Triangle that extends the class Shape.");
		System.out.println("side1 = " + side1);
		System.out.println("side2 = " + side2);
		System.out.println("side3 = " + side3);
	}

	public static void main(String[] args) {
		Triangle tri = new Triangle(5.78, 45.34, 78.23);
		tri.print();
	}
}
