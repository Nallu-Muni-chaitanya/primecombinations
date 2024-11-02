import java.util.Scanner;
class CPrime
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        //checkPrime(n);
        //System.out.println(res);
        printPrimes(n,m);
        
    }
    
    public static void checkPrime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }
    
    public static void printPrimes(int n,int m)
    {
        for(int i=n;i<=m;i++)
        {
            if(checkPrime(i))
            {
                System.out.println(i);
            }
        }
    }
} 
