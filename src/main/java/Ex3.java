import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {7, 6, 8, 2, 3, 6, 1, -1};
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = array[i] + array[array.length - 1 - i];
            array[array.length - 1 - i] = array[i] - array[array.length - 1 - i];
            array[i] = array[i] - array[array.length - 1 - i];
        }
        System.out.println(Arrays.toString(array));
    }
}
