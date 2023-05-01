import java.util.Scanner;

public class Task03 {
}
class PSuffix{

    static void M(String s){
        int i = 0;
        while (i<s.length()){
            System.out.println("Substring : " + s.substring(0,i+1));
            System.out.println("-".repeat(30));
            countSamePrefixSuffix(s.substring(0,i+1),s.substring(0,i+1).length());
            i++;
        }
    }
    static void countSamePrefixSuffix(String s, int n){
        // Stores the prefix string
        String prefix = "";

        for(int i = 0; i < n - 1; i++){
            // Add the current character to the prefix string
            prefix += s.charAt(i);

            // Store the suffix string
            String suffix = s.substring(n - 1 - i, n);
            System.out.print("Proper prefix: " + prefix + ", Proper suffix: " + suffix);

            // Check if both the strings are equal or not
            if (prefix.equals(suffix)){
                System.out.print(" *"+ prefix.length());
            }

            System.out.println();
        }
    }
    public static int[] computeNextArray(String x){
        int[] next = new int[x.length() + 1];
        next[0] = -1;
        int i = 0, j = -1;
        while(i < x.length()){
            while(j == -1 || i < x.length() && (x.charAt(i) == x.charAt(j))){
                i++;
                j++;
                next[i] = j;
            }

            j = next[j];
        }

        return next;
    }



    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String st = input.nextLine();
        String S =  "ABCAABC";
        int N = S.length();
        M(st);
    }
}

