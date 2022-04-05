package entornos;

import java.util.Scanner;

/**
 * IntersperseStrings class
 * @author Cristina Mesa
 */
public class IntersperseStrings {
    public static void main(String[] args) {
        String s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter text:");
        s1=sc.nextLine(); //range 20
        System.out.println("Please enter text:");
        s2=sc.nextLine(); //si s1<s2 se corta y si s1>s2 da error
        System.out.println(intersperse(s1,s2));
    }
    /**
     * Creates a string where you alternately add one character from the first string and one from the second.
     * @param s1
     * @param s2
     * @return the intermixed string
     */
    private static String intersperse(String s1, String s2) {
        String intersperse = "";
        
        for (int i = 0; i < s1.length(); i++) {
            System.out.print(s1.charAt(i));
            for (int j = 0; j < s2.length(); j++) {
                System.out.print(s2.charAt(i));
                break;
            }
        }
        return intersperse;
    }
}