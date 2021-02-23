package Staircase;

public class Staircase {
    public static void main(String[] args) {

        int n = 3;
        int levelsToPrint = n;

        int counter = 1;
        for (int j = 0; j < n; j++) {

            for (int i = 0; i < levelsToPrint - 1; i++) {
                System.out.printf("%s", " ");
            }
            for (int i = 0; i < counter; i++) {
                System.out.print("#");
            }
            System.out.println();
            counter++;
            levelsToPrint--;
        }
    }
}
