//How to find largest and smallest number in unsorted array?
public class MaxMinNumber_25 {
    public static void main(String[] args) {
        int[] numbers = {1, 4545, 765, 4, 7, 856, 9};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i]){
                max = numbers[i];
            }
            if (min > numbers[i]){
                min = numbers[i];
            }

        }
        System.out.println("largestNumber is " + max);
        System.out.println("smallestNumber is " + min);
    }
}
