//Given a string S, find the longest palindromic substring in S.
// You may assume that the maximum length of S is 1000,
// and there exists one unique longest palindromic substring.

public class LongestPalindromString_23 {
    public static void main(String[] args) {
        String str = "abgdhelloollehezeytj";
        int len = str.length();
        int maxLength = 1;
        int tag = 0;
        int low,high;

        for (int i = 1; i < len; i++) {
            low = i - 1;
            high = i;
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
                if (high - low + 1 > maxLength){
                    tag = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }

            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < len && str.charAt(low) == str.charAt(high)){
                if (high - low + 1 > maxLength){
                    tag = low;
                    maxLength = high - low + 1;
                }
                low--;
                high++;
            }
        }
        for (int i = tag; i < tag + maxLength; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
