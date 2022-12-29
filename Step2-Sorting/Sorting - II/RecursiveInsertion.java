import java.util.Scanner;

public class RecursiveInsertion {
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void insertion(int arr[],int n)
    {
        if(n<=1)
            return;

        insertion(arr,n-1);
        int last = arr[n-1];
        int j= n-2;
        while(j>=0 && arr[j]>last)
        {
            arr[j+1] = arr[j];
            j--;
        }
        arr[j+1] =last;

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
        insertion(arr,n);
        System.out.print("After  :");
        printArray(arr);
    }
}
