package endOfFile;

import java.util.Scanner;

public class EndOfFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        while(scanner.hasNext() == true) {
            System.out.print(counter);
            System.out.print(scanner.nextLine());
        }
    }
}
