import  java.util.Scanner;
public class Pattern13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of  n ");
        int n = sc.nextInt();
        int x = 1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(x++ + " ");
            }
            System.out.println();
        }
    }
}
