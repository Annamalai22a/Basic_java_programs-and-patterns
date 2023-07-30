public class pattern22 {
    public static void main(String args[]){//driver function
    { int k =5;
        for(int i=0;i<k;i++){
            for(int j=0;j<k;j++){
                if(i==0 ||i==k-1) System.out.print("*");
                else{
                    if(j==0 || j==k-1) System.out.print("*");
                    else System.out.print(" ");
                }
            }System.out.println();
        }System.out.println();


    }
    }
}