import java.util.Scanner;
public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter value of n ");
        int n =sc.nextInt();
        //int n = (x*2)-1;
        for (int i=0; i<n; i++)
        {
            for (int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }

            for (int j=0; j<=i; j++ ) {

                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {

            for(int j=1;j < i; j ++)
            {
                System.out.print(" ");
            }
            for(int j=i;j<=n;j++)
            {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
