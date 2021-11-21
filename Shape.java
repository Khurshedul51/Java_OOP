/**
 * A class is a user defined blueprint or prototype from which objects are created.
 * It represents the set of properties or methods that are common to all objects of one type.
 */
// this is a class named Shape
public class Shape{
	// member variable of the class
	protected double side1;
	protected double side2;

	Shape() { }
	Shape(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}
	// method of the class 
	public void print(){
		System.out.println("This is a class named Shape.");
		System.out.println("side1 = " + side1);
		System.out.println("side2 = " + side2);
	}

	public static void main(String...args){
		/**
		 * Object is a basic unit of OOP and represents the real life entities.
		 * Object is an instance of a class.
		 * Object consists of three parts, i.e., state, behaviour, identity. 
		 */
		Shape shapeObject = new Shape(); // creating an object of Shape class
		shapeObject.side1 = 45.67;
		shapeObject.side2 = 345.98;
		shapeObject.print();
	}
}