import java.util.Scanner;

public class PalindromeString {

//    static boolean CheckPalindrome(String s,int start, int end)
//    {
//        if(start<end)
//        {
//            if(s.charAt(start) != s.charAt(end))
//            {
//                return false;
//            }
//            return CheckPalindrome(s,start+1,end-1);
//        }
//        return true;
//    }

    static boolean f(int i, String s)
    {
        if(i>=s.length()/2) return true;
        if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        return  f(i+1,s);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string ");
        String s = sc.next();

        //System.out.println(CheckPalindrome(s,0,s.length()-1));
        System.out.println(f(0,s));

    }
}
