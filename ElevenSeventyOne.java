import java.util.Random;

public class ElevenSeventyOne {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        int min = 1;
        int max = 5;
        int count = 0;
        int[] num = new int[10];
        for (int i = 0; i < 10; i++) {
            num[i] = getRandomNumber(min, max);
            if (num[i]==4 || num[i]==5) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
