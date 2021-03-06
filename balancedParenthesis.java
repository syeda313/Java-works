import algs13.Stack;
import stdlib.StdIn;
import stdlib.StdOut;

public class BalancedParentheses {

	public static void main(String[] args) {
		//ask the user to enter a string of their choice
		StdOut.print("Enter a string:");
		String expression = StdIn.readLine();
		
		Stack<Character> stack = new Stack<Character>();

		for (Character i = 0; i < expression.length(); i++) {
			char result = expression.charAt(i);
			if (result == '(') { //if the left parenthesis then push it
				stack.push(i);
			} else if (result == ')') { 
				if (!stack.isEmpty()) { // if stack is not empty then pop
					char val1 = stack.pop();
					StdOut.print(val1);
				} else {
					StdOut.println("An unbalanced right parentheses was found");
					System.exit(0);
				}
			}
		}
		if (!stack.isEmpty()) {
			StdOut.println("An unbalanced left parentheses was found");
		} else {
			StdOut.println("The parentheses are balanced");
		}
		System.exit(0); //to exit a java program
	}
}
