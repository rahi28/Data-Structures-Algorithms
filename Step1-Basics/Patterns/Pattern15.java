import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number for size n ");
        int n = sc.nextInt();

        for(int i=n;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print((char) (65 + j));
            }
            System.out.println();
        }
    }
}
