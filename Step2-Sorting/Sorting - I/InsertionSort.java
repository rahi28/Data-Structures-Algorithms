import java.util.Scanner;

public class InsertionSort {
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    static void insertion(int arr[],int n)
    {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>current)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
            printArray(arr);
        }
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
        System.out.println();
        insertion(arr,n);
        System.out.print("After  :");
        printArray(arr);
    }
}
