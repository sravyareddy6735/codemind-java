import java.util.Scanner;
class AmicableNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int firstnum=sc.nextInt();
        int secondnum=sc.nextInt();
        int sum_firstnum=0;int sum_secondnum=0;
        for (int i=1;i<=firstnum;i++)
        {
            if(firstnum%i==0)
            sum_firstnum=sum_firstnum+i;
        }
        for (int i=1;i<=secondnum;i++)
        {
            if(secondnum%i==0)
            sum_secondnum=sum_secondnum+i;
        }
        if(sum_firstnum== sum_secondnum)
        System.out.println("Amicable");
        else
        System.out.println("Not Amicable");
    }
}