import java.util.ArrayList;

public class NumArrayList<T extends Number> {

	private ArrayList<T> L;

	public NumArrayList() {
		L = new ArrayList<T>();
	}

	// Create a new NumArrayList, initializing it with the parameter
	public NumArrayList(T[] initValues) {
		L = new ArrayList<T>();
		for (int i = 0; i < initValues.length; i++) {
			L.add(initValues[i]);
		}

	}

	public void add(T elem) {
		L.add(elem);
	}

	
	// get the index 
	public T get(int index) {
		return L.get(index);

	}

	// Return the String representation of the NumArrayList
	public String toString() {
		String result = "";
		for (int i = 0; i < L.size(); i++) {
			result += L.get(i) + " ";
		}
		return String.format("%s\n", result);

	}

	// Multiply the NumArrayList by an Integer value
	public NumArrayList<Integer> iMult(Integer val) {
		NumArrayList<Integer> list = new NumArrayList<Integer>();
		int j;
		for (int i = 0; i < L.size(); i++) {
			j = L.get(i).intValue() * val;
			list.add(j);
		}
		return list;
	}

}
