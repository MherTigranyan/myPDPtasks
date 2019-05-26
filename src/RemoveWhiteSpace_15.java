//Removal all white space from String

public class RemoveWhiteSpace_15 {
    public static void main(String[] args) {
        String str = "	 Hello    World  !	 ";
        String result = str.replaceAll("\\s","");
        System.out.println(result);
    }
}
