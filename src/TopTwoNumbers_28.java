//How to find top two numbers from an integer array?

public class TopTwoNumbers_28 {
    static void topTwo(int arr[]) {
        int first, second;
        if (arr.length < 2) {
            System.out.println(" Invalid input ");
            return;
        }
        first = Integer.MIN_VALUE;
        second = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];

            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }
        if (second == Integer.MIN_VALUE) {
            System.out.println("There is no second top element");
        } else {
            System.out.println("the top element is " + first + " and second top element is " + second);
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 56, 99, 4, 3, 9};
        topTwo(arr);
    }
}
