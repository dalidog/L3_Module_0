package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Stack <Double> doubles = new Stack<Double>();
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		for (int i = 0; i < 101; i++) {
			Random r = new Random();
			Double d = r.nextDouble()*100;
			doubles.push(d);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String userAnswer = JOptionPane.showInputDialog( "ENTER IN A NUMBER BETWEEN 0 AND 100, NOT INCLUDING 0!!!!!!!!");
		String userAnswer2 = JOptionPane.showInputDialog( "ENTER IN ANOTHER NUMBER BETWEEN 0 AND 100 THAT IS SMALLER THAN YOUR LAST NUMBER, INCLUSIVE!!!!!!!!");
		Double user = Double.parseDouble(userAnswer);
		Double user2 = Double.parseDouble(userAnswer2);
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		System.out.println("Elements between " + user + "and " + user2);
		for (int i = 0; i < 101; i++) {
			Double pop = doubles.pop();
			if(pop<user && pop>user2) {
				System.out.println(pop);
			}
			else {
				
			}
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
	}}
