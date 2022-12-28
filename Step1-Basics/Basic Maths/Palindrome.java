import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number");
        int n = sc.nextInt();
        int original = n;
        int rev = 0;
        while(n>0)
        {
            int rem = n%10;
            rev= rev * 10 + rem;
            n=n/10;
        }
       if(rev == original)
           System.out.println("Palindrome");
       else
           System.out.println("Not Palindrome");
    }
}
