import java.util.Scanner;
public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of n ");
        int n =sc.nextInt();

//        for(int i=0;i<n;i++)
//        {
//            for(int j=0;j<=i;j++)
//            {
//                System.out.print(j+1+ " ");
//            }
//            for(int j=i+1;j<(n*2)-(i+1);j++)
//            {
//                System.out.print("0 ");
//            }
//            for(int j=(n*2);j>(n*2)-(i+1);j--)
//            {
//                System.out.print((j/2) - n + i+ 1 +" ");
//            }
//            System.out.println();
//        }

        for(int i = 1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            for(int j=1; j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(int j=i; j>0;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
