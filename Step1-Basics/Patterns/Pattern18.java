import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n ");
        int n= sc.nextInt();

        for(int i = 0 ;i<=n;i++)
        {

            for(int j=i;j>0;j--)
            {
                System.out.print((char)(65 + n - j));
            }
            System.out.println();
        }

    }
}
