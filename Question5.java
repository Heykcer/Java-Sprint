//Fibonacci Series
import java.util.*;
public class Question5
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the limit");
        int s=0;int a=0,b=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println(a);
            s=a+b;
            a=b;
            b=s;
        }
        sc.close();
    }
}