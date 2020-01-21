package _02_unbirthday;

import javax.swing.JOptionPane;

public class UnBirthday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String input = JOptionPane.showInputDialog("When is your birthday?\n(Please put it in number i.e 03/25)");
if(input.equals("11/12")) {
	JOptionPane.showMessageDialog(null, "Happy Birthday!");
}
else {
	JOptionPane.showMessageDialog(null, "Merry UNBrithday >~<");
}

	}

}
