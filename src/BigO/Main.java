package BigO;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Long> numbersToTransform = new ArrayList<Long>();
        for (long i=0; i<100; i++) {
            numbersToTransform.add(i);
        }
        DifferentRunTime exampleOfRunTimes = new DifferentRunTime(numbersToTransform);
        System.out.println("Transform examples on the following array: " + numbersToTransform);
        System.out.println("An example of a linear transform: " + exampleOfRunTimes.linear());
        System.out.println("An example of a quadratic transform: " + exampleOfRunTimes.quadratic());
        System.out.println("An example of a to the power of N transform: " + exampleOfRunTimes.toThePowerOfN());
        System.out.println("An example of a factorial transform: " + exampleOfRunTimes.factorialOnArray());
    }
}
