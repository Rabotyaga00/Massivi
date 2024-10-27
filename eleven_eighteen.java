public class eleven_eighteen {
        public static void main(String[] args) {
            int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            for (int i = 0; i < 15; i++) {
                num[i] -=20;
                System.out.println("num[" + i + "] = " + num[i]);
            }
            second();
        }
        public static void second() {
            int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
            for (int i = 0; i < 15; i++) {
                num[i] *=num[14];
                System.out.println("num[" + i + "] = " + num[i]);
            }
            third();
        }
        public static void third() {
                int b = 5;
                int[] num = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
                for (int i = 0; i < 15; i++) {
                    num[i] *=b;
                    System.out.println("num[" + i + "] = " + num[i]);
                }
        }
}
