public class pattern21 {public static void main(String[] args) {

    int n=5;
    for(int i=1;i<=5;i++) {
        for (int space = 1; space <= 5 - i; space++) {

            System.out.print(" ");
        }

        for (int j = i; j>=1; j--) {

            System.out.print(i);


        }
        System.out.println();

    }}
}
