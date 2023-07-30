public class pattern31 {public static void main(String []args){
    int  k=6;
        for(int i=0;i<k;i++){
        for(int j=0;j<k-i-1;j++){
            System.out.print(" ");
        }
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
    k = 5;
        for (int i = 0; i < k; i++) {
        for (int j = 0; j <i+1; j++) {
            System.out.print(" ");

        }
        for (int j = 0; j <(k-i); j++) {
            System.out.print("*");

        }
        System.out.println();
    }

}}
