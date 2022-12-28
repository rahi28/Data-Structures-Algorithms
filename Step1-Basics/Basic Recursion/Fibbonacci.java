import java.util.Scanner;

public class Fibbonacci {
//    static int a =0 ;
//    static int b = 1;
//    static void Fibo(int n)
//    {
//        if(n < 0)
//            return;
//
//        System.out.println(a+b);
//        int temp =a;
//        a = b;
//        b = temp + b;
//        Fibo(--n);
//    }
    static  int Fibo(int n)
    {
        if(n<=1)
            return n;
        return Fibo(n-1)+Fibo(n-2);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number n");
        int n =sc.nextInt();
        System.out.println(Fibo(n));
//        int a = 0;
//        int b =1;
//        System.out.println(a);
//        System.out.println(b);
//        n--;
//        while(n>0)
//        {
//            int x = a+b;
//            System.out.println(x);
//            a =b;
//            b =x;
//            n--;
//        }

    }
}
