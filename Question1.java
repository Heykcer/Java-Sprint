//Determining Even/Odd Number
import java.util.*;
public class Question1
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number");
int n = sc.nextInt();
if(n%2==0)
System.out.println("The number is Even");
else
System.out.println("The number is Odd");
}
}