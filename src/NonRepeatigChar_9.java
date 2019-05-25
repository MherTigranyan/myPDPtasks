//The first non-repeated character of String

public class NonRepeatigChar_9 {
    public static void main(String[] args) {
        int arr[] = {6, 10, 3, 9, 4, 9, 5, 120, 4, 6, 10};
        int n = arr.length;
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    arr2[i] = 1;
                    arr2[j] = 1;
                }
            }
        }
        for (int k = 0; k < n; k++) {
            if (arr2[k] != 1){
                System.out.println("first not repeating element is " + arr[k]);
                break;
            }
        }
    }
}
