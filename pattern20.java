public class pattern20 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j);
            }

            for (int j = 1; j <= i - 1; j++) {

                System.out.print(j);

            }
            System.out.println();

        }
    }
}

