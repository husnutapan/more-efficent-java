package algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public int[] sort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public void printAll(int[] arr) {
        Arrays.stream(arr).forEach(System.out::println);
    }
    public static void main(String args[]) {
        BubbleSort ob = new BubbleSort();
        int arr[] = {64, 25, 12, 22, 13};
        ob.printAll(ob.sort(arr));
        System.out.println("Sorted array");
    }


}
