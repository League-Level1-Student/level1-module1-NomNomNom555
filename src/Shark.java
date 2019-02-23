
public class Shark {
	int numberOfTeeth;
	String favoriteFood;

	Shark(int numberOfTeeth, String favoriteFood) {
		this.favoriteFood = favoriteFood;
		this.numberOfTeeth = numberOfTeeth;
	}

	void swim() {
		System.out.println("The shark swam.");
	}

	void scare() {
		System.out.println("The sharked scared some people!");
	}

	public static void main(String[] args) {
		Shark simon = new Shark(1000, "seals");
		simon.scare();
		simon.swim();
	}
}
