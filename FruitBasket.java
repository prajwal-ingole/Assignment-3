import java.util.Scanner;

class Fruit{
	int noOfFruit;
	void calcFruit(int mn, int al) {
		noOfFruit = mn + al;
		System.out.println("Total no. of fruits: "+noOfFruit);
	}
}

class Apples{
	int apple;
	int setApples() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of apples: ");
		apple = scan.nextInt();
		return apple;
	}
}

class Mangoes{
	int mango;
	int setMangoes() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of mangoes: ");
		mango = scan.nextInt();
		return mango;
	}
}

public class FruitBasket {
	public static void main(String[] args) {
		Mangoes mg = new Mangoes();
		int mango = mg.setMangoes();
		System.out.println("Total mangoes: "+mango);
		Apples ap = new Apples();
		int apple = ap.setApples();
		System.out.println("Total Apples: "+apple);
		Fruit fr = new Fruit();
		fr.calcFruit(mango, apple);
	}
}























