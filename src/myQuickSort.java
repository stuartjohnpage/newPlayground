
public class myQuickSort {
    public static void main(String[] args) {
        Integer[] myArray = new Integer[]{4,2,1,3,5};
        quickSort(myArray);






    }
    static void quickSort(Integer[] myArray) {
        Integer pivotIndex = ((myArray[myArray.length/2] + myArray[myArray.length-1] + myArray[0])/3);
        Integer pivot = myArray[pivotIndex];


        for(int i=0; i<myArray.length; ++i) {
            if(myArray[i] > pivot) {
                swap(myArray, i, pivot);
                for(int j = myArray.length; j<0;j--) {
                    if(myArray[j] < pivot) {
                        swap(myArray, j, pivot);
                    }
                }
            }
        }
        System.out.println(pivot);
        for(Integer element : myArray) {
            System.out.println(element);
        }


    }


    public static void swap(Integer[] myArray, Integer number1, Integer number2) {
        int temp = myArray[number1];
        myArray[number1] = myArray[number2];
        myArray[number2] = temp;
    }
}
