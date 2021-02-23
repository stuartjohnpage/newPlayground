package numWays;

import java.util.HashMap;

public class FastWay {
    Long numberOfSteps;
    HashMap dictionaryOfStep;


    public FastWay(long numberOfSteps, HashMap dictionaryOfStep) {
        this.dictionaryOfStep = dictionaryOfStep;
        this.numberOfSteps = numberOfSteps;
    }

    public Long getNumberOfSteps() {
        return numberOfSteps;
    }

    public void setNumberOfSteps(long numberOfSteps) {
        this.numberOfSteps = numberOfSteps;
    }

    public Integer getStepsOfStaircase(long N) {
        return (int) dictionaryOfStep.get(N);
    }

    public void setDictionaryOfStep(HashMap dictionaryOfStep) {
        this.dictionaryOfStep = dictionaryOfStep;
    }

    @Override
    public String toString() {
        return "FastWay{" +
                "numberOfSteps=" + numberOfSteps +
                ", dictionaryOfStep=" + dictionaryOfStep +
                '}';
    }
}
