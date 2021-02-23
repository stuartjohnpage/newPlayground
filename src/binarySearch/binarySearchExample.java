package binarySearch;

import java.util.ArrayList;
import java.util.Random;

public class binarySearchExample {
    public static void main(String[] args) {
        int randomGuessTotal = 0;
        int highLowGuessTotal = 0;
        int upperBound = 10;
        Random randNum = new Random();
        int hiddenNumber = randNum.nextInt(upperBound);

        for(int i = 0; i<1000; i++) {
            int randomGuess = randomGuesser(upperBound, hiddenNumber);
            int highLowGuess = highLowGuesser(upperBound, hiddenNumber);

            randomGuessTotal += randomGuess;
            highLowGuessTotal += highLowGuess;
        }
        System.out.println(randomGuessTotal);
        System.out.println(highLowGuessTotal);
    }
    public static int randomGuesser(int high, int numberToFind) {
        ArrayList<Integer> numbersGuessed = new ArrayList<>();
        Random randNum = new Random();
        int numberOfGuesses = 0;
        boolean foundNumber = false;
        while (!foundNumber) {
            int randomNumberPicked = randNum.nextInt(high);
            if (numbersGuessed.indexOf(randomNumberPicked) == -1) {
                numbersGuessed.add(randomNumberPicked);
            }
            numberOfGuesses++;
            if (randomNumberPicked == numberToFind) {
                foundNumber = true;
                return numberOfGuesses;
            }

        }
        return high;
    }
    public static int highLowGuesser(int high, int numberToFind) {
        ArrayList<Integer> numbersGuessed = new ArrayList<>();
        Random randNum = new Random();
        int numberOfGuesses = 0;
        boolean foundNumber = false;
        int low = 0;
        while(!foundNumber) {
            int randomNumberPicked = randNum.nextInt(high-low)+low;
            if (numbersGuessed.indexOf(randomNumberPicked) == -1) {
                numbersGuessed.add(randomNumberPicked);
            }
            numberOfGuesses++;
            if (randomNumberPicked == numberToFind) {
                foundNumber = true;

            } else {
                if (randomNumberPicked < numberToFind) {
                    low = randomNumberPicked;
                } else {
                    high = randomNumberPicked;
                }
            }
        }
        return numberOfGuesses;
    }
}
