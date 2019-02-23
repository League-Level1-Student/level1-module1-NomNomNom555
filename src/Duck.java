
public class Duck {
	String favoriteFood;
	int numberOfFriends;

	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void quack() {
		System.out.println("quack");
	}

	void waddle() {
		System.out.println("The duck is waddling");
	}

	public static void main(String[] args) {

		Duck daffy = new Duck("bagels", 5);

		daffy.quack();
		daffy.waddle();
	}
}
