import java.util.Scanner;

public class Program2 {
    static  int count = 1;
    static void  printsomething(int n)
    {
        if(n < count )
            return;
        System.out.println("Java");
        count++;
        printsomething(n);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n");
        int n =sc.nextInt();
        printsomething(n);

    }
}
