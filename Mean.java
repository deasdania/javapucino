public class Mean {
    private static float nameMean(float[] numbers) {
        int n = numbers.length;
        float sum = 0;

        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        return sum / (float) n;
    }

    public static void main(String[] args) {
        float[] value = { 1, 2, 3, 4 };
        System.out.println(nameMean(value)); // 2.5
    }
}
