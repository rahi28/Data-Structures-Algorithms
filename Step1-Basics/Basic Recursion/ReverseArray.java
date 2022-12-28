import java.util.Scanner;

public class ReverseArray {

//    static int[] res;
//
//    static  void revArr(int arr[],int n)
//    {
//        if(n<0)
//            return;
//        revArr(arr,n-1);
//        res[n] = arr[arr.length - n -1];
//    }
    static  void revArr(int arr[],int start,int end)
    {
        if(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            revArr(arr,start+1,end -1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array ");
        int n = sc.nextInt();
        System.out.print("Enter array element");
        int[] arr = new int[n];
//        res = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        //revArr(arr,n-1);
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]+ " ");
//        }

        revArr(arr,0,n-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}
