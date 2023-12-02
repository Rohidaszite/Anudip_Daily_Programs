/*
  10101
  0101
   101
    01
     1
 */

class pattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // for(int j=1;j<=6-i;j++){
            for (int j = i; j <= 5; j++) {
                if (j % 2 == 0)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}