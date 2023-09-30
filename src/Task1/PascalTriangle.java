package Task1;

public class PascalTriangle {
	// This method is used to display a Pascal triangle based
	// on the parameter n.
	// Where n represents the number of rows
	public static void printPascalTriangle(int row) {
		for (int i = 1; i <= row; i++) {
			int[] currentRow = getPascalTriangle(i);
			for (int j = 0; j < currentRow.length; j++) {
				System.out.print(currentRow[j] + " ");
			}
			System.out.println();
		}
	}

	// get the nth row.
	// For example: n=1 ==> {1}, n=2 ==> {1, 1}, ...
	public static int[] getPascalTriangle(int n) {
		if (n == 1) {

			return new int[1];

		} else {

			int[] prevRow = getPascalTriangle(n - 1);
			int[] newRow = generateNextRow(prevRow);
			return newRow;
		}

	}

	// generate the next row based on the previous row
	// Ex. prevRow = {1} ==> nextRow = {1, 1}
	// Ex. prevRow = {1, 1} ==> nextRow = {1, 2, 1}
	public static int[] generateNextRow(int[] prevRow) {
		int[] newRow = new int[prevRow.length + 1];

		for (int i = 0; i < newRow.length; i++) {
			if (i == 0 || i == newRow.length - 1) {
				newRow[i] = 1;
			}

			else {
				newRow[i] = prevRow[i - 1] + prevRow[i];
			}
		}

		return newRow;

	}

	// Task 1.4: Using recursive approach to implement Towers of Hanoi problem.
	public static void moveTower(int disk, char source, char dest, char spare) {
		if (disk == 0) {
			System.out.println("di chuyen 1 " + source + " den coc " + dest);
			return;

		}
		moveTower(disk - 1, source, spare, dest);
		System.out.println("di chuyen " + disk + " tu coc " + source + " den coc " + spare);
		moveTower(disk - 1, spare, dest, source);
	}

	static void display(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

//	Task 2.1: Implement drawPyramid(int n) - This method takes as an input 
//	one integer value n and then output on console a pyramid 
//	as on figure below for example for n=4: 
	// X
	// XXX
	// XXXXX
	// XXXXXXX
	public static void drawPyramid(int n) {
		drawPyramidRecursive(n, n, 1);
	}

	public static void drawPyramidRecursive(int totalHeight, int n, int row) {
		if (row > totalHeight) {
			return;
		}
		printSpaces(n, row);
		printXCharacters(2 * row - 1);
		System.out.println();
		drawPyramidRecursive(totalHeight, n, row + 1);
	}

	public static void printSpaces(int n, int row) {
		if (n > row) {
			System.out.print(" ");
			printSpaces(n - 1, row);
		}
	}

	public static void printXCharacters(int count) {
		if (count > 0) {
			System.out.print("X");
			printXCharacters(count - 1);
		}
	}
	// Task 2.2 (Optional): Using other patterns for the drawPyramid method defined
	// in the
//	previous task.
	public static void drawPyramid2(int n) {
		drawTriangle(n,1);
	}

	public static void drawTriangle(int n, int current) {
		
		if (n == 0) {
			return;
		}

		for (int i = 1; i < n; i++) {
			System.out.print(" ");
		}

		for (int i = 1; i <= current * 2 - 1; i++) {
			System.out.print(current);
		}

		System.out.println();
		drawTriangle(n - 1, current + 1);
	}

	public static void main(String[] args) {
//		int[] arr = { 1, 4, 6, 4, 1 };
//		display(getPascalTriangle(6));
		// printPascalTriangle(6);
//		int n = 3; // Số tấm đĩa
//		char source = 'A'; // Cọc gốc
//		char dest = 'C'; // Cọc đích
//		char spare = 'B'; // Cọc trung gian

		// moveTower(n, source, dest, spare);
		// drawPyramid(4);
		drawPyramid2(5);
	}
}
