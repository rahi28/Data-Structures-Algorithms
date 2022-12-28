import java.util.Scanner;

public class PrintNto1 {

    static void  printsomething(int n)
    {
        if(n  < 1)
            return;

        System.out.println(n);
        printsomething(--n);


    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n =sc.nextInt();
        printsomething(n);

    }
}
