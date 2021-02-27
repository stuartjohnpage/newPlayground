package mockInterview;

public class technicalQuestion {
    public static void main(String[] args) {
        System.out.println("Hello Loz.");
    }
    /**
     * Takes an array of char and returns it, reversed.
     * @param input the string to reverse.
     * @return The string, reversed.
     */
    public String reverse(String input){
        String buffer = "";

        for(int i=0; i<=input.length(); i++){
            buffer += input.charAt(i);
        }
        return buffer;
    }
}
