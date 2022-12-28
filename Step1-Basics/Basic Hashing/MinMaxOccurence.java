import java.util.*;

public class MinMaxOccurence {


        static int findDiff(int arr[], int n)
        {
            // Put all elements in a hash map
            Map<Integer,Integer> mp = new HashMap<>();
            for (int i = 0 ; i < n; i++)
            {
                if(mp.containsKey(arr[i]))
                {
                    mp.put(arr[i], mp.get(arr[i])+1);
                }
                else
                {
                    mp.put(arr[i], 1);
                }
            }

            // Find counts of maximum and minimum
            // frequent elements
            int max_count = 0, min_count = n;
            for (Map.Entry<Integer,Integer> x : mp.entrySet())
            {
                max_count = Math.max(max_count, x.getValue());
                min_count = Math.min(min_count, x.getValue());
            }

            return (max_count - min_count);
        }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size n");
        int n  =sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array values");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDiff(arr,n));
    }
}
