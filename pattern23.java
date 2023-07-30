public class pattern23 {
    public static void main(String [] args ){
        int k=7;
        for(int i=0;i<=k;i++){
            for(int j=0;j<i;j++){
                if(i!=k){
                    if(j==0 || j==i-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{ System.out.print("*");

                }
            }System.out.println();

        }

    }
}
