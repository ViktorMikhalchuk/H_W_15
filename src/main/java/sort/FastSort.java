package sort;

public class FastSort {
    public static void fastSort(int[] array) {
        recursionFastSort(array, 0, array.length - 1);
    }


    public static void recursionFastSort(int[] array, int min, int max) {
        if (array.length == 0)// умова виходу з рекурсії, як що довжина масиву рівна 0
            return;

        if (min >= max) //виходимо, так як нама чого ділити
            return;


        int middle = min + (max - min) / 2;  // вибираємо середину
        int middleElement = array[middle];


        int i = min, j = max;
        while (i <= j) {  // відносно елементу middle визначаємо менші елементи зліва,більші зправа
            while (array[i] < middleElement) {
                i++;
            }
            while (array[j] > middleElement) {
                j--;
            }

            if (i <= j) {      //міняємо місцями
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (min < j) // запускаємо рекурсію з елементами меншими middle
            recursionFastSort(array, min, j);

        if (max > i)// запускаємо рекурсію з елементами більшими ніж middle
            recursionFastSort(array, i, max);
    }
}
