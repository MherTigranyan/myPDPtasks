//You need to write a simple Java program to check if a given String is palindrome or not.
// A Palindrome is a String which is equal to the reverse of itself
// e.g. "Bob" is a palindrome because of the reverse of "Bob" is also "Bob"

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Boolean result = true;
        String str2 = str.toUpperCase();
        char[] ch = str2.toCharArray();
        for (int i = 0, j=ch.length-1 ; i < j; i++, j--) {
            if (ch[i] != ch[j]){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
