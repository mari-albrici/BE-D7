package exerciseOne;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println();

		int wordNo = input.nextInt();

		Set<String> words = new HashSet<String>();
		Set<String> duplicateWords = new HashSet<String>();

		for (int i = 0; i < wordNo; i++) {

			String word = input.nextLine();
			if (!words.add(word)) {
				duplicateWords.add(word);
			}
		}

		for (String word : duplicateWords) {
			System.out.println(word);
		}

		for (String word : words) {
			System.out.print(word);
		}

		int duplicatedWords = duplicateWords.size();
		System.out.println(duplicatedWords);

		input.close();
	}

}
