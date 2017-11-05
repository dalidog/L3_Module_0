package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String s = eggs.get(i);

			if (s == "cracked") {
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

			if (t == true) {

				counter = counter + 1;

			}
		}
		System.out.println(counter);
		return counter;
	}

	public static Double findTallest(List<Double> Peeps) {
		Double biggestnum = Peeps.get(0);
		for (int i = 0; i < Peeps.size(); i++) {
			Double p = Peeps.get(i);

			if (biggestnum < p) {
				biggestnum = p;

			}

		}
		System.out.println(biggestnum);
		return biggestnum;
	}

	public static String findLongestWord(List<String> words) {
		String biggestword = words.get(0);
		for (int i = 0; i < words.size(); i++) {
			String w = words.get(i);
			if (biggestword.length() < w.length()) {
				biggestword = w;
			}
		}
		System.out.println(biggestword);
		return biggestword;
	}

	public static Boolean containsSOS(List<String> message1) {
		String sos = "... --- ...";
		for (int i = 0; i < message1.size(); i++) {
			String message = message1.get(i);

			if (message.equals(sos)) {
				System.out.println(true);
				return true;

			}
		}
		System.out.println(false);
		return false;
	}

	public static List<Double> sortScores(List<Double> results) {
		for (int j = 0; j < results.size() - 1; j++) {
			for (int i = 0; i < results.size() - 1; i++) {
				Double b = results.get(i + 1);
				Double a = results.get(i);
				Double c = null;
				if (b < a) {
					c = a;
					a = b;
					b = c;
					results.set(i, a);
					results.set(i + 1, b);
				}
			}
		}
		System.out.println(results);
		return results;
	}

	public static List<String> sortDNA(List<String> dna) {
		for (int j = 0; j < dna.size() - 1; j++) {
			for (int i = 0; i < dna.size() - 1; i++) {
				String a = dna.get(i);
				String b = dna.get(i + 1);
				// System.out.println(a);
				// System.out.println(b);
				String c = null;
				if (b.length() < a.length()) {
					c = a;
					a = b;
					b = c;
					dna.set(i, a);
					dna.set(i + 1, b);

				}
			}

		}
		System.out.println(dna);
		return dna;
	}

	public static List<String> sortWords(List<String> words) {
		for (int j = 0; j < words.size()-1; j++) {
			for (int i = 0; i < words.size()-1; i++) {
String a = words.get(i);
String b = words.get(i+1);
String c = null;
System.out.println(a);
System.out.println(b);
System.out.println(b.compareTo(a));
if(b.compareTo(a) <0) {
	c = a;
	a = b;
	b = c;
	words.set(i, a);
	words.set(i+1, b);
}
			}
		}
		System.out.println(words);
		return words;

	}
}
