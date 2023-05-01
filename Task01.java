import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text pattern: ");
        String s = input.next();
    System.out.println("Longest non-overlapping suffix that is also a prefix is: " + LongestPrefixSuffix(s) +" and its length is: " +longestPrefixSuffix(s));
    }
    static int longestPrefixSuffix(String s) {
        int n = s.length();
        // If n is less than 2
        if(n < 2) {
            return 0;
        }
        int len = 0;
        int i = (n + 1)/2;
        // Iterate i till n
        while(i < n){
            // If s.charAt(i) is equal to
            // s.charAt(len)
            if(s.charAt(i) == s.charAt(len)){
                ++len;
                ++i;
            }
            else{
                i = i - len + 1;
                len = 0;
            }
        }
        // Return len
        return len;
    }
    static String LongestPrefixSuffix(String s)
    {
        // Get the length of the longest prefix
        int len = longestPrefixSuffix(s);

        // Stores the prefix
        String prefix = "";

        // Traverse and add characters
        for (int i = 0; i < len; i++)
            prefix += s.charAt(i);

        // Returns the prefix
        return prefix;
    }
}
