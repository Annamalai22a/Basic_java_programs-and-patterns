public class pattern28 {
    public static void main(String[] args) {
        int  k=6;
        for(int i=0;i<k;i++){
            for(int j=0;j<k-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                if(i==0 || i==k) System.out.print("*");
                else{
                    if(j==0 || j==2*i) System.out.print("*");
                    else System.out.print(" ");
            }}
            System.out.println();
        }
        k = 5;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j <i+1; j++) {
                System.out.print(" ");

            }
            for (int j = 0; j <2*(k-i)-1; j++) {
                if(i==k) System.out.print("*");
                else{
                    if(j==0 || j==2*(k-i)-2) System.out.print("*");
                    else System.out.print(" ");
                }

            }
            System.out.println();
        }

    }
}
