//There is an array with every element repeated twice except one. Find that element?

public class NotRepeatingElement_26 {
    public static void main(String[] args) {
        int arr[] = {6, 10, 9, 4, 9, 120, 4, 6, 10};
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
                System.out.println("not repeating element is " + arr[k]);
            }
        }
    }
}
