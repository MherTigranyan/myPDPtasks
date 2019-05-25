//Print repeated characters of String

import java.util.Scanner;

public class RepeatedCharacters_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char arr[] = str.toCharArray();
        char arr2[] = new char[arr.length/2];
        int c = 0;
        int n = arr.length;
        boolean exist = false;
        System.out.print("repeating character is ");
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++) {
                if (arr[i] == arr[j]) {
                    for (int k = 0; k < c; k++) {
                        if (arr2[k] == arr[j]){
                            exist = true;
                            break;
                        }

                    }
                    if (!exist){
                        arr2[c] = arr[j];
                        c++;
                    }
                    exist = false;
                }
            }
        }
        for (int i = 0; i < c; i++) {
            System.out.print(arr2[i] + ", ");
        }
    }
}
