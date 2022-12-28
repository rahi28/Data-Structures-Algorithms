import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class CountingFrequency {

    static void findFrequency(int[] input, int n)
    {
        for (int i = 0; i < n; i++)
            input[i]--;

        for (int i = 0; i < n; i++)
            input[input[i] % n] += n;

        for (int i = 0; i < n; i++) {
            if ((input[i] / n) != 0)
                System.out.println(
                        "Element " + (i + 1) + " occurs "
                                + input[i] / n + " times");
            // Change the element back to original value
            input[i] = input[i] % n + 1;
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size n ");
        int n =sc.nextInt();
        System.out.print("Enter array values : ");
        int arr[] =new int[n];
        for (int i =0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }
        findFrequency(arr,n);


    }
}
