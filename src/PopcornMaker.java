import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave bob= new Microwave();
	String flavor=JOptionPane.showInputDialog("What flavor of popcorn do you want?");
	String time= JOptionPane.showInputDialog("How long is it cooked for in minutes?");
	int cookTimeInMinutes= Integer.parseInt(time);
	Popcorn bag = new Popcorn(flavor);
	bob.putInMicrowave(bag);
	bob.setTime(cookTimeInMinutes);
	bob.startMicrowave();
	bag.eat();
	bag.applyHeat();
}
}

