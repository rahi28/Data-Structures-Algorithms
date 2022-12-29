import java.util.Scanner;

public class MergeSort {
    static void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
    static  void conqurermerge(int arr[],int l, int mid,int r) {
        int i = l;
        int j = mid + 1;
        int f = l;
        int temp[] = new int[1000];

        while (i <= mid && j <= r)
        {
            if(arr[i]<arr[j])
            {
                temp[f] = arr[i];
                i++;
            }
            else
            {
                temp[f] = arr[j];
                j++;
            }
            f++;
        }

        if(i>mid)
        {
            while(j<=r)
            {
                temp[f] = arr[j];
                f++;
                j++;
            }
        }
        else
        {
            while(i<=mid)
            {
                temp[f] = arr[i];
                f++;
                i++;
            }
        }
        for (int k = l; k <= r; k++) {
            arr[k] = temp[k];
        }
    }
    static void dividemerge(int arr[],int l,int r)
    {
        if(l<r){
            int mid = (l + r)/2;
            dividemerge(arr,l,mid);
            dividemerge(arr,mid+1,r);
            conqurermerge(arr,l,mid,r);
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
        dividemerge(arr,0,n-1);
        System.out.print("After  :");
        printArray(arr);
    }
}
