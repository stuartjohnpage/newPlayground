package quickSort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[]{4,2,1,3,5};
        quickSort(myArray, 0, myArray.length-1);
        System.out.println(Arrays.toString(myArray));
    }

    static void quickSort(Integer[] myArr, int low, int high) {
        //check for empty or null array
        if(myArr == null || myArr.length == 0) return;
        if(low >= high) return;
        //Get the pivot element from the middle of the list
        int middle = low + (high - low)/2;
        int pivot = myArr[middle];

        // make left < pivot and right > pivot
        int li = low;
        int hi = high;

        while(li<= hi) {
            //Check until all values on left side array are lower than pivot
            while(myArr[li] < pivot) {
                li++;
            }
            //Check until all values on left side array are greater than pivot
            while(myArr[hi] > pivot) {
                hi--;
            }
            if (li<=hi) {
                swap(myArr, li, hi);
                li++;
                hi--;
            }
        }
        if(low<hi) quickSort(myArr, low, hi);
        if(high>li) quickSort(myArr, li, high);
    }
    public static void swap(Integer [] myArr, int x, int y) {
        int temp = myArr[x];
        myArr[x] = myArr[y];
        myArr[y] = temp;
    }
}
