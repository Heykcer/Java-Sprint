//Check for leap year
import java.util.*;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year");
        int n=sc.nextInt();
        if(n%4==0 && n%100!=0 || n%400==0)
        System.out.println("Leap Year");
        else
        System.out.println("Not a Leap Year");
    }
    
}
