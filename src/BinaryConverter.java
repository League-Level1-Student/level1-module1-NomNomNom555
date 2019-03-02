import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JButton button;
	JTextField answer;
	public static void main(String[] args) {
		new BinaryConverter().createUI();	
		
	}
void createUI() {
	 frame = new JFrame();
	 panel = new JPanel();
	 label = new JLabel();
	 button = new JButton("Convert");
	 answer = new JTextField(20);

	frame.setVisible(true);
	frame.add(panel);
	panel.add(button);
	button.addActionListener(this);
	panel.add(label);
	panel.add(answer);
	frame.pack();
}
String convert(String input) {
    if(input.length() != 8){
         JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
         return "-";
    }
    String binary = "[0-1]+";    //must contain numbers in the given range
    if (!input.matches(binary)) {
         JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
         return "-";
    }
    try {
         int asciiValue = Integer.parseInt(input, 2);
         char theLetter = (char) asciiValue;
         return "" + theLetter;
    } catch (Exception e) {
         JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
         return "-";
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	String input=answer.getText();
	String converted= convert(input);
	answer.setText(converted);
	
}
	
}
