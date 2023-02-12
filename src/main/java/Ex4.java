public class Ex4 {
    public static void main(String[] args) {
        int[][] array = {{9, 3, 1}, {2, 7, -4}};
		int counter = 0;

		for (int[] subArray : array) {
			for (int element : subArray) {
				if (element > 0) {
					counter++;
				} else {
					counter--;
				}
			}
		}
		if (counter == 0) {
			System.out.println("=");
		} else {
			System.out.println(counter > 0 ? "положительных" : "отрицательных");
		}
    }
}
