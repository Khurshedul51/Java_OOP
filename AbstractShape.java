/**
 * Abstraction is a process of hiding the implementation details and showing only 
 * the functionality to the users.
 * A class which is declared as abstract is known as an abstract class.
 * It can have abstract and non-abstract methods.
 * Its needs to be extended and its methods need to be implemented.
 * It cannot be used to create object.
 * It can have constructors and static methods.
 * It can have final methods which will force the subclass not to change the body
 * of the methd.
 */
public abstract class AbstractShape {
	protected double side1, side2;
	AbstractShape(double side1, double side2){
		this.side1 = side1;
		this.side2 = side2;
	}

	public abstract double area();
	public abstract void print();
}

// implementation class of abstract class AbstractShape
class Rectangle extends AbstractShape{
	Rectangle(double side1, double side2){
		super(side1, side2);
	}

	public double area(){
		return side1 * side2;
	}

	public void print(){
		System.out.println("side1 = " + side1);
		System.out.println("side2 = " + side2);
	}

	public static void main(String[] args) {
		AbstractShape rect = new Rectangle(56.89, 34.23);
		rect.print();
		System.out.println("Area of rect = " + rect.area());
	}
}
