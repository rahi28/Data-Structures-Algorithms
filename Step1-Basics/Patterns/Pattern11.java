import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of n");
        boolean flag;
        int n = sc.nextInt();
        for(int i=1 ; i<=n; i++)
        {
            if(i % 2 == 0)  flag=false;
            else flag = true;
            for(int j=1;j<=i;j++)
            {
                if(flag)
                    System.out.print("1");
                else
                    System.out.print("0");
                flag=!flag;
            }
            System.out.println();
        }
    }
}
