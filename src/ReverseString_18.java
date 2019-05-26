//How to reverse String in Java using Iteration and Recursion

public class ReverseString_18 {
    public static void main(String[] args) {
        String str = "Java";
        String result = reverseRecursion(str);
        System.out.println("The reversed string is: " + result);

    }

    public static String reverseRecursion(String str) {
        if (str.isEmpty()){
            System.out.println("String is Empty");
            return str;
        }
        return reverseRecursion(str.substring(1)) + str.charAt(0);
    }
}
