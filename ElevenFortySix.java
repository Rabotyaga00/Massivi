import java.util.Random;
import static java.lang.Math.sqrt;

public class ElevenFortySix {
    public static float getRandomNumber(float min, float max) {
        Random random = new Random();
        return min + random.nextFloat() * (max - min);
    }

    public static void main(String[] args) {
        float min = -10;
        float max = 10;
        float[] num = new float[30];
        for (int i = 0; i < 30; i++) {
            num[i] = getRandomNumber(min, max);
            if (num[i] < 0) {
                num[i]*=-1;
            }
            System.out.println(num[i]);
        }
        second();
    }
    public static void second() {
        float min = -10;
        float max = 10;
        float[] num = new float[30];
        for (int i = 0; i < 30; i++) {
            num[i] = getRandomNumber(min, max);
            if (i % 2 != 0 && num[i] >= 0) {
                num[i] = (float) Math.sqrt(num[i]);
            }
            System.out.println(num[i]);
        }
    }
}