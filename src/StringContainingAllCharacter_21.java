//How to find the smallest substring in a given string containing all characters of another string?

public class StringContainingAllCharacter_21 {
    public static void main(String[] args) {
        String str = "ajsdfjldkjghglsdja";
        String result = "";
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i)] = 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1){
                result = result + (char)i;
            }
        }
        System.out.println(result);
    }
}
