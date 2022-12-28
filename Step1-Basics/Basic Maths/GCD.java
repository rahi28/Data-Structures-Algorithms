import java.util.Scanner;

public class GCD {
    static  int gcd_no(int a, int b)
    {
        if(b==0) return a;
        return gcd_no(b,a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num1");
        int n1 =sc.nextInt();
        System.out.print("Enter num2");
        int n2 =sc.nextInt();

//        int n= Math.min(n1,n2);
//        int max =0;
//        for(int i=1;i<=n;i++)
//        {
//            if(n1%i == 0 && n2%i == 0)
//            {
//                max = i;
//            }
//        }
//        System.out.print("Maximum divisor is "+ max);
            int ans = gcd_no(n1,n2);
        System.out.println(ans);
    }
}
