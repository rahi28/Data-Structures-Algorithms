import java.util.Scanner;

public class QuickSort {
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    static void Quick(int arr[],int l,int r)
    {
        if(l<r) {
            int pivot = partition(arr, l, r);
            Quick(arr,l,pivot-1);
            Quick(arr,pivot+1,r);
        }
    }
    static int partition(int arr[],int low,int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j)
        {
            while(arr[i] <= pivot && i<=high-1)
                i++;
            while(arr[j] > pivot && j>=low)
                j--;

            if(i<j)
            {
                int temp =arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp =arr[low];
        arr[low] = arr[j];
        arr[j] = temp;
        return j;
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
        Quick(arr,0,n-1);
        System.out.print("After  :");
        printArray(arr);
    }
}
