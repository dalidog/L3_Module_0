package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) { 
			String s = eggs.get(i);

			if(s== "cracked") {
				System.out.println(i);
				return i;

			}

		}

		return -1;
	}

	public static int countPearls(List<Boolean> oysters) {
		int counter = 0;

		for (int i = 0; i < oysters.size(); i++) { 
			Boolean t = oysters.get(i);

			if(t == true) {

				counter=counter +1;

			}
		}
		System.out.println(counter);
		return counter;
	}
	public static Double findTallest(List<Double> Peeps) {
		Double biggestnum = Peeps.get(0);
		for (int i = 0; i < Peeps.size(); i++) { 
			Double p = Peeps.get(i);
			
			if(biggestnum < p) {
				biggestnum = p;

			}


		}
		System.out.println(biggestnum);
		return biggestnum;
	}
	public static String findLongestWord (List<String> words) {
		String biggestword = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			String w = words.get(i);
			if(biggestword.length() < w.length()) {
				biggestword = w;
			}
		}
		System.out.println(biggestword);
		return biggestword;
	}
	public static Boolean containsSOS(List<String> message1) {
		String sos = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			String message =message1.get(i);

		if(message.equals(sos) ) {
			System.out.println(true);
			return true;

		}}
		 System.out.println(false);
		return false;

	}
}