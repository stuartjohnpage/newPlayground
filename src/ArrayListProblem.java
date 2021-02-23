import java.io.*;
import java.sql.SQLOutput;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrayListProblem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner newScanner = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arrayOfLines = new ArrayList<>();
        ArrayList<Integer> emptyField = new ArrayList();
        arrayOfLines.add(emptyField);
        Integer numberOfLines = newScanner.nextInt();


        for(int i = 0; i < numberOfLines; i++) {
            ArrayList<Integer> lineOfNumbers = new ArrayList<>();
            lineOfNumbers.add(0);
            int numberOfIntegersInLine = newScanner.nextInt();
            for(int j = 0; j<numberOfIntegersInLine; j++) {
                lineOfNumbers.add(newScanner.nextInt());
            }
            arrayOfLines.add(lineOfNumbers);
        }
        ArrayList<ArrayList<Integer>> arrayOfQueries = new ArrayList<>();
        Integer numberOfQueries = newScanner.nextInt();

        for(int i = 0; i< numberOfQueries; i++) {
            ArrayList<Integer> individualQuerys = new ArrayList<>();
            for(int j = 0; j<2; j++) {
                individualQuerys.add(newScanner.nextInt());
            }
            arrayOfQueries.add(individualQuerys);

        }
        for(int y = 0; y<numberOfQueries; y++) {
            try {
                Integer answer = arrayOfLines.get(arrayOfQueries.get(y).get(0)).get(arrayOfQueries.get(y).get(1));
                System.out.println(answer);
            }
            catch(Exception e) {
                System.out.println("ERROR!");
            }
        }
    }
}