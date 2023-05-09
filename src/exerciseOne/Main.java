package exerciseOne;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insert a number:");
		int wordNo = input.nextInt();

		Set<String> words = new HashSet<String>();
		Set<String> duplicateWords = new HashSet<String>();

		for (int i = 0; i < wordNo; i++) {
			System.out.println("Insert word no." + (i + 1) + ":");
			String word = input.next();
			if (!words.add(word)) {
				duplicateWords.add(word);
			}
		}

		System.out.println("Duplicate words are:");
		for (String word : duplicateWords) {
			System.out.println(word);
		}

		System.out.println("The number of different words you chose is:");
		System.out.println(words.size());

		System.out.println("...and they are:");
		for (String word : words) {
			System.out.print(word + " / ");
		}

		input.close();
	}

}
