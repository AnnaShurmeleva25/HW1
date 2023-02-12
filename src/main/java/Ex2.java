public class Ex2 {
    public static void main(String[] args) {
        int a = 3;
		int b = 8;
		int sum = 4;
		int n = 9;

		for (int i = 2; i < n; i++) {
			int c = a + b;
			if (c % 2 == 0) {
				sum += c;
			}
			a = b;
			a = c;
		}
		System.out.println(sum);
    }
}
