import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String st = input.nextLine();
        System.out.println("Enter the pattern");
        String pattern = input.next();
        Method(pattern,st);
    }
    public static void Method(String pattern, String s){
        Boolean b = false;
        for(int i = 0;i<=s.length()-pattern.length();i++){
            if(pattern.equals(s.substring(i,pattern.length()+i))){
                b = true;
            System.out.println(s);
            System.out.println(" ".repeat(i) + pattern);
            System.out.println(" ".repeat(i) + i);
            }
        }
        if (!b)
            System.out.println("Pattern not found.");
    }
}
