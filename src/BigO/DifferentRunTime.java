package BigO;

import java.util.ArrayList;

public class DifferentRunTime {

    ArrayList<Long> listOfNumbers;

    public DifferentRunTime(ArrayList<Long> inputArray) {
        this.listOfNumbers = inputArray;
    }

    ArrayList<Long> linear() {
        ArrayList<Long> outputArray = new ArrayList<>();
        for (Long number : this.listOfNumbers) {
            outputArray.add(number);
        }
        return outputArray;
    }
    ArrayList<Long> quadratic() {
        ArrayList<Long> outputArray = new ArrayList<>();
        for (Long number : this.listOfNumbers) {
            outputArray.add(number * number);
        }
        return outputArray;
    }

    ArrayList<Long> toThePowerOfN() {
        ArrayList<Long> outputArray = new ArrayList<>();
        for (Long number : this.listOfNumbers) {
            outputArray.add(number*this.listOfNumbers.size());
        }
        return outputArray;
    }


    ArrayList<Long> factorialOnArray() {
        ArrayList<Long> outputArray = new ArrayList<>();

        for (Long number : this.listOfNumbers) {
            outputArray.add(factorialOnNumber(number));

        }
        return outputArray;

    }
    Long factorialOnNumber(Long inputNumber) {
        if(inputNumber == 1 || inputNumber == 0) {
            return 1l;
        }else
            return(factorialOnNumber(inputNumber-1)*inputNumber);
    }
}
