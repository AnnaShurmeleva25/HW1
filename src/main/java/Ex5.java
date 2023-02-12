public class Ex5 {
    public static void main(String[] args) {
        int[][] array = {
				{8, 4, 0, 0, 0},
				{3, 0, 0, 0, 0},
				{7, 5, 7, 0, 0},
				{2, 0, 4, 6, 0},
				{1, 4, 1, 0, 2}
		};

		boolean Triangle = true;
		label:for (int i = 0; i < array.length - 1; i++) {
			if(array[i].length != array.length) {
				return;
			}
			for (int j = i + 1; j < array[i].length; j++) {
				if (array[i][j] != 0) {
					Triangle = false;
					break label;
				}
			}
		}
		System.out.println(Triangle);
    }
}
