import java.util.Arrays;
import java.util.Scanner;

class Anagram {
    public static void checkAnagram(String s, String s1) {
        String s2 = s.toLowerCase().trim();
        String s3 = s1.toLowerCase().trim();

        if (s2.length() != s3.length()) {
            System.out.println("Not anagrams");
        } else {
            char[] ch = s2.toCharArray();
            char[] ct = s3.toCharArray();
            Arrays.sort(ch);
            Arrays.sort(ct);
            if (Arrays.equals(ch, ct)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not anagrams");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string:");
        String a = sc.nextLine();
        System.out.println("Enter second string:");
        String b = sc.nextLine();
        checkAnagram(a, b);
        sc.close();
    }
}
