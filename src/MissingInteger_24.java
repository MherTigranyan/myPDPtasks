//How to find the missing number in integer array of 1 to 10?

class MissingInteger_24 {
    static int getMissingInt(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++) {
            total -= a[i];
        }
        return total;
    }

    public static void main(String args[]) {
        int a[] = {1, 2, 4, 5, 6, 7, 8, 9, 10};
        int miss = getMissingInt(a, a.length-1);
        System.out.println(miss);
    }
}