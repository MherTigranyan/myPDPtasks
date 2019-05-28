public class ReverseWordsOfSentence_5 {
    public static void main(String[] args) {
        String str = "Java is the best";
        String[] arr = str.split(" ");
        String result = "";
        for (int i = arr.length-1; i >= 0; i--) {
            result = result + " " + arr[i];
        }
        System.out.println(result);
    }
}
