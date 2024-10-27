public class ElevenFortyFive {
        public static void main(String[] args) {
            int[] num = new int[30];
            int[] chet = new int[30];
            int[] nechet = new int[30];
            for (int i = 1; i < 30; i++) {
                num[i]=i;
                if(num[i]%2==0){
                    num[i]=chet[i];
                }
                else{
                    num[i]=nechet[i];
                }
            }
            System.out.println(chet[15]);
            System.out.println(nechet[15]);
        }
}
