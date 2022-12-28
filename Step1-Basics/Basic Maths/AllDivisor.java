import java.util.Scanner;

public class AllDivisor {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter no n ");
        int n= sc.nextInt();
        System.out.println();
        for(int i=1;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                System.out.print(i + " ");
                if(i != n/i)
                     System.out.println(n/i + " ");

            }
        }
    }
}
