public class dimond {
    public  static void main (String[]agrs){
        int row=4;
        String e=" ",a="* ";
        for(int i=1;i<=row;i++) {

            for (int j=1;j<=row-i+1;j++){
                System.out.print(" ");

            }

            for(int x=1;x<=i;x++){
                System.out.print(a);
            }
            System.out.println();
        }
    }
}
