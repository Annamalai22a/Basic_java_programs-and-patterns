public class freq {
    public static void main (String args[]){
        int number =5;
        int [] array1 ={10,2,3,4,5,6,5,2,5,7,9};
        int count=0;
        for(int i=0;i<array1.length;i++){
            if (number == array1[i]){
                count+=1;
            }

        }
        System.out.println("count of number "+number+"is"+count);
    }
}
