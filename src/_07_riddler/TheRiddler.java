package _07_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String input = JOptionPane.showInputDialog("If I dig a hole that is 5 feet by 5 feet by 5 feet, how much dirt is in the hole?");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if (input.equalsIgnoreCase("There is no dirt") || input.equalsIgnoreCase("0") || input.equalsIgnoreCase("zero") || input.equalsIgnoreCase("none")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
} 
		// 5. Otherwise, say "wrong" and tell them the answer
else {
	JOptionPane.showMessageDialog(null, "Wrong! The answer is there is no dirt!");
}
		// 6. Add some more riddles
String input2 = JOptionPane.showInputDialog("If I were in a box with four walls all facing north and a bear was outside, what color is the bear?");
if (input2.equalsIgnoreCase("White")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
} else {
JOptionPane.showMessageDialog(null, "Wrong! The answer is white!");
}
String input3 = JOptionPane.showInputDialog("What flies but doesn't have wings?");
if (input3.equalsIgnoreCase("Time")) {
	JOptionPane.showMessageDialog(null, "Correct!");
	score++;
} else {
JOptionPane.showMessageDialog(null, "Wrong! The answer is time!");
}
		// 2. Make a pop up to show the score.
		JOptionPane.showConfirmDialog(null, "You got " + score + "/3");
	}
}








































