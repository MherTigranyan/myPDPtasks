//Write a program to check if a String contains another String e.g. indexOf()?

public class StringContainsAnotherString_19 {
    public static void main(String[] args) {
        String str1 = "Script";
        String str2 = "JavaScript";
        String s1 = "";
        String s2 = "";
        if (str1.length() < str2.length()){
            s1 = str1;
            s2 = str2;
        }

        int a = s1.length();
        int b = s2.length();
        boolean result = false;

        for (int i = 0; i <= b - a; i++) {
            int j;

            for (j = 0; j < a; j++) {
                if (s2.charAt(i + j) != s1.charAt(j))
                    break;
            }
            if (j == a) {
                result = true;
            }
        }

        System.out.println(result);
    }
}
