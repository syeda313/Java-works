import java.util.ArrayList;

import stdlib.StdIn;
import stdlib.StdOut;

public class CountTokens {

	public static void main(String[] args) {
		//ask user for a file
		StdOut.print("Please enter the text file pathname: ");
		String filename = StdIn.readLine();
		StdIn.fromFile(filename);
		final String bookText = StdIn.readAll(); //read the contents token by token
		String[] token = bookText.split("\n");

		ArrayList<String> xml = new ArrayList<String>(); 

		for (String x : token) { 
			String[] a = x.split(" ");
			for (String word : a) {
				xml.add(word); //add object to end of Arraylist
			}
		}
		int count = 0;
		int open = 0;
		int close = 0;
		for (String w : xml) { //iterate through array to count number of words, open tags, closed tags
			if (!w.equals("")) {
				XMLToken t = new XMLToken(w);
                  
				if (!t.isTag()) {
					count++;
				}
				if (t.isOpeningTag()) {
					open++;
				} else if (t.isClosingTag()) { // counts bad closed tags
					close++;
				}
			}
		}
		StdOut.println("The number of words in the XML file is " + count);
		StdOut.println("The number of Opening tag in the XML file is " + open);
		StdOut.println("The number of Closing tag in the XML file is " + close);

	}
}
