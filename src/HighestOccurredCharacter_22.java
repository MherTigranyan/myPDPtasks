//How do you count a number of words in String?

public class HighestOccurredCharacter_22 {
    public static void main(String[] args) {
        String str = "hello world";
        int[] c = new int[256];
        int max = -1;
        for (int i = 0; i < str.length(); i++) {
            c[str.charAt(i)]++;
        }

        for (int i = 0; i < c.length; i++) {
            if (max < c[i]){
                max  = c[i];
            }
        }
        System.out.println(str.charAt(max));
    }
}
