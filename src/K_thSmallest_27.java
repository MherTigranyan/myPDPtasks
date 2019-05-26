//How to find kth smallest element in unsorted array?

public class K_thSmallest_27 {
    public static void main(String[] args) {
        int[] numbers = {1, 4545, 765, 4, 7, 856, 9};
        int k = 3;
        sort(numbers);
        System.out.println(numbers[k-1]);


    }
    static void sort(int arr[]) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
