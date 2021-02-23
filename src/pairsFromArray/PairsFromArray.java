package pairsFromArray;

import java.util.ArrayList;
import java.util.Arrays;

public class PairsFromArray {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>(
                Arrays.asList(1,2,3,4,5,6,7,3,7,4,23,4,5,7,4,5,7,4,3,32,2,4,67,4,3,2,2,4,6,7,4,33,3,5,6,4,3,3,5,6,34));
        Integer totalSum = 8;

        long startTime = System.nanoTime();
        boolean quadAnswer = isPairQuadraticMethod(myArray,totalSum);
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
        System.out.println("The execution for the quad method was : " + duration);
        System.out.println(quadAnswer);

        startTime = System.nanoTime();
        boolean linAnswer = isPairLinearMethod(myArray, totalSum);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        System.out.println("The execution for the lin method was : " + duration);
        System.out.println(linAnswer);

    }

    public static boolean isPairQuadraticMethod(ArrayList<Integer> inputArray, Integer targetSum) {
        boolean isPair = false;
        for(int i=1;i<inputArray.size();i++) {
            int firstNumber = inputArray.get(i);
            for(int j=0;j<inputArray.size();j++) {
                if(j != i) {
                    int secondNumber = inputArray.get(j);
                    if(firstNumber + secondNumber == targetSum) {
                        isPair = true;
                    }
                }
            }
        }
        return isPair;
    }
    public static boolean isPairLinearMethod(ArrayList<Integer> inputArray, Integer targetSum) {
        boolean isPair = false;
        boolean notFinished = true;

        int lowIndex = 0;

        int highIndex = inputArray.size() - 1;


        while(notFinished) {
            int low = inputArray.get(lowIndex);
            int high = inputArray.get(highIndex);

            if(low + high == targetSum) {
                isPair = true;
                notFinished = false;
            } else if(lowIndex <= highIndex) {
                notFinished = false;

            }else{
                lowIndex += 1;
                highIndex -= 1;
            }
        }




        return isPair;
    }
}
