import java.util.*;
class prime{
    int checkPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }return 1;
    }
}public class sumprime {
    public static void main(String[] args){
        prime p1=new prime();
        int [] ar={142,568,789,112};
        int sum=0;
        int num;
        int div;
        for(int i=0;i<=1;i++) {
            num=ar[i];
            sum=0;
            for (int j = 0; j<=2; j++) {

                div=num%10;
                num=num/10;
                sum+=div;
            }
            if(p1.checkPrime(sum)==1){
                System.out.print(ar[i]+", ");}

        }System.out.print(" are the number having sum as a prime :-)");}}
