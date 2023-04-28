import java.util.Random;

public class AlirezaNewClass {

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
        int[] dp = new int[LIM];
        dp[0] = Math.max(0, arr[0]);
        for (int i = 1; i < LIM; i++) {
            dp[i] = Math.max(0, dp[i-1] + arr[i]);
        }
        int max = 0;
        for (int i = 0; i < LIM; i++) {
            if (dp[i] > max) max = dp[i];
        }
        return max;
    }
}
