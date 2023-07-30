class test
{ int checkPrime(int n)
    {for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return 0;
            }
        }
        System.out.println(n);
        return 1;
    }
}public class primecount
{ public static void main(String []args)
    {test t2=new test();
        int[] t1={1,2,3,4,5,6,7,8,9,10};
        int cnt=0;
        for (int i=t1[1];i<=t1[9];i++)
        {
            if(t2.checkPrime(i)==1)
            {
                cnt+=i;
            }
        }System.out.println(" count   of prime numbers in the given array: "+cnt);
    }
}