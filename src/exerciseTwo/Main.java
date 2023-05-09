package exerciseTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		// Function 1
		List<Integer> listOne = new ArrayList<>();

		int n = 10;

		for (int i = 0; i < n; i++) {
			listOne.add((int) (Math.random() * 100) + 1);
		}

		System.out.println(listOne);

		listOne.sort(null);
		System.out.println(listOne);

		// Function 2
		List<String> listTwo = new ArrayList<>();

		listTwo.add("Luke");
		listTwo.add("I");
		listTwo.add("am");
		listTwo.add("your");
		listTwo.add("father");

		System.out.println(listTwo);

		Collections.reverse(listTwo);

		System.out.println(listTwo);

		// Function 3
		List<Integer> oddOrEven = new ArrayList<>();

		boolean isEven = false;

		oddOrEven.add(0);
		oddOrEven.add(1);
		oddOrEven.add(2);
		oddOrEven.add(3);
		oddOrEven.add(4);

		for (int i = 0; i < oddOrEven.size(); i++) {
			if (isEven && i % 2 == 0) {
				System.out.println(oddOrEven.get(i));
			} else if (!isEven && i % 2 != 0) {
				System.out.println(oddOrEven.get(i));
			}
		}

	}

}
