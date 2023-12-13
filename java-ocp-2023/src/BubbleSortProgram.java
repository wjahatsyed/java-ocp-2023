/**
 * Created by Syed Wajahat on 3/25/2020.
 */
public class BubbleSortProgram {
    public static void main(String[] args) {
        int[] arr = {9, 8, 2, 6, 1, 3};
        bubbleSortFunction(arr);
    }

    public static void bubbleSortFunction(int[] arr) {
        int n = arr.length;
        int tmp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < n - 1; j++) {
                if (arr[j - 1] > arr[j]) {
                    tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }

        }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + ",");
        }

    }
}
