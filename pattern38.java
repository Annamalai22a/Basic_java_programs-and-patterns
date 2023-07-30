public class pattern38 {
    public static void main(String[] args) {

        int k = 7;
        for (int i = 0; i < k; i++) {

            for (int j = 0; j <k; j++) {
                if(i==0 || i==k-1) System.out.print("*");
                else{
                    if(j==k/2) System.out.print("*");
                    else System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
