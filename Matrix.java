//Author syeda313
public class Matrix {

	private double[][] M;
	private final int MIN_SIZE = 0;
	private final int MAX_SIZE = 100;
	private static int mCount = 0;

	// Create a new Matrix, initializing it to zeros
	// The dimensions must be in the range [1, MAX_SIZE]
	public Matrix(int size) {
		int realsize = 0;
		if (size < MIN_SIZE) {
			System.out.println("The size of a matrix cannot be less than 0");
			realsize = MIN_SIZE;
		} else if (size > MAX_SIZE) {
			realsize = MAX_SIZE;
		} else {
			realsize = size;
		}
		M = new double[realsize][realsize];
		for (int i = 0; i < realsize; i++) {
			for (int j = 0; j < realsize; j++) {
				M[i][j] = MIN_SIZE;
			}
		}
		mCount++;
	}

	// Create a new Matrix, initializing it with the parameter
	// The dimensions must be in the range [0, MAX_SIZE]
	public Matrix(int size, double[][] initValues) {
		int ans = 0;
		if (size < MIN_SIZE) {
			System.out.print("The size of a matrix cannot be less than 0.");
			ans = MIN_SIZE;
		} else if (size > MAX_SIZE) {
			ans = MAX_SIZE;
		} else {
			ans = size;
		}
		M = new double[ans][ans];
		for (int i = 0; i < ans; i++) {
			for (int j = 0; j < ans; j++) {
				M[i][j] = initValues[i][j];
			}
		}
		mCount++;
	}

	// Display the Matrix, one row per line
	public void print() {
		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				System.out.print(M[i][j]);
				if (j < M[i].length - 1) {
					System.out.print(',');
				}
			}
			System.out.println();
		}
	}

	// Add two Matrices
	// If the sizes do not match return a Matrix full of zeros
	public Matrix add(Matrix secondMatrix) {
		if (M.length != secondMatrix.M.length) {
			System.out.println("Error(add): Matrices are of unequal sizes!");
			return new Matrix(M.length);
		}
		Matrix newM = new Matrix(M.length);

		for (int i = 0; i < M.length; i++) {
			for (int j = 0; j < M[i].length; j++) {
				newM.M[i][j] = M[i][j] + secondMatrix.M[i][j];
			}
		}
		return newM;
	}

	public static int getNumMatrices() {
		return mCount;
	}
}
