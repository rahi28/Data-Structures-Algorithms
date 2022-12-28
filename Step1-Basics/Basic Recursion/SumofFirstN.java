import java.awt.*;
import java.util.Scanner;

public class SumofFirstN {
    static  int s =0;
    // Recursive way
//    static void doSum(int n)
//    {
//        if(n < 1)
//            return;
//        s+=n;
//        doSum(--n);
//    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();
        //doSum(n);
        s = n * (n+1) /2;
        System.out.println("Total sum is  "+ s);
    }
}
