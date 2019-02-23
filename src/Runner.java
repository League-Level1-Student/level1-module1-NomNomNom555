import java.util.Random;

public class Runner {
public static void main(String[] args) {
	Vault vinney= new Vault(new Random().nextInt(500000));
	JamesBond bames= new JamesBond();
	int car = bames.findCode(vinney);
	System.out.println(car);
}
}