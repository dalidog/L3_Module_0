package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		ArrayList<String> strings=new ArrayList<String>();
		//2. Add five Strings to your list
		strings.add("Hello");
		strings.add("It's me");
		strings.add("I know you");
		strings.add("I know everything about you");
		strings.add("And I'm totally not a stalker");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < strings.size(); i++) {
			String boo = strings.get(i);
			System.out.println(boo);
			System.out.println("\n");
		}
		//4. Print all the Strings using a for-each loop
		for(String boo:strings){
			System.out.println(boo);
			System.out.println("\n");
		}
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < strings.size(); i+=2) {
			String boo = strings.get(i);
			System.out.println(boo);
			System.out.println("\n");
		}
		//6. Print all the Strings in reverse order.
		for (int i = strings.size(); i <0; i--) {
			String boo = strings.get(i);
			System.out.println(boo);
			System.out.println("\n");
		}
		//7. Print only the Strings that have the letter 'e' in them.
	}
}
