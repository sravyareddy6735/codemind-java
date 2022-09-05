import java.util.*;
class UniqueNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=Integer.toString(n);
        int l=s.length();
        int flag=0,i,j;
        for (i=0;i<l-i;i++)
        {
            for (j=i+1;j<l;j++){
                if(s.charAt(i)==s.charAt(j))
                {
                    flag=1;
                break;
                }
            }
        }
        if(flag==0)
        System.out.println("Unique Number");
        else
         System.out.println("Not Unique Number");
        
    }
}
