import java.util.Random;
public class Main {
            public static float getRandomNumber(float min, float max) {
                Random random = new Random();
                return min + random.nextFloat() * (max - min);
            }

            public static void main(String[] args) {
                int min = 0;
                int max = 1;
            float[] num = new float[15];
            for (int i = 0; i < 15; i++) {
                num[i] =getRandomNumber(min, max);
            }
            for (int i = 0; i < 15; i++) {
                System.out.println("num[" + i + "] = " + num[i]);
            }
            second();
            }
            public static void second() {
                float min = 22;
                float max = 23;
                float[] num = new float[15];
                for (int i = 0; i < 15; i++) {
                    num[i] = getRandomNumber(min, max);
                }
                for (int i = 0; i < 15; i++) {
                    System.out.println("num[" + i + "] = " + num[i]);
                }
                third();
            }

            public static void third() {
                float min = 0;
                float max = 10;
                float[] num = new float[15];
                for (int i = 0; i < 15; i++) {
                    num[i] = getRandomNumber(min, max);
                }
                for (int i = 0; i < 15; i++) {
                    System.out.println("num[" + i + "] = " + num[i]);
                }
                four();
            }
            public static void four() {
                float min = -50;
                float max = 50;
                float[] num = new float[15];
                for (int i = 0; i < 15; i++) {
                    num[i] = getRandomNumber(min, max);
                }
                for (int i = 0; i < 15; i++) {
                    System.out.println("num[" + i + "] = " + num[i]);
                }
                five();
            }
            public static void five() {
                float min = 0;
                float max = 10;
                float[] num = new float[15];
                for (int i = 0; i < 15; i++) {
                    num[i] = getRandomNumber(min, max);
                }
                for (int i = 0; i < 15; i++) {
                    System.out.println("num[" + i + "] = " + num[i]);
                }
            }
}
