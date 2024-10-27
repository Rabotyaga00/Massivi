import java.util.Random;

public class ElevenFortyThree {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        int min = 0;
        int max = 10;
        int sum = 0 ;
        int[] num = new int[30];
        for (int i = 0; i < 30; i++) {
            num[i] =getRandomNumber(min, max);
            if (num[i]==0){
                sum++;
            }
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }
        System.out.println(sum);
    }
}
