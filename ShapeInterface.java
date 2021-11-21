/**
 * An interface in Java is a blueprint of a class.
 * It has static constants and abstract methods.
 * The interface in Java is a mechanism to achieve 100% abstraction and multiple inheritance in Java.
 * There can only be abstract methods in Java interface, not method body.
 * Interface can have abstract methods and variables.
 * Java Interface represents the IS-A relationship.
 * It can be used to achieve loose coupling.
 * Interface fields are public, static and final by default and methods are public and abstract.
 * Since Java 9, we can have private methods in an interface.
 */
public interface ShapeInterface {

	double area();
	void print();
}

class Square implements ShapeInterface{
	private double side;
	Square(double side){
		this.side = side;
	}

	// implentation of interface methods

	public double area(){
		return side * side;
	}

	public void print(){
		System.out.println("side = " + side);
	}

	public static void main(String[] args) {
		Square square = new Square(46.12);
		square.print();
		System.out.println("area = " + square.area());
	}
}
