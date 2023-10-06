
interface Mammals{
	void mammals();
}

interface MarineAnimals{
	void marineAnimals();
}

class BlueWhale implements Mammals, MarineAnimals{
	@Override
	public void mammals() {
		System.out.println("I am mammal");
		
	}
	
	@Override
	public void marineAnimals() {
		System.out.println("I am a marine animal");
	}
	
	void BlueWhale() {
		System.out.println("I belongs to both the categories");
	}
}
public class Animal {

	public static void main(String[] args) {
		BlueWhale bw = new BlueWhale();
		bw.mammals();
		bw.marineAnimals();
		bw.BlueWhale();
	}

}
