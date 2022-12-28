import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any number");
        int n = sc.nextInt();
        int o = n;
        int ans=0;
        int nod = 0;
        while(n>0)
        {
            nod++;
            n = n/10;
        }
        n=o;
        while(n>0)
        {
            int x = n%10;
            ans = ans + (int) Math.pow(x,nod);
            n = n/10;
        }
        if(o == ans)
            System.out.println("Amstrong");
        else
            System.out.println("Not Amstrong");
    }
}
