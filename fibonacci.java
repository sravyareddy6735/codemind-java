import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t1=0,t2=1;
        int n=sc.nextInt();
        int i=1;
        while(i<=n)
        {
            System.out.print(t1 + " ");
            int sum=t1+t2;
            t1=t2;
            t2=sum;
            i++;
        }
    }
}