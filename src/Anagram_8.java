//Write a program to check if two given String is Anagram of each other.
// Your function should return true if two Strings are Anagram, false otherwise.
// A string is said to be an anagram if it contains same characters and same length but in different order
// e.g. army and Mary are anagrams.

public class Anagram_8 {
    public static void main(String[] args) {
        String str1 = "army";
        String str2 = "Mary";
        System.out.println(checkAnagram(str1, str2));
    }

    public static boolean checkAnagram(String s1, String s2){
        boolean result = true;
        String s1Up = s1.toUpperCase();
        String s2Up = s2.toUpperCase();


        char[] arr1 = s1Up.toCharArray();
        char[] arr2 = s2Up.toCharArray();
        sort(arr1);
        sort(arr2);
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length-1; i++) {
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    static void sort(char arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            char key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
