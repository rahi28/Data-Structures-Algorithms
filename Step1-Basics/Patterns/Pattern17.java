import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size of n ");
        int  n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            char alp = 'A';
            for(int j = n ; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 1 ; j <= i; j++){
                System.out.print(alp++);
            }
            --alp;
            for(int j = 1 ; j < i; j++){
                System.out.print(--alp);
            }
            System.out.println();
        }
    }
}
