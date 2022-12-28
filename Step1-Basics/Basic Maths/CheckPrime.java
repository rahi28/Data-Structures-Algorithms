import java.util.Scanner;

public class CheckPrime {

    static boolean prime(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            if(n%i == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter n " );
        int n = sc.nextInt();

        if(n!=1 && prime(n))
            System.out.println(" Prime");
        else
            System.out.println("Not Prime");
    }
}
