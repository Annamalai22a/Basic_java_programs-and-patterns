public class near5 {
    public static void main(String [] args){
        int number =12,r,s,c;
        s=number%5;
        if(s>2){
            number+=s;
            s=number%5;
            r=number-s;

        }
        else{
            r=number-s;

        }
        System.out.println("result"+r);
    }
}
