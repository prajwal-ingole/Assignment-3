import java.util.Scanner;

class Vehicle {
	int mileage;
	double price;
	
	Vehicle(int mileage, double price) {
		this.mileage=mileage;
		this.price=price;
	}
	
}

class Car extends Vehicle{
	double ownership_cost;
	int warranty;
	int seating_capacity;
	String fuel_type;
	
	Car(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
		super(mileage, price);
		this.ownership_cost=ownership_cost;
		this.warranty=warranty;
		this.seating_capacity=warranty;
		this.fuel_type=fuel_type;
	}
	
}

class Audi extends Car{
	String model_type;
	
	Audi(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type, String model_type) {
		super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
		this.model_type=model_type;
	}
	
}

class Ford extends Car{
	String model_type;
	
	Ford(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type, String model_type) {
		super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
		this.model_type=model_type;
	}
	
}

class Bike extends Vehicle{
	
	int noOfCylinders;
	int noOfGears;
	String coolingType;
	String wheelType;
	double fuelTankSize;
	
	Bike(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, double fuelTankSize) {
		super(mileage, price);
		this.noOfCylinders=noOfCylinders;
		this.noOfGears=noOfGears;
		this.coolingType=coolingType;
		this.wheelType=wheelType;
		this.fuelTankSize=fuelTankSize;
	}
	
}

class Bajaj extends Bike{
	String make_type;
	
	Bajaj(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, double fuelTankSize, String make_type) {
		super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
		this.make_type=make_type;
	}
}

class TVS extends Bike{
	String make_type;
	
	TVS(int mileage, double price, int noOfCylinders, int noOfGears, String coolingType, String wheelType, double fuelTankSize, String make_type) {
		super(mileage, price, noOfCylinders, noOfGears, coolingType, wheelType, fuelTankSize);
		this.make_type=make_type;
	}
	
}

class VehicleInfo{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the mileage of Audi: ");
		int amileage = scan.nextInt();
		System.out.println("Enter the price of Audi: ");
		double aprice = scan.nextDouble();
		System.out.println("Enter the ownership_cost of Audi: ");
		double aownership_cost = scan.nextDouble();
		System.out.println("Enter the warranty of Audi: ");
		int awarranty = scan.nextInt();
		System.out.println("Enter the sitting capacity of Audi: ");
		int aseat_capacity = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the fuel type: ");
		String afuel = scan.nextLine();
		System.out.println("Enter the model type: ");
		String amodel = scan.nextLine();
		
		Audi ad = new Audi(amileage, aprice, aownership_cost, awarranty, aseat_capacity, afuel, amodel);
		System.out.println("Mileage of Audi is: "+amileage);
		System.out.println("Price of Audi is: "+aprice);
		System.out.println("Ownership cost of Audi is: "+aownership_cost);
		System.out.println("Warranty of Audi is: "+awarranty);
		System.out.println("Seating capacity of Audi is: "+aseat_capacity);
		System.out.println("Fuel used in Audi is: "+afuel);
		System.out.println("Model of Audi is: "+amodel);
		System.out.println();
		
		System.out.println("Enter the mileage of Ford: ");
		int fmileage = scan.nextInt();
		System.out.println("Enter the price of Ford: ");
		double fprice = scan.nextDouble();
		System.out.println("Enter the ownership_cost of Ford: ");
		double fownership_cost = scan.nextDouble();
		System.out.println("Enter the warranty of Ford: ");
		int fwarranty = scan.nextInt();
		System.out.println("Enter the sitting capacity of Ford: ");
		int fseat_capacity = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the fuel type: ");
		String ffuel = scan.nextLine();
		System.out.println("Enter the model type: ");
		String fmodel = scan.nextLine();
		
		Ford fd = new Ford(fmileage, fprice, fownership_cost, fwarranty, fseat_capacity, ffuel, fmodel);
		System.out.println("Mileage of Ford is: "+fmileage);
		System.out.println("Price of Ford is: "+fprice);
		System.out.println("Ownership cost of Ford is: "+fownership_cost);
		System.out.println("Warranty of Ford is: "+fwarranty);
		System.out.println("Seating capacity of Ford is: "+fseat_capacity);
		System.out.println("Fuel used in Ford is: "+ffuel);
		System.out.println("Model of Ford is: "+fmodel);
		System.out.println();
		
		System.out.println("Enter mileage of Bajaj: ");
		int bmileage = scan.nextInt();
		System.out.println("Enter price of Bajaj: ");
		double bprice = scan.nextDouble();
		System.out.println("Enter number of cylinders of Bajaj: ");
		int bnocylinder = scan.nextInt();
		System.out.println("Enter number of gears of Bajaj: ");
		int bnogears = scan.nextInt();
		System.out.println("Enter cooling type of Bajaj: ");
		String bcool = scan.nextLine();
		System.out.println("Enter wheel type of Bajaj: ");
		String bwhtype = scan.nextLine();
		System.out.println("Enter tank size of Bajaj: ");
		int btksize = scan.nextInt();
		System.out.println("Enter make type of Bajaj: ");
		String bmktype = scan.nextLine();
		
		Bajaj bj = new Bajaj(bmileage, bprice, bnocylinder, bnogears, bcool, bwhtype, btksize, bmktype);
		System.out.println("Mileage of Bajaj is: "+bmileage);
		System.out.println("Price of Bajaj: "+bprice);
		System.out.println("No. of cylinders in Bajaj: "+bnocylinder);
		System.out.println("No. of gears in Bajaj: "+bnogears);
		System.out.println("Cooling type in Bajaj: "+bcool);
		System.out.println("Wheel type in Bajaj: "+bwhtype);
		System.out.println("Tank size of Bajaj: "+btksize);
		System.out.println("Make type of Bajaj: "+bmktype);
		System.out.println();
		
		System.out.println("Enter mileage of TVS: ");
		int tmileage = scan.nextInt();
		System.out.println("Enter price of TVS: ");
		double tprice = scan.nextDouble();
		System.out.println("Enter number of cylinders of TVS: ");
		int tnocylinder = scan.nextInt();
		System.out.println("Enter number of gears of TVS: ");
		int tnogears = scan.nextInt();
		System.out.println("Enter cooling type of TVS: ");
		String tcool = scan.nextLine();
		System.out.println("Enter wheel type of TVS: ");
		String twhtype = scan.nextLine();
		System.out.println("Enter tank size of TVS: ");
		int ttksize = scan.nextInt();
		System.out.println("Enter make type of TVS: ");
		String tmktype = scan.nextLine();
		
		TVS tvs = new TVS(tmileage, tprice, tnocylinder, tnogears, tcool, twhtype, ttksize, tmktype);
		System.out.println("Mileage of Bajaj is: "+tmileage);
		System.out.println("Price of Bajaj: "+tprice);
		System.out.println("No. of cylinders in Bajaj: "+tnocylinder);
		System.out.println("No. of gears in Bajaj: "+tnogears);
		System.out.println("Cooling type in Bajaj: "+tcool);
		System.out.println("Wheel type in Bajaj: "+twhtype);
		System.out.println("Tank size of Bajaj: "+ttksize);
		System.out.println("Make type of Bajaj: "+tmktype);
		System.out.println();
	}
}




//
//import java.util.*;
//
//class Vehicle{
//	int mileage;
//	double price;
//}
//
//class Car extends Vehicle{    
//	double ownership_cost;
//	int warranty;
//	int seating_capacity;
//	String fuel_type;
//}
//
//class Bike extends Vehicle{  
//	int no_of_cylinder;
//	int no_of_gear;
//	String cooling_type;
//	String wheel_type;
//	double fuel_tank;
//}
//
//class Audi extends Car{
//	void setdata1(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
//		this.mileage=mileage;
//		this.price=price;
//		this.ownership_cost = ownership_cost;
//		this.warranty = warranty;
//		this.seating_capacity =seating_capacity;
//		this.fuel_type=fuel_type;
//	}
//}
//
//class Ford extends Car{
//	void setdata2(int mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
//		this.mileage=mileage;
//		this.price=price;
//		this.ownership_cost = ownership_cost;
//		this.warranty = warranty;
//		this.seating_capacity =seating_capacity;
//		this.fuel_type=fuel_type;
//	}
//}
//
//class Bajaj extends Bike{
//	void setdata3(int mileage, double price, int no_of_cylinder, int no_of_gear, String cooling_type, String wheel_type, double fuel_tank) {
//		this.mileage=mileage;
//		this.price=price;
//		this.no_of_cylinder=no_of_cylinder;
//		this.no_of_gear=no_of_gear;
//		this.cooling_type=cooling_type;
//		this.wheel_type=wheel_type;
//		this.fuel_tank=fuel_tank;
//	}
//}
//
//class TVS extends Bike{
//	void setdata4(int mileage, double price, int no_of_cylinder, int no_of_gear, String cooling_type, String wheel_type, double fuel_tank) {
//		this.mileage=mileage;
//		this.price=price;
//		this.no_of_cylinder=no_of_cylinder;
//		this.no_of_gear=no_of_gear;
//		this.cooling_type=cooling_type;
//		this.wheel_type=wheel_type;
//		this.fuel_tank=fuel_tank;
//	}
//}
//
//public class VehicleInfo {  
//	public static void main(String args[]) {
//		Scanner sc = new Scanner(System.in);
//		Audi a = new Audi();
//		Ford f = new Ford();
//		Bajaj b = new Bajaj();
//		TVS t = new TVS();
//		
//		System.out.println("Enter the following mentioned details:");
//		System.out.print("Enter the mileage: ");
//		int mileage = sc.nextInt();
//		System.out.print("Enter the price: ");
//		double price = sc.nextDouble();
//		
//		System.out.print("Enter the cost of ownership: ");
//		double ownership_cost = sc.nextDouble();
//		System.out.print("Enter the warranty: ");
//		int warranty = sc.nextInt();
//		System.out.print("Enter the seating capacity: ");
//		int seating_capacity = sc.nextInt();
//		System.out.print("Enter the fuel type: ");
//		String fuel_type = sc.next();
//		
//		System.out.print("Enter the number of cylinder: ");
//		int no_of_cylinder = sc.nextInt();		
//		System.out.print("Enter the number of gears: ");
//		int no_of_gear = sc.nextInt();
//		System.out.print("Enter the cooling type: ");
//		String cooling_type = sc.next();
//		System.out.print("Enter the wheel type: ");
//		String wheel_type = sc.next();
//		System.out.print("Enter the fuel tank size: ");
//		double fuel_tank = sc.nextDouble();
//		
//		System.out.println("Details of Audi are: ");
//		a.setdata1(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
//		System.out.println("\n\nMileage: "+a.mileage+"\nPrice: "+a.price+"Cost of ownership: "+a.ownership_cost+"\nWarranty: "+a.warranty+"\nCapacity of seats: "+a.seating_capacity+"\nType of the fuel: "+a.fuel_type);
//		
//		System.out.println("Details of Ford are: ");
//		f.setdata2(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
//		System.out.println("\n\nMileage: "+f.mileage+"\nPrice: "+f.price+"Cost of ownership: "+f.ownership_cost+"\nWarranty: "+f.warranty+"\nCapacity of seats: "+f.seating_capacity+"\nType of the fuel: "+f.fuel_type);
//		
//		System.out.println("Details of Bajaj are: ");
//		b.setdata3(mileage, price, no_of_cylinder, no_of_gear, cooling_type, wheel_type, fuel_tank);
//		System.out.println("\n\nMileage: "+b.mileage+"\nPrice: "+b.price+"\nNumber of cylinder: "+b.no_of_cylinder+"\nNumber of gears: "+b.no_of_gear+"\nType of cooling mechanism: "+b.cooling_type+"\nType of the wheel is: "+b.wheel_type+"\nFuel tank capacity is: "+b.fuel_tank);
//		
//		System.out.println("Details of TVS are: ");
//		t.setdata4(mileage, price, no_of_cylinder, no_of_gear, cooling_type, wheel_type, fuel_tank);
//		System.out.println("\n\nMileage: "+t.mileage+"\nPrice: "+t.price+"Number of cylinder: "+t.no_of_cylinder+"\nNumber of gears: "+t.no_of_gear+"\nType of cooling mechanism: "+t.cooling_type+"\nType of the wheel is: "+t.wheel_type+"\nFuel tank capacity is: "+fuel_tank);
//	}
//}

















