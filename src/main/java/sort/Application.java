package sort;

import java.util.Arrays;

import static sort.FastSort.fastSort;
import static sort.QuickSort.quickSort;
import static sort.ShakerSort.shakerSort;

public class Application {
    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 5, 6};
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted array(quickSort): " + Arrays.toString(array));

        int[] testArr = new int[]{6, 3, 8, 8, 6, 9, 4, 11, 1};
        fastSort(testArr);
        System.out.print("FastSort: ");
        for (int i : testArr) {
            System.out.print(i +" ");
        }


        int[] array2 = {52, 23, 94, 12, 56, 68};
        shakerSort(array2);
        System.out.println("\nSorted array2(shakerSort): " + Arrays.toString(array2));
    }
}
