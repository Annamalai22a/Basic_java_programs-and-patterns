public class alphacount {
    public static void main(String args[]) {
        String a = "aabbccc";
        counter1(a);
    }

    static void  counter1(String a){
        String []ar1=new String[a.length()];
        String []ar2=new String[a.length()];
        char a1;
        int j=0;
        char a2=a.charAt(0);
        for(int i=0;i<a.length();i++){
            a1=a.charAt(i);

            if(a1==a2){
                j=j+1;

            }
            else if(a1!=a2){
                ar2[i-1]=String.valueOf(a2);
                int j1=i;
                ar2[j1]=String.valueOf(j);

                a2=a.charAt(i+1);
                j=0;
                if (a1==a2){
                    j+=1;
                    //System.out.println(j+"......."+a2);

                }

            }
            else{
            a2=a.charAt(i+1);
            j=0;}

        }
        System.out.println(ar2);
        for(String s1:ar2){
            System.out.println(s1);
        }


    }

}

