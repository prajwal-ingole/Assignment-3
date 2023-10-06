
class Shape{
	void display() {
		System.out.println("This is shape");
	}
}

class Polygon extends Shape{
	@Override
	void display() {
		System.out.println("Polygon is shape");
	}
}

class Rectangle extends Polygon{
	@Override
	void display() {
		System.out.println("Rectangle is a polygon");
	}
}

class Traingle extends Polygon{
	@Override
	void display() {
		System.out.println("Traingle is a polygon");
	}
}

class Square extends Rectangle{
	@Override
	void display() {
		System.out.println("Square is a rectangle");
	}
}

public class ShapesInfo {
	public static void main(String[] args) {
		Shape sh = new Shape();
		sh.display();
		Polygon pg = new Polygon();
		pg.display();
		Rectangle rec = new Rectangle();
		rec.display();
		Traingle tr = new Traingle();
		tr.display();
		Square sq = new Square();
		sq.display();
	}
}























