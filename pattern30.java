public class pattern30 {
    public static void main(String[] args) {
        int  k=6;
        for(int i=0;i<k;i++){

            for(int j=2;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        k = 5;
        for (int i = 0; i < k; i++) {

            for (int j = 2; j <2*(k-i)-1; j++) {
                System.out.print("*");

            }
            System.out.println();
        }


    }
}
