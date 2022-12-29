import java.util.Scanner;

public class SelectionSort {

    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void selection(int arr[],int n)
    {

        for (int i = 0; i < n; i++) {
            int min_i = i;
            for (int j = i+1; j < n; j++) {
                if(arr[j] < arr[min_i])
                {
                    min_i = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min_i];
            arr[min_i] = temp;
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
        selection(arr,n);
        System.out.print("After  :");
        printArray(arr);
    }
}
