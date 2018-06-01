

import stdlib.StdIn;

import stdlib.StdOut;

public class CountLetters {

	public static void main(String[] args) {
		StdOut.print("Enter the name of the file:");
		String bookWords = StdIn.readLine();
		StdIn.fromFile(bookWords);

		String fileName = StdIn.readAll();

		int[] count = new int[26];
		for (int i = 0; i < fileName.length(); i++) {
			char ans = fileName.charAt(i);
			if (Character.isAlphabetic(ans)) {
				count[Character.toLowerCase(ans) - 'a']++;
			}
		}
		for (int j = 0; j < count.length; j++) {
			StdOut.printf("%c\t%,5d\n", j + 'a', count[j]);
		}
	}
}
