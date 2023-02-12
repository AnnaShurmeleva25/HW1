public class Ex1 {
    public static void main(String[] args) {
        int n = 6;
        int[] array = {1, 5, 4, 8, 65, 2};
        int sum = 0;
        for (int element : array) {
            if (element != n) {
                sum += element;
            }
        }
        System.out.println(sum);
    }
}