import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n");
        int n = sc.nextInt();

//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print(n-j+1+ " ");
//            }
//            for(int j=1;j<2*(n-i);j++)
//            {
//                System.out.print(n-i+1+ " ");
//            }
//            for(int j=i;j>=1;j--)
//            {
//                if(j==n) continue;
//                System.out.print(n-j+1 +" ");
//            }
//            System.out.println();
//        }
//
//
//        for(int i=1;i<n;i++)
//        {
//
//            for(int j=n;j>i;j--)
//            {
//                System.out.print(j+ " ");
//            }
//            for(int j=1;j<2*i;j++)
//            {
//                System.out.print(i+1+ " ");
//            }
//            for(int j=i;j<n;j++)
//            {
//                System.out.print(j+ 1 + " ");
//            }
//            System.out.println();
//        }


        int d = n*2;
        for(int i=1;i<d;i++)
        {
            for(int j=1;j<d;j++)
            {
                int index =n -  Math.min(Math.min(i,j),Math.min(d-i,d-j))+1;
                System.out.print(index+ " ");
            }
            System.out.println();
        }
    }
}
