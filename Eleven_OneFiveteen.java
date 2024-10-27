import java.util.Random;

public class Eleven_OneFiveteen {
    public static int getRandomNumber(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min + 1);
    }

    public static void main(String[] args) {
        int min = 120;
        int max = 150;
        int count = 0;
        int[] num = new int[40];
        for (int i = 0; i < 40; i++) {
            num[i] = getRandomNumber(min, max);
            if (i > 0 && num[i] > num[i - 1]) {
                count=i;
            }
        }
        System.out.println(count);
        sec();
    }
    public static void sec() {
        int min = 120;
        int max = 150;
        int count = 0;
        int k=0;
        int[] num = new int[40];
        for (int i = 0; i < 40; i++) {
            num[i] = getRandomNumber(min, max);
            if (i > 0 && num[i] >= num[i - 1]) {
                count=num[i];
                k=i;
                if(num[i]==count){
                    k=i;
            }
        }
    }
        System.out.println(k);
}
}
