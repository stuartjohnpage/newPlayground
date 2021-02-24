package PalindromeFinder;

public class palindromeFinder {
    public static void main(String[] args) {
        String stringToCheck = "racecar";
        boolean isPalindrome = true;
        for(int i=0;i<(stringToCheck.length()/2);i++) {
            if(stringToCheck.charAt(i)!=stringToCheck.charAt(stringToCheck.length()-1-i)) {
                isPalindrome = false;
            }
        }
        System.out.println(isPalindrome);
    }
}
