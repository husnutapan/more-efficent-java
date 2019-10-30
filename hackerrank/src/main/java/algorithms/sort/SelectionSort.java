package algorithms.sort;

import java.util.Arrays;

public class SelectionSort {
    public int[] sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }


    public void printAll(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }

    // Driver code to test above
    public static void main(String args[]) {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64, 25, 12, 22, 11};
        ob.printAll(ob.sort(arr));
        System.out.println("Sorted array");
    }
}