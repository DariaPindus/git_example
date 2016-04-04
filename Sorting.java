package ua.od.pindus;

/**
 * Created by User on 04.04.2016.
 */
public class Sorting {

    public static void main(String[] args) {
        int[] a = {5, 1, 3, 2, 7};

        int[] sortedArray = InsertionSort(a);

        Utils.printArray(sortedArray);
    }

    public static int[] sort(int[] array) {
        int operations=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                operations++;
            }
        }
        System.out.println("Sort operations: "+operations);
        return array;
    }

    public static int[] InsertionSort(int[] arr) {
        int operations=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] <= arr[j])
                    break;
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;

                operations++;
            }
        }
        System.out.println("Insertion sort: "+ operations);
        return arr;
    }

    /*public static int[] SelectionSort(int[] arr){
        int operations=0;
        for (int i=0; )
    }*/

}
