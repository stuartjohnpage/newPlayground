package numWays;

import java.util.HashMap;

public class StaircaseProblem {
    public static void main(String[] args) {
//        Integer numberOfSteps = 45;
//
//
//        long startTime = System.nanoTime();
//        long endTime = System.nanoTime();
//        long duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
//        System.out.println("The execution for the slow method was : " + duration);
//
//
//
//        startTime = System.nanoTime();
//        endTime = System.nanoTime();
//        duration = (endTime - startTime);  //divide by 1000000 to get milliseconds.
//        System.out.println("The execution for the fast method was : " + duration);
//
//
        for(int i = 0; i<50; i++) {
            HashMap emptyMap = new HashMap();
            FastWay staircase = new FastWay(i, emptyMap);

            System.out.println("The number of ways you could go up a staircase with " + i + " steps would be: ");
//            Integer answer_slow = num_ways_slow(i);
            Integer answer_fast = num_ways_fast(staircase);
//            System.out.println(answer_slow);
            System.out.println(answer_fast);
        }
    }

    public static Integer num_ways_slow(Integer numberOfSteps) {
        if (numberOfSteps == 0) {
            return 1;
        } else if (numberOfSteps == 1) {
            return 1;
        } else {
            return num_ways_slow(numberOfSteps - 1) + num_ways_slow(numberOfSteps - 2);
        }
    }

    public static Integer num_ways_fast(FastWay staircase) {
        if (staircase.getNumberOfSteps() == 0 || staircase.getNumberOfSteps() == 1) {
            return 1;
        }
        try {
            return staircase.getStepsOfStaircase(staircase.numberOfSteps);
        }
        catch (Exception e) {
            FastWay minusOne = new FastWay(staircase.getNumberOfSteps()-1, staircase.dictionaryOfStep);
            FastWay minusTwo = new FastWay(staircase.getNumberOfSteps()-2, staircase.dictionaryOfStep);
            Integer result = num_ways_fast(minusOne) + num_ways_fast(minusTwo);
            staircase.dictionaryOfStep.put(staircase.numberOfSteps, result);
            return result;
        }
    }
}