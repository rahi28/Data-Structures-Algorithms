import java.util.Scanner;

public class RecursiveBubbleSort {
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void bubble(int arr[],int n)
    {
        if(n==1)
            return;
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                count++;
            }
        }
        if(count==0)
            return;

        bubble(arr,n-1);

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter array size n");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Before  :");
        printArray(arr);
        bubble(arr,n);
        System.out.print("After  :");
        printArray(arr);
    }
}
