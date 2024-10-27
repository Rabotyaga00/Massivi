import java.util.Random;

public class ElevenSixtyNine {
    public static float getRandomNumber(float min, float max) {
        Random random = new Random();
        return min + random.nextFloat() * (max - min);
    }

    public static void main(String[] args) {
        float min = -10;
        float max = 10;
        int a = 0;
        int b = 5;
        int count = 0;
        float[] num = new float[30];
        for (int i = 0; i < 30; i++) {
            num[i] = getRandomNumber(min, max);
            if (a<num[i] && b>num[i]) {
                count ++;
            }
        }
        System.out.println(count);
    }
}
