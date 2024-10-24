//Check for Armstrog Number
import java.util.*;
public class Question4 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int a,b,c,d,s=0;
        a=b=n;
        c=0;
        while(a!=0)
        {
            d=a%10;
            if(d>0)
            {
            c++;
            }
            a/=10;

        }
        d=0;
        while(b!=0)
        {
            d=b%10;
            s=(int) (s+Math.pow(d,c));
            b=b/10;
        }
        if(s==n)
        System.out.println("Armstrong Number");
        else
        System.out.println("Not an Armstrong Number");
        
    }
    
}
