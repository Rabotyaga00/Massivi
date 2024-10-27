public class ElevenTwentyEight {
    public static void main(String[] args) {
        int sum = 0 ;
        int weight = 500;
        int[] num = new int[30];
        for (int i = 0; i < 30; i++) {
            num[i]=i;
            sum += i;
        }
        for (int i = 0; i < 30; i++) {
            System.out.println("num[" + i + "] = " + num[i]);
        }
        if (weight>sum){
            System.out.println("weight>sum :"+sum);
        }
        else {
            System.out.println("Error");
        }
    }
}