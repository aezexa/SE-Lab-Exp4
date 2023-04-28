import java.util.Random;

public class AlirezaClass {

    private static int LIM = 100000;
    public static void main(String[] args) {
        int[] arr = new int[LIM];
        Random random = new Random();

        for (int i = 0; i < LIM; i++) {
            arr[i] = random.nextInt(2 * LIM) - LIM; // generate a random number between -100000 and +100000
        }
        System.out.println(calculate(arr));
    }

    static int calculate(int[] arr) {
        int max = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 100000; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                if (sum > max) max = sum;
            }
        }
        return max;
    }
}
