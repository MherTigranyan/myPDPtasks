//How do you count a number of words in String?

public class CountWordsOfString_22 {
    public static void main(String[] args) {
        String str = "java is the        best";
        boolean temp = false;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t'){
                temp = false;
            }else if (temp == false){
                temp = true;
                count++;
            }
        }
        System.out.println(count);
    }
}
