//How to find sub array with maximum sum in an array of positive and negative number?
//        e.g. given the array [−2, 1, −3, 4, −1,2,1,−5,4],
//        the contiguous subarray [4,−1,2,1] has the largest sum = 6.

public class MaximunSumInArray_29 {
    public static void main(String[] args) {
        int a[] = { -2, 1, -3, 4, 1, 2, 1, -5, 1 };
        int size = a.length;
        int sum = Integer.MIN_VALUE,
                max_end = 0,
                start = 0,
                end = 0,
                s = 0;

        for (int i = 0; i < size; i++) {
            max_end += a[i];

            if (sum < max_end && checkHasNegative(a, s, i)) {
                    sum = max_end;
                    start = s;
                    end = i;
            }

            if (max_end < 0) {
                max_end = 0;
                s = i + 1;
            }
        }
        System.out.print("the contiguous subarray ");
        for (int i = start; i <= end; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
        System.out.println("has the largest sum = " + sum);
    }
    static boolean checkHasNegative(int[] str, int start, int end){
        boolean has = false;
        for (int i = start; i <= end; i++) {
            if (str[i] < 0){
                has = true;
            }
        }
        return has;
    }
}
