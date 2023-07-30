
public class operators {
    public  static  void main(String[] args){
        System.out.println(getsum("12345+-*+"));

    }
    public static int getsum(String s) {
        if (s == "") {
            return 0;

        }
        int sum = Integer.parseInt(s.charAt(0) + "");

        int opindex=(s.length()/2)+1;

        for(int i=1;i<=(s.length()/2);i++){
            int val =Integer.parseInt(s.charAt(i)+"");
            String i1="+";
            String i2="-";
            String i3="*";
            String a1=String.valueOf(s.charAt(opindex));

            if(a1.compareTo(i1)==0){
                sum+=val;

            }
            else if (a1.compareTo(i2)==0){
                sum-=val;

            }
            else if (a1.compareTo(i3)==0){
                sum*=val;
            }
            else{
                System.out.println("error");
            }
            opindex++;

        }
        return sum;
    }}

