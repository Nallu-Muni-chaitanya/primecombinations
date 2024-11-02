import java.util.Scanner;
public class Primecombinations 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("enter the n value");
        int n=sc.nextInt();
       // System.out.println("enter the m value");
       // int m=sc.nextInt();
        //boolean res=Checkprime(n);
        //System.out.println(res);
       // PrintPrimes(n,m);
       //int n=sc.nextInt();
      int []arr= new int [n];
      for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
      Pair_Of_Primenumbers(arr);
    }
    public static boolean Checkprime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void PrintPrimes(int n,int m)
    {
        for(int i=n;i<=m;i++)
        {
            if(Checkprime(i))
            {
                System.out.println(i);
            }
        }
    }
    public static void Pair_Of_Primenumbers(int []arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(Checkprime(arr[i]))
                {
                    System.out.println(arr[i] + " "+arr[j]);
                }
            }
        }
    }
    
}
